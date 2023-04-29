/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbmsproject;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;  
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Stock extends javax.swing.JFrame {

    /**
     * Creates new form Stock
     */
    public Stock() {
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

        jPanel1 = new javax.swing.JPanel();
        goBack = new javax.swing.JButton();
        viewData = new javax.swing.JButton();
        insertData = new javax.swing.JButton();
        updateData = new javax.swing.JButton();
        deleteData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p_idData = new javax.swing.JTextField();
        qData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        stock_idData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        goBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        goBack.setText("<< Go Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        viewData.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewData.setForeground(new java.awt.Color(0, 204, 204));
        viewData.setText("View");
        viewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDataActionPerformed(evt);
            }
        });

        insertData.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        insertData.setForeground(new java.awt.Color(0, 204, 0));
        insertData.setText("Insert");
        insertData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertDataActionPerformed(evt);
            }
        });

        updateData.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        updateData.setForeground(new java.awt.Color(204, 204, 0));
        updateData.setText("Update");
        updateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataActionPerformed(evt);
            }
        });

        deleteData.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteData.setForeground(new java.awt.Color(204, 51, 0));
        deleteData.setText("Delete");
        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });

        showData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Stock ID", "Product ID", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(showData);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Stock ID     :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Quantity     :");

        p_idData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p_idData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idDataActionPerformed(evt);
            }
        });

        qData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Stocks");

        stock_idData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stock_idData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_idDataActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Product ID :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qData, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_idData, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stock_idData, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insertData, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewData, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateData)
                            .addComponent(deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(132, 132, 132)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewData)
                        .addGap(18, 18, 18)
                        .addComponent(insertData)
                        .addGap(18, 18, 18)
                        .addComponent(updateData)
                        .addGap(18, 18, 18)
                        .addComponent(deleteData)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stock_idData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_idData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        new Eintities().setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void viewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDataActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_project_online_shoping","root","Abu@37011");
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM stock";
            ResultSet rs = st.executeQuery(sql);

            //////////////
            DefaultTableModel dm = (DefaultTableModel)showData.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged(); // notifies the JTable that the model has changed
            //////
            while(rs.next()){
                // Data will be added from start to end
                // Run while loop until all data is insert into the table
                String stock_id = String.valueOf(rs.getInt("stock_id"));
                String p_id = String.valueOf(rs.getInt("p_id"));
                String quantity = String.valueOf(rs.getString("quantity"));

                // Array for Data
                String tbData[] = {stock_id, p_id, quantity};
                DefaultTableModel tbModel = (DefaultTableModel)showData.getModel();

                // Add string array to the table
                tbModel.addRow(tbData);
            }

        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_viewDataActionPerformed

    private void insertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertDataActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_project_online_shoping","root","Abu@37011");
            String sql = "INSERT INTO stock (p_id, quantity) VALUES (?,?)";
            PreparedStatement ptst = conn.prepareStatement(sql);
            ptst.setString(1,p_idData.getText());
            ptst.setString(2,qData.getText());
            ptst.executeUpdate();
            // ResultSet rs = st.executeQuery(sql);
            JOptionPane.showMessageDialog(this, "Successfully inserted data");

        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this, "Insertion of data failed");
        }
    }//GEN-LAST:event_insertDataActionPerformed

    private void updateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_project_online_shoping","root","Abu@37011");
            Statement st = conn.createStatement();
            if(!p_idData.getText().isEmpty()){
                st.execute("UPDATE stock SET p_id = '" + p_idData.getText() + "' WHERE stock_id = '" + stock_idData.getText()+"'");
                p_idData.setText("");
            }
            if(!qData.getText().isEmpty()){
                st.execute("UPDATE stock SET quantity = '" + qData.getText() + "' WHERE stock_id = '" + stock_idData.getText()+"'");
                qData.setText("");
            }
            
            JOptionPane.showMessageDialog(null, "Successfully updated data");

        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this, "Updation of data failed");
        }
    }//GEN-LAST:event_updateDataActionPerformed

    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_project_online_shoping","root","Abu@37011");
            Statement st = conn.createStatement();
            st.execute("DELETE FROM  stock WHERE stock_id = '" + stock_idData.getText()+"'");
            stock_idData.setText("");
            JOptionPane.showMessageDialog(null, "Successfully deleted data");

        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this, "Deletion of data failed");
        }
    }//GEN-LAST:event_deleteDataActionPerformed

    private void p_idDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_idDataActionPerformed

    private void stock_idDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_idDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_idDataActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Stock().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteData;
    private javax.swing.JButton goBack;
    private javax.swing.JButton insertData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p_idData;
    private javax.swing.JTextField qData;
    private javax.swing.JTable showData;
    private javax.swing.JTextField stock_idData;
    private javax.swing.JButton updateData;
    private javax.swing.JButton viewData;
    // End of variables declaration//GEN-END:variables
}