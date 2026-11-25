package com.group4.laundry.ui;
/** Simple menu using standard Swing Palette components. */
public class MainDashboard extends javax.swing.JFrame {
    public MainDashboard() {
        initComponents();
        setSize(960, 520);
        setMinimumSize(new java.awt.Dimension(900, 520));
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
        overviewPanel = new javax.swing.JPanel();
        introPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        overviewSubtitle = new javax.swing.JLabel();
        summaryPanel = new javax.swing.JPanel();
        salesCard = new javax.swing.JPanel();
        salesCardTitle = new javax.swing.JLabel();
        salesCardBox = new javax.swing.JPanel();
        salesCardValue = new javax.swing.JLabel();
        salesCardDetail = new javax.swing.JLabel();
        ordersCard = new javax.swing.JPanel();
        ordersCardTitle = new javax.swing.JLabel();
        ordersCardBox = new javax.swing.JPanel();
        ordersCardValue = new javax.swing.JLabel();
        ordersCardDetail = new javax.swing.JLabel();
        processingCard = new javax.swing.JPanel();
        processingCardTitle = new javax.swing.JLabel();
        processingCardBox = new javax.swing.JPanel();
        processingCardValue = new javax.swing.JLabel();
        processingCardDetail = new javax.swing.JLabel();
        pickupCard = new javax.swing.JPanel();
        pickupCardTitle = new javax.swing.JLabel();
        pickupCardBox = new javax.swing.JPanel();
        pickupCardValue = new javax.swing.JLabel();
        pickupCardDetail = new javax.swing.JLabel();
        workflowPanel = new javax.swing.JPanel();
        workflowTitle = new javax.swing.JLabel();
        workflowSteps = new javax.swing.JPanel();
        bookingStep = new javax.swing.JLabel();
        processingStep = new javax.swing.JLabel();
        pickupStep = new javax.swing.JLabel();
        summaryNote = new javax.swing.JLabel();

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

        overviewPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        overviewPanel.setLayout(new java.awt.BorderLayout(0, 12));

        introPanel.setLayout(new java.awt.GridLayout(2, 1, 0, 5));
        welcomeLabel.setText("Daily Summary");
        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        introPanel.add(welcomeLabel);
        overviewSubtitle.setText("Select a module to manage laundry records.");
        overviewSubtitle.setFont(new java.awt.Font("Segoe UI", 0, 13));
        introPanel.add(overviewSubtitle);
        overviewPanel.add(introPanel, java.awt.BorderLayout.NORTH);

        summaryPanel.setLayout(new java.awt.GridLayout(2, 2, 14, 12));

        salesCard.setLayout(new java.awt.BorderLayout(0, 6));
        salesCardTitle.setText("Today's sales");
        salesCardTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        salesCard.add(salesCardTitle, java.awt.BorderLayout.NORTH);
        salesCardBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        salesCardBox.setLayout(new java.awt.GridLayout(2, 1, 0, 0));
        salesCardValue.setText("—");
        salesCardValue.setFont(new java.awt.Font("Segoe UI", 1, 28));
        salesCardValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesCardBox.add(salesCardValue);
        salesCardDetail.setText("Sales recorded today");
        salesCardDetail.setFont(new java.awt.Font("Segoe UI", 0, 12));
        salesCardDetail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesCardBox.add(salesCardDetail);
        salesCard.add(salesCardBox, java.awt.BorderLayout.CENTER);
        summaryPanel.add(salesCard);

        ordersCard.setLayout(new java.awt.BorderLayout(0, 6));
        ordersCardTitle.setText("Today's orders");
        ordersCardTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        ordersCard.add(ordersCardTitle, java.awt.BorderLayout.NORTH);
        ordersCardBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ordersCardBox.setLayout(new java.awt.GridLayout(2, 1, 0, 0));
        ordersCardValue.setText("—");
        ordersCardValue.setFont(new java.awt.Font("Segoe UI", 1, 28));
        ordersCardValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordersCardBox.add(ordersCardValue);
        ordersCardDetail.setText("Orders received today");
        ordersCardDetail.setFont(new java.awt.Font("Segoe UI", 0, 12));
        ordersCardDetail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordersCardBox.add(ordersCardDetail);
        ordersCard.add(ordersCardBox, java.awt.BorderLayout.CENTER);
        summaryPanel.add(ordersCard);

        processingCard.setLayout(new java.awt.BorderLayout(0, 6));
        processingCardTitle.setText("In processing");
        processingCardTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        processingCard.add(processingCardTitle, java.awt.BorderLayout.NORTH);
        processingCardBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        processingCardBox.setLayout(new java.awt.GridLayout(2, 1, 0, 0));
        processingCardValue.setText("—");
        processingCardValue.setFont(new java.awt.Font("Segoe UI", 1, 28));
        processingCardValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processingCardBox.add(processingCardValue);
        processingCardDetail.setText("Orders being washed, dried or folded");
        processingCardDetail.setFont(new java.awt.Font("Segoe UI", 0, 12));
        processingCardDetail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processingCardBox.add(processingCardDetail);
        processingCard.add(processingCardBox, java.awt.BorderLayout.CENTER);
        summaryPanel.add(processingCard);

        pickupCard.setLayout(new java.awt.BorderLayout(0, 6));
        pickupCardTitle.setText("Ready for pickup");
        pickupCardTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        pickupCard.add(pickupCardTitle, java.awt.BorderLayout.NORTH);
        pickupCardBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pickupCardBox.setLayout(new java.awt.GridLayout(2, 1, 0, 0));
        pickupCardValue.setText("—");
        pickupCardValue.setFont(new java.awt.Font("Segoe UI", 1, 28));
        pickupCardValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pickupCardBox.add(pickupCardValue);
        pickupCardDetail.setText("Orders awaiting collection");
        pickupCardDetail.setFont(new java.awt.Font("Segoe UI", 0, 12));
        pickupCardDetail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pickupCardBox.add(pickupCardDetail);
        pickupCard.add(pickupCardBox, java.awt.BorderLayout.CENTER);
        summaryPanel.add(pickupCard);
        overviewPanel.add(summaryPanel, java.awt.BorderLayout.CENTER);

        workflowPanel.setLayout(new java.awt.BorderLayout(0, 8));
        workflowTitle.setText("Laundry Workflow");
        workflowTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        workflowPanel.add(workflowTitle, java.awt.BorderLayout.NORTH);
        workflowSteps.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        workflowSteps.setLayout(new java.awt.GridLayout(1, 3, 12, 0));
        bookingStep.setText("<html><b>1. Book an order</b><br>Customer, services &amp; billing</html>");
        bookingStep.setFont(new java.awt.Font("Segoe UI", 0, 13));
        bookingStep.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        workflowSteps.add(bookingStep);
        processingStep.setText("<html><b>2. Process laundry</b><br>Wash, dry &amp; fold</html>");
        processingStep.setFont(new java.awt.Font("Segoe UI", 0, 13));
        processingStep.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        workflowSteps.add(processingStep);
        pickupStep.setText("<html><b>3. Complete pickup</b><br>Mark ready &amp; claimed</html>");
        pickupStep.setFont(new java.awt.Font("Segoe UI", 0, 13));
        pickupStep.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        workflowSteps.add(pickupStep);
        workflowPanel.add(workflowSteps, java.awt.BorderLayout.CENTER);
        summaryNote.setText("Summary values will appear when records are available.");
        summaryNote.setFont(new java.awt.Font("Segoe UI", 0, 12));
        workflowPanel.add(summaryNote, java.awt.BorderLayout.SOUTH);
        overviewPanel.add(workflowPanel, java.awt.BorderLayout.SOUTH);
        getContentPane().add(overviewPanel, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JPanel introPanel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel overviewSubtitle;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JPanel salesCard;
    private javax.swing.JLabel salesCardTitle;
    private javax.swing.JPanel salesCardBox;
    private javax.swing.JLabel salesCardValue;
    private javax.swing.JLabel salesCardDetail;
    private javax.swing.JPanel ordersCard;
    private javax.swing.JLabel ordersCardTitle;
    private javax.swing.JPanel ordersCardBox;
    private javax.swing.JLabel ordersCardValue;
    private javax.swing.JLabel ordersCardDetail;
    private javax.swing.JPanel processingCard;
    private javax.swing.JLabel processingCardTitle;
    private javax.swing.JPanel processingCardBox;
    private javax.swing.JLabel processingCardValue;
    private javax.swing.JLabel processingCardDetail;
    private javax.swing.JPanel pickupCard;
    private javax.swing.JLabel pickupCardTitle;
    private javax.swing.JPanel pickupCardBox;
    private javax.swing.JLabel pickupCardValue;
    private javax.swing.JLabel pickupCardDetail;
    private javax.swing.JPanel workflowPanel;
    private javax.swing.JLabel workflowTitle;
    private javax.swing.JPanel workflowSteps;
    private javax.swing.JLabel bookingStep;
    private javax.swing.JLabel processingStep;
    private javax.swing.JLabel pickupStep;
    private javax.swing.JLabel summaryNote;
    // End of variables declaration//GEN-END:variables
}
