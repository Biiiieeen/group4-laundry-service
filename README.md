# Group 4 Laundry Service Starter

Java Swing / MySQL group project starter for Apache NetBeans. A basic dashboard opens seven empty module windows. Every screen has matching .java and .form files. Teammates implement their assigned controls and functionality.

## Start here, team

Read these guides in order. Commands use Windows PowerShell and run inside the project folder unless stated otherwise.

1. [Setup guide](docs/SETUP.md): install tools, clone, open NetBeans, and configure Laragon/MySQL.
2. [Team work plan](docs/TEAM_PLAN.md): assignments, dependencies, package responsibilities, and completion checks.
3. [Contribution guide](CONTRIBUTING.md): create branches, save work, push, open pull requests, synchronize, and resolve problems.

Repository: [Biiiieeen/group4-laundry-service](https://github.com/Biiiieeen/group4-laundry-service). Clone this shared repository using the setup guide. Its folder name can differ from the Maven artifact name.

## Open and run

Use JDK 17 or newer. In NetBeans, choose File > Open Project and select this folder containing pom.xml. Clean and Build, then Run com.group4.laundry.Main. The dashboard works without MySQL. Maven downloads the JDBC dependency on the first build. Terminal users can run mvn clean verify and mvn exec:java.

The included nbactions.xml sets Run Project and Run File via main to com.group4.laundry.Main. Module forms have no individual main methods; use the dashboard to open them. If an already-open project still runs a literal ${packageClassName}, close and reopen this project, then use Run Project (F6). Project Properties > Run should show com.group4.laundry.Main as the Main Class.

## Source Packages

Folders below are under src/main/java. NetBeans displays them under Source Packages.

| Package | Contents | Purpose |
| --- | --- | --- |
| com.group4.laundry | Main.java | Start Swing on the event dispatch thread |
| com.group4.laundry.ui | Eight JFrame .java/.form pairs and package-info.java | Dashboard and module designs |
| com.group4.laundry.config | DatabaseConnection.java and package-info.java | Shared MySQL connection helper |
| com.group4.laundry.model | package-info.java | Reserved for classes representing database records |
| com.group4.laundry.dao | package-info.java | Reserved for database queries and CRUD |
| com.group4.laundry.service | package-info.java | Reserved for validation, calculations and transactions |

Each package-info.java explains the package and keeps it present in Git. Model, DAO and service implementations are left to teammates. SQL belongs in database; local connection settings belong in config, outside Source Packages.

## Module responsibilities

| Member | Form pair | Planned tables |
| --- | --- | --- |
| 1 | CustomerForm.java / CustomerForm.form (Customers) | customers |
| 2 | ServiceForm.java / ServiceForm.form (Services) | services |
| 3 | AddOnForm.java / AddOnForm.form (Add-ons) | add_ons |
| 4 | OrderForm.java / OrderForm.form (Orders) | orders, order_details, order_detail_add_ons |
| 5 | BillingForm.java / BillingForm.form (Billing) | orders, order_details, order_detail_add_ons, shop_policies |
| 6 | ProcessingForm.java / ProcessingForm.form (Processing) | orders, shop_policies |
| 7 | ShopPolicyForm.java / ShopPolicyForm.form (Shop Policies) | shop_policies |

Member 7 also coordinates MainDashboard.java / MainDashboard.form. Replace member numbers with your names. Customers manages customer records; Services manages prices and load capacity; Add-ons manages extra items; Orders manages bookings and details; Billing computes charges; Processing manages progress and pickup; Shop Policies manages storage terms. These describe future responsibilities, not implemented features.

Only dashboard navigation is implemented. Seven module canvases are empty. Closing a module leaves the dashboard open. There is no login, CRUD, payment handling or billing calculation yet.

## Manual NetBeans workflow

1. Right-click the appropriate source package > New > JFrame Form. NetBeans creates a Java/form pair. The named pairs are already supplied here.
2. Open your assigned Java file and select Design. Drag Panel, Label, Button, Text Field and Table controls from the Swing Palette.
3. Name controls and set labels using Properties. Double-click a button to generate its action handler. Leave generated blocks to GUI Builder.
4. Add data classes in model, SQL access in dao, and shared business logic in service. UI handlers call these classes. Future DAOs use DatabaseConnection.open(), prepared statements and try-with-resources.
5. Commit both files of every edited form. Coordinate shared dashboard and database changes.

## MySQL / Laragon

The database script reproduces the structure of the local laundry_db without records. Existing local databases do not need reimporting. For another workstation, select a new empty database in phpMyAdmin before importing database/laundry_database.sql. This is not a migration.

Copy config/database.properties.example to config/database.properties and enter local credentials. That file is ignored by Git. LAUNDRY_DB_URL, LAUNDRY_DB_USER and LAUNDRY_DB_PASSWORD override the respective settings. No module connects at startup. Never commit credentials or real customer records.

## Review checklist

Build the project, run the dashboard, check all seven buttons, and close each module. Open all eight pairs in NetBeans Design before presenting. Verify package names match this guide. Changes to main require a pull request and at least one approving collaborator review.

Suggested public repository description: Group 4 Java Swing and MySQL project starter with NetBeans JFrame forms, organized source packages, and module responsibilities.

## Main branch review rule

The main branch is protected by an active GitHub ruleset: pull requests require one approval, new changes dismiss stale approvals, and the latest reviewable push must be approved by someone other than its pusher. Force pushes and branch deletion are blocked. No bypass actors are configured. Invite teammates as collaborators so they can provide qualifying reviews; authors cannot approve their own pull requests. Repository administrators can edit repository settings, so retain this ruleset.
