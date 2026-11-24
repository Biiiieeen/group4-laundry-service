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
        welcomeLabel = new javax.swing.JLabel();
        customerFormButton = new javax.swing.JButton();
        serviceFormButton = new javax.swing.JButton();
        addOnFormButton = new javax.swing.JButton();
        orderFormButton = new javax.swing.JButton();
        billingFormButton = new javax.swing.JButton();
        processingFormButton = new javax.swing.JButton();
        shopPolicyFormButton = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laundry Service Management System | Group 4");
        getContentPane().setLayout(new java.awt.BorderLayout());
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Laundry Service Management System");
        getContentPane().add(titleLabel, java.awt.BorderLayout.NORTH);
        navigationPanel.setLayout(new java.awt.GridLayout(7, 1, 0, 8));
        customerFormButton.setText("Customers");
        customerFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerFormButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(customerFormButton);
        serviceFormButton.setText("Services");
        serviceFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceFormButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(serviceFormButton);
        addOnFormButton.setText("Add-ons");
        addOnFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOnFormButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(addOnFormButton);
        orderFormButton.setText("Orders");
        orderFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderFormButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(orderFormButton);
        billingFormButton.setText("Billing");
        billingFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingFormButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(billingFormButton);
        processingFormButton.setText("Processing");
        processingFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processingFormButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(processingFormButton);
        shopPolicyFormButton.setText("Shop Policies");
        shopPolicyFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopPolicyFormButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(shopPolicyFormButton);
        getContentPane().add(navigationPanel, java.awt.BorderLayout.WEST);
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome. Select a module using the buttons on the left.");
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
    private void billingFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingFormButtonActionPerformed
        new BillingForm().setVisible(true);
    }//GEN-LAST:event_billingFormButtonActionPerformed
    private void processingFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processingFormButtonActionPerformed
        new ProcessingForm().setVisible(true);
    }//GEN-LAST:event_processingFormButtonActionPerformed
    private void shopPolicyFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopPolicyFormButtonActionPerformed
        new ShopPolicyForm().setVisible(true);
    }//GEN-LAST:event_shopPolicyFormButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JButton customerFormButton;
    private javax.swing.JButton serviceFormButton;
    private javax.swing.JButton addOnFormButton;
    private javax.swing.JButton orderFormButton;
    private javax.swing.JButton billingFormButton;
    private javax.swing.JButton processingFormButton;
    private javax.swing.JButton shopPolicyFormButton;
    // End of variables declaration//GEN-END:variables
}
