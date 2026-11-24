# Team assignments and implementation order

The starter has a working navigation dashboard, six empty module forms, a connection helper and a seven-table schema. Planned functionality below remains for the team to implement. Assignments below use the agreed member names.

## Ownership and initial branches

| Member | Initial branch | Screen | Responsibility |
| --- | --- | --- | --- |
| 1 — HENNIE | `codex/customers` | CustomerForm | Customer creation, search, editing and safe deletion |
| 2 — GHAB | `codex/services` | ServiceForm | Service catalog, per-kg prices and capacities |
| 3 — CARRIE ANN | `codex/add-ons` | AddOnForm | Extra items, units, prices and availability |
| 4 — HEDHREIN | `codex/orders` | OrderForm (shared) | Bookings, service lines, atomic saves and shared-screen integration |
| 5 — SHANAIAH | `codex/billing` | OrderForm (shared) | Extra selections, shared charge calculation and bill display |
| 6 — ANDRIE | `codex/processing` | ProcessingForm | Status transitions, ready time and pickup |
| 7 — VN | `codex/policies-dashboard` | ShopPolicyForm, MainDashboard | Policies, shared navigation and integration coordination |

HEDHREIN and SHANAIAH share one Orders & Billing JFrame: OrderForm.java and OrderForm.form. HEDHREIN coordinates the form pair and owns the atomic order save; SHANAIAH owns BillingService and extra/bill calculation logic. Agree the layout/interfaces together. Implement supporting classes in separate files in parallel, but hand off form edits one member at a time after committing, reviewing, merging and synchronizing. Their initial branches remain separate; both contribute to the same screen. No separate BillingForm is used.

GHAB owns service catalog entries (price per kg and capacity). CARRIE ANN owns add-on catalog entries (price per unit and active availability). Their CRUD patterns are similar, but their data and responsibilities differ, so they retain separate forms.

Each member owns their module's supporting model, DAO and service classes too. These branches are naming assignments, not pre-created branches. Create them using CONTRIBUTING.md. Once merged, create a fresh branch for subsequent tasks. Agree on a single owner for each shared file/class; consult that owner before editing it.

## Order of work

1. **Everyone, coordinated by Member 7:** verify all machines build/run and use the same schema. Agree on screen conventions, rules and shared method inputs/outputs. Record decisions in an issue or this document before implementation.
2. **Member 1:** finish Customers end to end as the example. Include its form pair, Customer model, CustomerDAO and CustomerService. Review the approach as a team. Completion: create, search and edit fictional records; restart and verify persistence; check invalid input and referenced-record deletion handling.
3. **Members 2, 3 and 7 in parallel:** finish Services, Add-ons and Policies following that example. Completion: valid catalogs/policies can be saved, reloaded and used by orders. Prevent deleting records already referenced by orders.
4. **Members 4 and 5:** agree on the shared Orders & Billing screen and models. Member 4 completes booking/persistence while Member 5 builds extra validation and BillingService in separate files. Integrate edits to the form pair sequentially after the reference modules are ready. Save an order and all details/extras in one transaction. Completion: reload a multi-line order with extras after restart; simulate a failed save and confirm no partial order remains.
5. **Members 5 and 6 in parallel:** integrate billing into the shared OrderForm and complete Processing using saved orders and agreed rules. Member 5 owns the shared billing calculation; Processing calls it if required rather than duplicating it. Completion: OrderForm and ProcessingForm agree on the same order's values and permitted actions.
6. **Everyone, coordinated by Member 7:** run the whole workflow and resolve integration issues. Each member explains their code and supplies demonstration steps.

Everyone can design their own form early. Members 4/5/6 can agree on interfaces while the reference modules are being built; avoid independently inventing incompatible order models or SQL queries for shared behavior.

## Where files belong

