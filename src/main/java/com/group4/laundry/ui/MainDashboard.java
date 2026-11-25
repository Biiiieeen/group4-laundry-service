package com.group4.laundry.ui;
/** Simple menu using standard Swing Palette components. */
public class MainDashboard extends javax.swing.JFrame {
    public MainDashboard() {
        initComponents();
        setSize(960, 600);
        setMinimumSize(new java.awt.Dimension(800, 480));
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        navigationPanel = new javax.swing.JPanel();
        customerFormButton = new javax.swing.JButton();
        serviceFormButton = new javax.swing.JButton();
        addOnFormButton = new javax.swing.JButton();
        orderFormButton = new javax.swing.JButton();
        processingFormButton = new javax.swing.JButton();
        shopPolicyFormButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laundry Service Management System | Group 4");

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Laundry Service Management System");
        titleLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 10, 10));
        getContentPane().add(titleLabel, java.awt.BorderLayout.NORTH);

        navigationPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        navigationPanel.setLayout(new java.awt.GridLayout(6, 1, 0, 8));

        customerFormButton.setText("Customers");
        customerFormButton.addActionListener(this::customerFormButtonActionPerformed);
        navigationPanel.add(customerFormButton);

        serviceFormButton.setText("Services");
        serviceFormButton.addActionListener(this::serviceFormButtonActionPerformed);
        navigationPanel.add(serviceFormButton);

        addOnFormButton.setText("Service Add-ons");
        addOnFormButton.addActionListener(this::addOnFormButtonActionPerformed);
        navigationPanel.add(addOnFormButton);

        orderFormButton.setText("Orders & Billing");
        orderFormButton.addActionListener(this::orderFormButtonActionPerformed);
        navigationPanel.add(orderFormButton);

        processingFormButton.setText("Processing");
        processingFormButton.addActionListener(this::processingFormButtonActionPerformed);
        navigationPanel.add(processingFormButton);

        shopPolicyFormButton.setText("Shop Policies");
        shopPolicyFormButton.addActionListener(this::shopPolicyFormButtonActionPerformed);
        navigationPanel.add(shopPolicyFormButton);

        getContentPane().add(navigationPanel, java.awt.BorderLayout.WEST);

        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome! Select a module to begin.");
        getContentPane().add(welcomeLabel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void customerFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerFormButtonActionPerformed
        new CustomerForm().setVisible(true);
    }//GEN-LAST:event_customerFormButtonActionPerformed
    private void serviceFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceFormButtonActionPerformed
        new ServiceForm().setVisible(true);
    }//GEN-LAST:event_serviceFormButtonActionPerformed
    private void addOnFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOnFormButtonActionPerformed
        new AddOnForm().setVisible(true);
    }//GEN-LAST:event_addOnFormButtonActionPerformed
    private void orderFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderFormButtonActionPerformed
        new OrderForm().setVisible(true);
    }//GEN-LAST:event_orderFormButtonActionPerformed
    private void processingFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processingFormButtonActionPerformed
        new ProcessingForm().setVisible(true);
    }//GEN-LAST:event_processingFormButtonActionPerformed
    private void shopPolicyFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopPolicyFormButtonActionPerformed
        new ShopPolicyForm().setVisible(true);
    }//GEN-LAST:event_shopPolicyFormButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOnFormButton;
    private javax.swing.JButton customerFormButton;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JButton orderFormButton;
    private javax.swing.JButton processingFormButton;
    private javax.swing.JButton serviceFormButton;
    private javax.swing.JButton shopPolicyFormButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
