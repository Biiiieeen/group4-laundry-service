# Group 4 Laundry Service Starter

Java Swing / MySQL group project starter for Apache NetBeans. A basic dashboard opens six empty module windows. Every screen has matching .java and .form files. Teammates implement their assigned controls and functionality.

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
| com.group4.laundry.ui | Seven JFrame .java/.form pairs and package-info.java | Dashboard and module designs |
| com.group4.laundry.config | DatabaseConnection.java and package-info.java | Shared MySQL connection helper |
| com.group4.laundry.model | package-info.java | Reserved for classes representing database records |
| com.group4.laundry.dao | package-info.java | Reserved for database queries and CRUD |
| com.group4.laundry.service | package-info.java | Reserved for validation, calculations and transactions |

Each package-info.java explains the package and keeps it present in Git. Model, DAO and service implementations are left to teammates. SQL belongs in database; local connection settings belong in config, outside Source Packages.

## Module responsibilities

| Member | Form pair | Planned tables |
| --- | --- | --- |
| HENNIE | CustomerForm.java / CustomerForm.form (Customers) | customers |
| GHAB | ServiceForm.java / ServiceForm.form (Services) | services |
| CARRIE ANN | AddOnForm.java / AddOnForm.form (Add-ons) | add_ons |
| HEDHREIN | OrderForm.java / OrderForm.form (shared Orders & Billing) | orders, order_details, order_detail_add_ons |
| SHANAIAH | OrderForm.java / OrderForm.form (shared Orders & Billing) | orders, order_details, order_detail_add_ons, shop_policies |
| ANDRIE | ProcessingForm.java / ProcessingForm.form (Processing) | orders, shop_policies |
| VIN | ShopPolicyForm.java / ShopPolicyForm.form (Shop Policies) | shop_policies |

VIN also coordinates MainDashboard.java / MainDashboard.form. Customers manages customer records; Services manages prices and load capacity; Add-ons manages extra items; HEDHREIN and SHANAIAH share one OrderForm for bookings, details, extras and billing; Processing manages progress and pickup; Shop Policies manages storage terms. These describe future responsibilities, not implemented features.

Only dashboard navigation is implemented. Six module canvases are empty. Closing a module leaves the dashboard open. There is no login, CRUD, payment handling or billing calculation yet.

HEDHREIN coordinates edits to the shared OrderForm pair and owns the complete order transaction. SHANAIAH owns BillingService and the add-on/bill calculation logic used by that screen. Agree on the layout together and hand off form edits sequentially; do not edit the same .java/.form pair concurrently. There is no separate BillingForm. The shared canvas remains empty for the pair to implement. GHAB and CARRIE ANN keep separate catalog forms because services use per-kg pricing/capacity while add-ons use per-unit pricing/availability.

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

Build the project, run the dashboard, check all six buttons, and close each module. Open all seven pairs in NetBeans Design before presenting. Verify package names match this guide. Members submit pull requests for VIN’s final review before merging.

Suggested public repository description: Group 4 Java Swing and MySQL project starter with NetBeans JFrame forms, organized source packages, and module responsibilities.

## Leader review workflow

An active main-branch ruleset requires pull requests with one approving collaborator review, dismisses stale approvals after new changes, and requires approval of the latest reviewable push by someone other than its pusher. Force pushes and main deletion are blocked for non-exempt users. Biiiieeen (VIN) is the sole explicit always-bypass account and can merge without waiting for another approval. Members still submit PRs for VIN’s final review; the exception does not authorize members to bypass review. Keep changes small, explain actual checks, and coordinate shared form edits.