| Package | Role | Current / future examples |
| --- | --- | --- |
| `com.group4.laundry` | Startup | Existing Main.java |
| `.ui` | Controls, display, event handlers | Existing seven Java/form pairs |
| `.config` | Shared connection setup | Existing DatabaseConnection.java |
| `.model` | Data carried between layers | Future Customer.java, Order.java |
| `.dao` | SQL and record retrieval/persistence | Future CustomerDAO.java, OrderDAO.java |
| `.service` | Validation, calculations, workflow/transaction coordination | Future CustomerService.java, BillingService.java |

The last five names extend the root `com.group4.laundry`. package-info.java documents each package; it is not the file for a module's implementation. SQL goes in the root database folder; local credentials stay in root config. NetBeans Source Packages maps to src/main/java. The `.form` file is design metadata; `.java` contains generated controls and application code. Save both together.

Suggested call flow: CustomerForm -> CustomerService -> CustomerDAO -> MySQL. Customer carries the values; CustomerDAO gets connections from DatabaseConnection. For a multi-table operation, the team must agree who owns a single transaction connection and pass it through participating DAOs; do not independently commit each detail insert.

## Conventions to agree and follow

- Keep the standard Swing look: ordinary buttons, labels, tables and panels. Match dashboard styling and use clear action names.
- Class names use PascalCase; variables/methods use camelCase. Example controls: txtCustomerName, btnSave, tblCustomers, cmbService, spnQuantity. Package names stay lowercase.
- Use meaningful method names such as findById, findAll, create and update. Agree on return types, model fields and expected errors before another member depends on a method. Do not create empty methods that pretend an operation succeeded.
- UI handlers delegate validation/rules and SQL to supporting classes. Use prepared statements and close JDBC resources. Run slow database operations off the Swing event thread and update controls safely through SwingWorker.
- Use BigDecimal for money. Agree on decimal scale and rounding. Check weights/capacities/quantities against the actual database types; do not copy assumptions from a different project.
- Preserve NetBeans generated blocks through Design editing. Give user-facing errors that are useful without exposing credentials or raw connection details.

## Decisions required before Orders/Billing/Processing

These are open team decisions, not already implemented rules:

| Decision | Members who must agree |
| --- | --- |
| Required fields, positive/nonnegative values, safe catalog deletion | All module owners |
| Per-kg vs per-load charging, add-on calculation and rounding | 2, 3, 4, 5 |
| Allowed statuses, transitions, editing and cancellation | 4, 6 |
| When to save price/capacity and policy snapshots | 4, 5, 6, 7 |
| Storage-fee start, free days, partial days and pickup cutoff | 5, 6, 7 |
| Bill calculation only vs recording payments and payment-gated pickup | 4, 5, 6, 7, with instructor requirements |

The current schema has no payments table. Do not claim payment tracking is implemented or require a paid balance for pickup without an agreed design and schema change. Preserve actual names such as orders.free_days_of_ready and orders.fee_per_day_if_ready.

## Database change policy

Do not edit a local table and assume Git shares that edit. Discuss the change, document it in the PR, and provide a reviewed forward migration under database/migrations when teammates already have databases. Agree on the next sequence number first. Test against a disposable database with fictional records. Document which migration each member must apply.

Keep the fresh-install schema consistent with approved migrations. Do not rerun the baseline CREATE TABLE script over an existing database, drop teammates' tables, or commit a dump of real data. A separate reviewed synthetic seed file can provide shared test data later. Database import requires table-creation rights; the application only needs its agreed operational permissions.

## Final demonstration and acceptance

Use fictional data to register a customer, configure a service/add-on/policy, place a multi-line order, process it, mark it ready, show the bill and complete the agreed pickup flow. Restart and verify persistence. Test invalid input, unavailable MySQL, failed transaction rollback and deletion of referenced records.

Before submission, verify all forms in NetBeans Design, include every Java/form pair, update README instructions and describe completed features honestly. The coordinator reviews integration; each member must understand and explain their own module.
