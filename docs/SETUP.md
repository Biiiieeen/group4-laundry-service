# First-time setup

## 1. Install and confirm your tools

You need a GitHub account, Git for Windows, Apache NetBeans with Java/Maven support, a compatible JDK, and Laragon running MySQL. Source compatibility is Java 17; NetBeans itself may require a newer JDK. Keep the project's compiler release at 17 and use the same agreed tool versions across the team. The SQL export comes from MySQL 8.4; use MySQL 8.4 for consistent imports rather than assuming MariaDB is interchangeable.

Open PowerShell and check:

```powershell
git --version
java -version
javac -version
```

If a command is missing, install the tool or fix PATH and reopen PowerShell. NetBeans includes Maven, so a separate Maven installation is optional. A terminal `mvn` command requires Maven on PATH; otherwise use NetBeans Clean and Build.

## 2. Get access and clone once

The leader must invite all members as collaborators. Accept your invitation before pushing. A public repository can be cloned by anyone, but public visibility does not grant write access. This team uses branches in one shared repository; members do not need to fork it.

Use the team repository URL below. On GitHub it is also available through Code > HTTPS.

Choose a parent folder outside another Git repository. Then run:

```powershell
git clone https://github.com/Biiiieeen/group4-laundry-service.git
cd group4-laundry-service
git rev-parse --show-toplevel
git remote -v
git status
```

Expected: the Git root is this project, origin points to your team's repository, and the working tree is clean. Clone once, then use fetch/pull for updates. Do not create another NetBeans project around the clone or copy a ZIP over your working files.

Configure your commit identity inside this repository:

```powershell
git config user.name "Your Name"
git config user.email "YOUR-GITHUB-EMAIL"
```

Use an email associated with your GitHub account, or its provided no-reply email if you prefer to keep your email private. These settings identify commits; they do not sign you in.

For HTTPS pushes, use Git Credential Manager's browser sign-in when prompted. GitHub account passwords are not used for Git authentication. Do not put tokens in remote URLs, source files, screenshots, or documentation. See [GitHub authentication](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/about-authentication-to-github).

## 3. Open and run the project

1. In NetBeans, select File > Open Project.
2. Select the cloned folder containing `pom.xml`.
3. Allow the first Maven build to download dependencies.
4. Right-click the project > Clean and Build.
5. Right-click the project > Run, or press F6 with the correct project selected.
6. Check that each dashboard button opens its empty module window.

Main class: `com.group4.laundry.Main`. All seven module forms are deliberately empty. Closing a module leaves the dashboard open; closing the dashboard exits the application. No MySQL connection is required for this navigation.

Open a module's Java file and choose Design to edit it with the Swing Palette. Its `.form` file must stay beside the Java file. The dashboard also has a matching form file.

If Maven is on PATH, the equivalent terminal commands are:

```powershell
mvn clean verify
mvn exec:java
```

The project does not package JDBC dependencies into a standalone JAR. Use NetBeans Run or `mvn exec:java` for the correct runtime classpath.

## 4. Prepare your local database

Git shares source and SQL files, not a running database. Every member has a separate local MySQL database unless the group deliberately configures a shared server. Use fictional test records.

1. Start MySQL from Laragon and open phpMyAdmin.
2. If your existing `laundry_db` already matches the supplied schema, keep it; do not reimport the script over existing tables.
3. For a new setup, create an empty database named `laundry_db`, select it, and import `database/laundry_database.sql`.
4. Confirm seven tables: `customers`, `services`, `add_ons`, `shop_policies`, `orders`, `order_details`, `order_detail_add_ons`.
5. The script contains table structure only. It has no customer records, CREATE DATABASE command, or DROP TABLE commands. It is not a migration and will fail if the tables already exist.

From the project root, create your own local configuration once:

```powershell
Copy-Item config/database.properties.example config/database.properties
```

Do not rerun that copy over settings you have already filled in. Open `config/database.properties` and enter your local URL, username and password:

```properties
db.url=jdbc:mysql://localhost:3306/laundry_db
db.user=YOUR-LOCAL-MYSQL-USER
db.password=YOUR-LOCAL-MYSQL-PASSWORD
```

Replace both placeholders. A genuinely empty password is represented by `db.password=`. Use the actual port if yours differs. Properties files interpret backslashes as escapes; double literal backslashes in values. The variables `LAUNDRY_DB_URL`, `LAUNDRY_DB_USER`, and `LAUNDRY_DB_PASSWORD` override corresponding file values, including an explicitly empty value.

Run from the project root because configuration is read relative to that directory. Each teammate keeps this file locally; `.gitignore` excludes it. Confirm:

```powershell
git check-ignore config/database.properties
git ls-files config/database.properties
```

The first command should print the path; the second should print nothing. `.gitignore` does not stop tracking a file that was already committed.

The starter does not include a connection-test button or completed DAO. The dashboard opening proves navigation works; it does not prove MySQL access. The first completed module must test an actual database operation using the connection helper.

## 5. Start your assigned branch

Continue with [CONTRIBUTING.md](../CONTRIBUTING.md) before editing files. Check [TEAM_PLAN.md](TEAM_PLAN.md) for your assignment and prerequisites.

## Setup problems

| Problem | What to check |
| --- | --- |
| `${packageClassName}` appears in a launch error | Close and reopen the project, use Run Project (F6), and confirm Project Properties > Run has `com.group4.laundry.Main`. Keep `nbactions.xml`. |
| Design tab missing or form fails to open | Open the Java file in NetBeans; confirm its matching `.form` is present and both files are from the same revision. |
| `mvn` is not recognized | Use NetBeans Clean and Build, or install/configure Maven for terminal use. |
| Unsupported Java release | Confirm Maven/NetBeans uses an appropriate JDK, rather than an old JRE. |
| MySQL connection refused | Start Laragon MySQL and check hostname/port. |
| Access denied to MySQL | Check your local username, password, grants and any overriding environment variables. |
| Unknown database/table | Select the correct server/database and import the schema only into a new empty database. |
| Unknown collation during import | Confirm you are using the agreed MySQL version; ask the leader before changing the shared SQL. |
| NetBeans opens several similar projects | Close unused copies and run the clone you are editing. |

When asking for help, include the command/action, relevant error, current branch, and what you expected. Remove credentials and real customer information from screenshots and logs.
