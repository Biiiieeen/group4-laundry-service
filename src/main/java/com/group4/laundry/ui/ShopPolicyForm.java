package com.group4.laundry.ui;
/** Empty module. Planned tables: shop_policies. */
public class ShopPolicyForm extends javax.swing.JFrame {
    public ShopPolicyForm() {
        initComponents();
        javax.swing.table.TableCellRenderer headerRenderer =
                jTable1.getTableHeader().getDefaultRenderer();
        jTable1.getTableHeader().setDefaultRenderer((table, value, selected, focused, row, column) -> {
            java.awt.Component header = headerRenderer.getTableCellRendererComponent(
                    table, value, selected, focused, row, column);
            if (header instanceof javax.swing.JLabel label) {
                label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            }
            return header;
        });
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlPolicyDetails = new javax.swing.JPanel();
        lblFreeStorageDays1 = new javax.swing.JLabel();
        txtPolicyName = new javax.swing.JTextField();
        lblFreeStorageDays = new javax.swing.JLabel();
        txtFreeStorageDays = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shop Policies | Group 4");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("SHOP POLICIES\n");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        getContentPane().add(jLabel1);

        pnlPolicyDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Policy Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14)));
        pnlPolicyDetails.setLayout(new java.awt.GridLayout(0, 2, 12, 8));

        lblFreeStorageDays1.setText("Policy name:");
        pnlPolicyDetails.add(lblFreeStorageDays1);
        pnlPolicyDetails.add(txtPolicyName);

        lblFreeStorageDays.setText("Free storage days:");
        pnlPolicyDetails.add(lblFreeStorageDays);
        pnlPolicyDetails.add(txtFreeStorageDays);

        jLabel2.setText("Reminder after (days):");
        pnlPolicyDetails.add(jLabel2);
        pnlPolicyDetails.add(jTextField1);

        jLabel3.setText("Storage fee per day:");
        pnlPolicyDetails.add(jLabel3);
        pnlPolicyDetails.add(jTextField2);

        jLabel4.setText("Review after (days):");
        pnlPolicyDetails.add(jLabel4);
        pnlPolicyDetails.add(jTextField3);

        getContentPane().add(pnlPolicyDetails);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Policy name", "Free days", "Reminder days", "Fee per day", "Review days"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);

        jButton1.setText("Add Policy");
        jPanel1.add(jButton1);

        jButton2.setText("Update Policy");
        jPanel1.add(jButton2);

        jButton3.setText("Clear");
        jPanel1.add(jButton3);

        jButton4.setText("Refresh");
        jPanel1.add(jButton4);

        getContentPane().add(jPanel1);

        setSize(new java.awt.Dimension(455, 480));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblFreeStorageDays;
    private javax.swing.JLabel lblFreeStorageDays1;
    private javax.swing.JPanel pnlPolicyDetails;
    private javax.swing.JTextField txtFreeStorageDays;
    private javax.swing.JTextField txtPolicyName;
    // End of variables declaration//GEN-END:variables
}
