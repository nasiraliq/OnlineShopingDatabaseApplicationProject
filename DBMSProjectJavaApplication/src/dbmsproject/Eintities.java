/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbmsproject;

/**
 *
 * @author User
 */
public class Eintities extends javax.swing.JFrame {

    /**
     * Creates new form Eintities
     */
    public Eintities() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Categories = new javax.swing.JButton();
        Customers = new javax.swing.JButton();
        Brands = new javax.swing.JButton();
        Products = new javax.swing.JButton();
        Stock = new javax.swing.JButton();
        Stores = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        OrderDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 204));
        jButton5.setText("Customers");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 182, 185));

        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        Categories.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Categories.setForeground(new java.awt.Color(0, 0, 255));
        Categories.setText("Categories");
        Categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriesActionPerformed(evt);
            }
        });

        Customers.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Customers.setForeground(new java.awt.Color(0, 0, 255));
        Customers.setText("Customers");
        Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomersActionPerformed(evt);
            }
        });

        Brands.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Brands.setForeground(new java.awt.Color(0, 0, 255));
        Brands.setText("Brands");
        Brands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandsActionPerformed(evt);
            }
        });

        Products.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Products.setForeground(new java.awt.Color(0, 0, 255));
        Products.setText("Products");
        Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsActionPerformed(evt);
            }
        });

        Stock.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Stock.setForeground(new java.awt.Color(0, 0, 255));
        Stock.setText("Stock");
        Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockActionPerformed(evt);
            }
        });

        Stores.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Stores.setForeground(new java.awt.Color(0, 0, 255));
        Stores.setText("Stores");
        Stores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoresActionPerformed(evt);
            }
        });

        Orders.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Orders.setForeground(new java.awt.Color(0, 0, 255));
        Orders.setText("Orders");
        Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersActionPerformed(evt);
            }
        });

        OrderDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        OrderDetails.setForeground(new java.awt.Color(0, 0, 255));
        OrderDetails.setText("Order Details");
        OrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderDetailsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("All Entities");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Stores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Categories, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Brands, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Orders, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Customers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Categories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Brands)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Products)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Orders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderDetails)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriesActionPerformed
        // TODO add your handling code here:
        new CategoriesOperation().setVisible(true);
        dispose();
    }//GEN-LAST:event_CategoriesActionPerformed

    private void CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomersActionPerformed
        // TODO add your handling code here:
        new Customers().setVisible(true);
        dispose();
    }//GEN-LAST:event_CustomersActionPerformed

    private void BrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandsActionPerformed
        // TODO add your handling code here:
        new Brands().setVisible(true);
        dispose();
    }//GEN-LAST:event_BrandsActionPerformed

    private void ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsActionPerformed
        // TODO add your handling code here:
        new Products().setVisible(true);
        dispose();
    }//GEN-LAST:event_ProductsActionPerformed

    private void StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockActionPerformed
        // TODO add your handling code here:
        new Stock().setVisible(true);
        dispose();
    }//GEN-LAST:event_StockActionPerformed

    private void StoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoresActionPerformed
        // TODO add your handling code here:
        new Stores().setVisible(true);
        dispose();
    }//GEN-LAST:event_StoresActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
        // TODO add your handling code here:
        new Orders().setVisible(true);
        dispose();
    }//GEN-LAST:event_OrdersActionPerformed

    private void OrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderDetailsActionPerformed
        // TODO add your handling code here:
        new OrderDetails().setVisible(true);
        dispose();
    }//GEN-LAST:event_OrderDetailsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Eintities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eintities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eintities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eintities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eintities().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Brands;
    private javax.swing.JButton Categories;
    private javax.swing.JButton Customers;
    private javax.swing.JButton OrderDetails;
    private javax.swing.JButton Orders;
    private javax.swing.JButton Products;
    private javax.swing.JButton Stock;
    private javax.swing.JButton Stores;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}