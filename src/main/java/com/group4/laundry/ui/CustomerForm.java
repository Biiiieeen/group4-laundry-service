package com.group4.laundry.ui;

import com.group4.laundry.model.Customer;
import com.group4.laundry.service.CustomerService;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CustomerForm extends javax.swing.JFrame {
    private final CustomerService customerService = new CustomerService();
   public CustomerForm() {
    initComponents();
    setLocationRelativeTo(null);
    loadCustomers();
}
   
private void loadCustomers() {

    DefaultTableModel model =
            (DefaultTableModel) tblCustomers.getModel();

    model.setRowCount(0);

    try {

        List<Customer> customers =
                customerService.getAllCustomers();

        for (Customer customer : customers) {

            model.addRow(new Object[]{
                customer.getCustomerId(),
                customer.getCustomerName(),
                customer.getContactNumber(),
                customer.getAddress()
            });
        }

    } catch (java.sql.SQLException e) {

        JOptionPane.showMessageDialog(this,
                "Unable to load customers: " + e.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customers | Group 4");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER MANAGEMENT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Customer Information");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Customer ID");

        txtCustomerId.setEditable(false);
        txtCustomerId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCustomerId.addActionListener(this::txtCustomerIdActionPerformed);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Customer Name");

        txtCustomerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCustomerName.addActionListener(this::txtCustomerNameActionPerformed);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Address");

        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.addActionListener(this::txtAddressActionPerformed);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Contact Number");

        txtContactNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContactNumber.addActionListener(this::txtContactNumberActionPerformed);

        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnClear.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(this::btnClearActionPerformed);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Customer Records");

        txtSearch.addActionListener(this::txtSearchActionPerformed);

        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Name", "Contact Number", "Address"
            }
        ));
        tblCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomers);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(155, 155, 155)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(btnAdd)
                                .add(18, 18, 18)
                                .add(btnUpdate)
                                .add(18, 18, 18)
                                .add(btnDelete)
                                .add(18, 18, 18)
                                .add(btnClear))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtCustomerId, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .add(txtContactNumber))
                        .add(18, 63, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(txtCustomerName)
                                    .add(txtAddress, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))))
                        .add(28, 28, 28))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, txtSearch)
                            .add(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtCustomerId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCustomerName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtContactNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAdd)
                    .add(btnUpdate)
                    .add(btnDelete)
                    .add(btnClear))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    try {
        String name = txtCustomerName.getText().trim();
        String contact = txtContactNumber.getText().trim();
        String address = txtAddress.getText().trim();

        Customer customer = new Customer(name, contact, address);

        if (customerService.addCustomer(customer)) {

            JOptionPane.showMessageDialog(this,
                    "Customer added successfully!");

            // Clear input fields
            txtCustomerId.setText("");
            txtCustomerName.setText("");
            txtContactNumber.setText("");
            txtAddress.setText("");

            // Refresh customer records table
            loadCustomers();
        }

    } catch (IllegalArgumentException e) {

        JOptionPane.showMessageDialog(this, e.getMessage());

    } catch (java.sql.SQLException e) {

        JOptionPane.showMessageDialog(this,
                "Database error: " + e.getMessage());
    }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void tblCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomersMouseClicked
        
    int selectedRow = tblCustomers.getSelectedRow();

    if (selectedRow != -1) {

        txtCustomerId.setText(
                tblCustomers.getValueAt(selectedRow, 0).toString());

        txtCustomerName.setText(
                tblCustomers.getValueAt(selectedRow, 1).toString());

        txtContactNumber.setText(
                tblCustomers.getValueAt(selectedRow, 2) == null
                ? ""
                : tblCustomers.getValueAt(selectedRow, 2).toString());

        txtAddress.setText(
                tblCustomers.getValueAt(selectedRow, 3) == null
                ? ""
                : tblCustomers.getValueAt(selectedRow, 3).toString());
    }

    }//GEN-LAST:event_tblCustomersMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
