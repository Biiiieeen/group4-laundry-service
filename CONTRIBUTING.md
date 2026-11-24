# Team Git and GitHub workflow

Read [setup](docs/SETUP.md) first. Examples use PowerShell from your clone's root. `codex/customers` is the example task branch; substitute your assigned branch. Commands below are instructions for members, not actions already performed by the starter.

## What the terms mean

| Term | Meaning |
| --- | --- |
| Clone | Download a working copy and Git history from the team's repository. |
| `main` | Shared reviewed version of the project. |
| Branch | A separate line of work inside the repository. |
| Stage / `git add` | Choose which changes the next commit will contain. |
| Commit | Record a snapshot locally with a message. |
| Push | Upload local commits to a remote branch. |
| Fetch | Download remote history without changing your working files. |
| Pull | Fetch and integrate updates into your current branch. |
| Pull request (PR) | Ask the team to review and merge a branch. |
| Merge | Combine changes from another branch. |
| `origin` | The usual name for your clone's GitHub remote. |

Saving in NetBeans does not commit. Committing does not push. Pushing a task branch does not update `main` until a PR is merged. GitHub documents the workflow in [Writing code for a project](https://docs.github.com/en/pull-requests/concepts/writing-code-for-a-project).

## Leader: publish and prepare the shared repository

The repository is [Biiiieeen/group4-laundry-service](https://github.com/Biiiieeen/group4-laundry-service). Members should skip this initial-publication reference and start at step 1 after cloning. Only the leader performs initial publication, once. Use an empty public repository named `group4-laundry-service`, without a generated README, .gitignore or license, because local files already exist. Suggested description: "Group 4 Java Swing and MySQL starter with editable NetBeans JFrame forms, organized source packages, and a team contribution guide."

Start from the `laundry-service-starter` directory, not its parent workspace. Before running `git init`, check that the current directory really contains this starter's `pom.xml`, README and src folder. Initializing here creates a separate project repository even if the surrounding workspace has its own Git repository; keep all Git commands inside this project afterward. Existing Git repositories do not need a second initialization.

For this starter's first publication:

```powershell
git init -b main
git rev-parse --show-toplevel
git status --short
```

The reported root must end in `laundry-service-starter`. Configure your name/email as described in setup. Stage the intended project files explicitly:

```powershell
git add .gitignore pom.xml nbactions.xml README.md CONTRIBUTING.md src database docs .github config/database.properties.example
git diff --cached --stat
git diff --cached
git status
```

Check that no local credentials, records or `target` files are staged. The configured team remote is:

```powershell
git commit -m "Create laundry service team starter"
git remote add origin https://github.com/Biiiieeen/group4-laundry-service.git
git push -u origin main
```

If origin already exists, inspect `git remote -v` rather than adding it again or overwriting it blindly. If the remote already has commits, stop and reconcile the histories with the leader; do not force-push.

Invite teammates through repository Settings > Collaborators and have them accept. See [GitHub's collaborator instructions](https://docs.github.com/en/repositories/managing-your-repositorys-settings-and-features/repository-access-and-collaboration/inviting-collaborators-to-a-personal-repository). Share the URL and assign member names in the work plan. An active main-branch ruleset requires pull requests with one approving collaborator review, dismisses stale approvals after new changes, and requires approval of the latest reviewable push by someone other than its pusher. Force pushes and main deletion are blocked for non-exempt users. Biiiieeen (VIN) is the sole explicit always-bypass account and can merge without waiting for another approval. Members still submit PRs for VIN’s final review; the exception does not authorize members to bypass review. Do not merge without the leader’s review or force-push shared work. Do not make a build check mandatory until an actual CI workflow exists.

## 1. Create a task branch before editing

Start with a clean working tree. If you have unfinished edits, follow the unfinished-work section below before switching branches.

```powershell
git status
git switch main
git pull --ff-only origin main
git switch -c codex/customers
git branch --show-current
```

Expected current branch: `codex/customers`. `-c` creates a branch only once. On later days use `git switch codex/customers`. If the branch already exists on GitHub but not locally, first run `git fetch origin`, then `git switch --track origin/codex/customers`.

Assigned initial branches are listed in the work plan. After a task is merged, start a new branch from updated `main`, for example `codex/customers-search`. Do not keep adding work to a branch whose PR has already been merged.

## 2. Synchronize before continuing a task

With your changes committed and working tree clean, update your current task branch from GitHub and then incorporate shared work:

```powershell
git switch codex/customers
git status
git fetch origin
```

If your task branch has already been pushed, also run this command to incorporate any commits made to that same remote branch:

```powershell
git merge origin/codex/customers
```

Then incorporate shared changes:

```powershell
git merge origin/main
```

Handle any conflict before continuing. On a branch that has never been pushed, skip merging `origin/codex/customers` because it does not exist yet. Do not edit another member's branch without coordinating with them.

## 3. Implement and check your work

Edit only the files needed for your task. A module may include its own form pair, model, DAO and service classes. Coordinate any shared-file changes first. Follow the packages and screen conventions in [the work plan](docs/TEAM_PLAN.md).

Save files, run NetBeans Clean and Build, run the project, exercise the feature, and open edited screens in Design. Alternatively use `mvn clean verify` when Maven is on PATH. There are no automated tests in the starter; a successful build alone does not verify module behavior.

Check actual persistence by closing/reopening the application. Test invalid input and database failures. Describe the checks in your PR.

## 4. Stage and commit a small, coherent change

Inspect first:

```powershell
git status
git diff
```

Stage the files you actually changed. For a Customers layout change:

```powershell
git add src/main/java/com/group4/laundry/ui/CustomerForm.java src/main/java/com/group4/laundry/ui/CustomerForm.form
```

When newly implemented, also stage each relevant supporting file explicitly, for example `git add src/main/java/com/group4/laundry/model/Customer.java`. Do not run an example for a file you have not created. Stage both members of a changed form pair. SQL migrations and documentation also need staging if part of your task.

Review the staged content, then commit:

```powershell
git diff --cached --stat
git diff --cached
git commit -m "Add customer registration form and validation"
git status
```

Write a message describing the actual change. If Git says nothing to commit, check whether you saved and staged your edits. To unstage an accidentally selected file without deleting your edits, use `git restore --staged path/to/file`.

## 5. Push your branch

First push:

```powershell
git push -u origin codex/customers
```

This uploads the branch and sets its upstream. Later pushes from that branch can use:

```powershell
git push
```

Confirm GitHub shows your latest commit on your task branch. Do not push your feature directly to `main` and do not force-push shared branches.

## 6. Open a pull request

1. Open the repository on GitHub and select Compare & pull request, or Pull requests > New pull request.
2. Set the base to `main` and compare to your task branch, such as `codex/customers`.
3. Give the PR a clear title. Fill in the supplied template: behavior added, manual checks, and any database/shared-code changes.
4. Review Files changed. Confirm no unrelated module changes, local credentials, real records or build output are included. Include both form files.
5. Ask VIN to review. A draft PR is appropriate for unfinished work; mark it ready when complete.
6. Make requested corrections locally, commit, and push to the same branch. The open PR updates automatically.

Pushing work does not mean it is approved. Before merge, the reviewer checks code/package placement, builds the branch, checks the feature and its Design view, and verifies that integration still works. VIN has final review and merge authority, preferably using a merge commit for this team’s straightforward history. Members should not merge their own PRs without the leader’s authorization.

## 7. After your PR is merged

With no uncommitted edits:

```powershell
git switch main
git pull --ff-only origin main
git switch -c codex/customers-search
```

The final command is an example next task; choose a new descriptive branch name. Retain an old local branch until its work is verified on `main`. Deletion is optional and is not required to continue.

Other members with an active task incorporate the updated `origin/main` using step 2. They should not clone again or copy files manually between branches.

## Unfinished work and conflicts

### You need to stop or switch branches

Save files. Prefer a local commit on your task branch; a clearly labeled WIP commit can preserve unfinished code, but it must not be merged before review. Push it to back it up, and use a draft PR if appropriate.

If you cannot commit yet, this alternative temporarily sets aside tracked and untracked edits:

```powershell
git stash push -u -m "Unfinished customer changes"
```

Ignored local configuration is excluded. Before restoring, return to the original task branch and ensure the working tree is clean:

```powershell
git stash list
git stash apply 'stash@{0}'
git status
```

Choose the correct stash entry rather than assuming the newest is yours. `apply` retains the stash as a backup. Resolve any conflicts, verify your files, and only then optionally drop that specific stash. Stashes stay on your computer; pushing does not back them up.

### Git reports a merge conflict

1. Run `git status` to identify affected files. Coordinate with their owner.
2. For ordinary Java/docs, review both changes, edit the correct combined result, and remove conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`). Keep intended behavior from both sides.
3. For generated GUI code or `.form` files, stop and work with the form owner. Treat Java/form as a matched pair. Use a coherent pair as the starting point and reapply the other intended layout changes in NetBeans Design. Do not accept all of one side without checking what work it discards.
4. Stage each resolved file and its matching form where relevant, inspect `git diff --cached`, build and test.
5. Complete the merge with `git commit`, then `git push` if the branch is already published.

If you started the merge with a clean tree and want to return to the pre-merge state, use `git merge --abort` before committing the merge. Do not use hard resets or delete the clone to fix a conflict. See [GitHub's merge conflict guide](https://docs.github.com/en/pull-requests/how-tos/merge-and-close-pull-requests/resolving-a-merge-conflict-using-the-command-line).

## Common Git problems

| Message/situation | Response |
| --- | --- |
| Permission denied / HTTP 403 on push | Accept the collaborator invitation and sign in as the invited account. Public visibility alone does not grant write access. |
| Repository not found | Check the repository URL and account access. |
| Push rejected / non-fast-forward | Commit local edits, fetch, merge the matching `origin/your-branch`, resolve conflicts and push again. Do not force-push. |
| `git pull --ff-only` fails on main | Local main has diverged; preserve your work and ask the coordinator to reconcile it. Do not reset it blindly. |
| Local changes would be overwritten | Commit on your task branch or stash before switching/merging. |
| Branch already exists | Use `git switch branch-name`; `-c` is only for creating it. |
| No upstream branch | Use the first-push form: `git push -u origin your-branch`. |
| Git opens a commit-message editor | Complete/save the message in the editor, or use `git commit -m "Merge main into customer branch"` when finishing a resolved merge. |
| Work accidentally committed on main | Stop before pushing. Ask the coordinator to preserve those commits on a task branch and restore the agreed main history. |
| Password/token accidentally committed | Revoke/rotate it immediately and notify the coordinator. Removing it in a later commit does not erase it from history. |

## Before asking for a merge

- [ ] Branch is based on the current shared work; conflicts are resolved.
- [ ] Feature builds and works through the dashboard.
- [ ] Changed forms open in Design and include matching Java/form files.
- [ ] Relevant data saves and reloads; validation and failure behavior checked.
- [ ] Database changes are agreed, documented, and reproducible on another workstation.
- [ ] No credentials, real records or generated build files are included.
- [ ] Documentation reflects the current feature and remaining limitations.
- [ ] VIN reviewed the PR and authorized merging.
