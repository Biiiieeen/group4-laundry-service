package com.group4.laundry.ui;
/** Shared empty Orders and Billing screen for HEDHREIN and SHANAIAH.
 * HEDHREIN coordinates form layout and order persistence; SHANAIAH owns billing
 * calculations and agrees on add-on/bill controls before editing this form pair.
 */

public class OrderForm extends javax.swing.JFrame {

    public OrderForm() {
        initComponents();
        setLocationRelativeTo(null);

        // Bold headers for the Service Lines table
        jtblServiceLines.getTableHeader().setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12)
        );

        // Bold headers for the Order Records table
        jTable1.getTableHeader().setFont(
            new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12)
        );
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ORDERMANAGEMENT = new javax.swing.JPanel();
        customer = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtWeight = new javax.swing.JTextField();
        ServiceaLines = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblServiceLines = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtSearchOrders = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ORDERMANAGEMENT1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbServiceLine = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbAddOn = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        lblUnitPrice = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        btnAddAddOn = new javax.swing.JButton();
        btnRemoveAddOn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAddOns = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtServiceSubtotal = new javax.swing.JTextField();
        txtAddOnSubtotal = new javax.swing.JTextField();
        txtStorageFee = new javax.swing.JTextField();
        txtTotalAmount = new javax.swing.JTextField();
        btnCalculateTotal = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orders & Billing | Group 4");

        ORDERMANAGEMENT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        ORDERMANAGEMENT.setPreferredSize(new java.awt.Dimension(520, 275));

        customer.setText("Customer:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Customer" }));

        jLabel2.setText("Shop Policy:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Policy" }));
        jComboBox2.addActionListener(this::jComboBox2ActionPerformed);

        jLabel3.setText("Laundry Service:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Service:" }));
        jComboBox3.addActionListener(this::jComboBox3ActionPerformed);

        jLabel4.setText("Weight (kg):");

        jButton1.setText("Add Service Line");

        txtWeight.setText("Enter weight (e.g., 3.5)");
        txtWeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWeightFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWeightFocusLost(evt);
            }
        });
        txtWeight.addActionListener(this::txtWeightActionPerformed);

        javax.swing.GroupLayout ORDERMANAGEMENTLayout = new javax.swing.GroupLayout(ORDERMANAGEMENT);
        ORDERMANAGEMENT.setLayout(ORDERMANAGEMENTLayout);
        ORDERMANAGEMENTLayout.setHorizontalGroup(
            ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ORDERMANAGEMENTLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ORDERMANAGEMENTLayout.createSequentialGroup()
                        .addGroup(ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 150, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(32, 32, 32))
        );
        ORDERMANAGEMENTLayout.setVerticalGroup(
            ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ORDERMANAGEMENTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ORDERMANAGEMENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ServiceaLines.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Service Lines", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        ServiceaLines.setPreferredSize(new java.awt.Dimension(1060, 145));

        jtblServiceLines.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtblServiceLines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Laundry Service", "Weight (kg)", "Unit Price", "Amount", "Add-Ons"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class, java.lang.Byte.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblServiceLines);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Edit Line");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Remove Line");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Clear Lines");

        javax.swing.GroupLayout ServiceaLinesLayout = new javax.swing.GroupLayout(ServiceaLines);
        ServiceaLines.setLayout(ServiceaLinesLayout);
        ServiceaLinesLayout.setHorizontalGroup(
            ServiceaLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceaLinesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ServiceaLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        ServiceaLinesLayout.setVerticalGroup(
            ServiceaLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceaLinesLayout.createSequentialGroup()
                .addGroup(ServiceaLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServiceaLinesLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1060, 190));

        jLabel5.setText("Search:");

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        txtSearchOrders.setText("Enter Order ID or Customer");
        txtSearchOrders.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchOrdersFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchOrdersFocusLost(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer", "Policy", "Total", "Order Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton5)
                    .addComponent(txtSearchOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("ORDER AND BILLING");

        ORDERMANAGEMENT1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add-Ons & Billing", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        ORDERMANAGEMENT1.setPreferredSize(new java.awt.Dimension(520, 275));

        jLabel6.setText("Service Line:");

        cmbServiceLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Service Line" }));

        jLabel7.setText("Add-On:");

        cmbAddOn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Add-On" }));

        jLabel8.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblUnitPrice.setText("Unit Price:");

        txtUnitPrice.setEditable(false);
        txtUnitPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUnitPrice.setText("0.00\n");

        btnAddAddOn.setText("Add Add-On");

        btnRemoveAddOn.setText("Remove Add-On");

        tblAddOns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Line", "Add-On", "Quantity", "Unit Price", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblAddOns);

        jLabel9.setText("Service Subtotal:");

        jLabel10.setText("Add-On Subtotal:");

        jLabel11.setText("Storage Fee:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Total Amount:");

        txtServiceSubtotal.setEditable(false);
        txtServiceSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtServiceSubtotal.setText("0.00");

        txtAddOnSubtotal.setEditable(false);
        txtAddOnSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAddOnSubtotal.setText("0.00");

        txtStorageFee.setEditable(false);
        txtStorageFee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStorageFee.setText("0.00");
        txtStorageFee.setToolTipText("");

        txtTotalAmount.setEditable(false);
        txtTotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTotalAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalAmount.setText("0.00");

        btnCalculateTotal.setText("Calculate Total");

        javax.swing.GroupLayout ORDERMANAGEMENT1Layout = new javax.swing.GroupLayout(ORDERMANAGEMENT1);
        ORDERMANAGEMENT1.setLayout(ORDERMANAGEMENT1Layout);
        ORDERMANAGEMENT1Layout.setHorizontalGroup(
            ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ORDERMANAGEMENT1Layout.createSequentialGroup()
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ORDERMANAGEMENT1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ORDERMANAGEMENT1Layout.createSequentialGroup()
                                .addComponent(btnAddAddOn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoveAddOn))
                            .addGroup(ORDERMANAGEMENT1Layout.createSequentialGroup()
                                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbServiceLine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbAddOn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(ORDERMANAGEMENT1Layout.createSequentialGroup()
                                        .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ORDERMANAGEMENT1Layout.createSequentialGroup()
                                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddOnSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtServiceSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStorageFee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ORDERMANAGEMENT1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCalculateTotal)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        ORDERMANAGEMENT1Layout.setVerticalGroup(
            ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ORDERMANAGEMENT1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbServiceLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbAddOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnitPrice)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddAddOn)
                    .addComponent(btnRemoveAddOn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtServiceSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAddOnSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStorageFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ORDERMANAGEMENT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculateTotal)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Save Order");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Edit Order");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Cancel Order");
        jButton8.addActionListener(this::jButton8ActionPerformed);

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("Refresh");
        jButton9.addActionListener(this::jButton9ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ServiceaLines, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ORDERMANAGEMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ORDERMANAGEMENT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ORDERMANAGEMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ORDERMANAGEMENT1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ServiceaLines, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtWeightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWeightFocusGained
     if (txtWeight.getText().equals("Enter weight (e.g. 3.5)")) {
    txtWeight.setText("");
      }   // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightFocusGained

    private void txtWeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWeightFocusLost
       if (txtWeight.getText().trim().isEmpty()) {
    txtWeight.setText("Enter weight (e.g. 3.5)");
} // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightFocusLost

    private void txtSearchOrdersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchOrdersFocusGained
      if (txtSearchOrders.getText().equals("Enter Order ID or Customer...")) {
    txtSearchOrders.setText("");
}  // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchOrdersFocusGained

    private void txtSearchOrdersFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchOrdersFocusLost
      if (txtSearchOrders.getText().trim().isEmpty()) {
    txtSearchOrders.setText("Enter Order ID or Customer...");
}  // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchOrdersFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ORDERMANAGEMENT;
    private javax.swing.JPanel ORDERMANAGEMENT1;
    private javax.swing.JPanel ServiceaLines;
    private javax.swing.JButton btnAddAddOn;
    private javax.swing.JButton btnCalculateTotal;
    private javax.swing.JButton btnRemoveAddOn;
    private javax.swing.JComboBox<String> cmbAddOn;
    private javax.swing.JComboBox<String> cmbServiceLine;
    private javax.swing.JLabel customer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jtblServiceLines;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblAddOns;
    private javax.swing.JTextField txtAddOnSubtotal;
    private javax.swing.JTextField txtSearchOrders;
    private javax.swing.JTextField txtServiceSubtotal;
    private javax.swing.JTextField txtStorageFee;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
