/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class addquestion extends javax.swing.JFrame {
DefaultTableModel model;
    String u;
    /**
     * Creates new form addquestion
     */
    public addquestion() {
        initComponents();
        model=(DefaultTableModel) tbl.getModel();
        
    }
 public addquestion(String user) {
     u=user;
        initComponents();
         model=(DefaultTableModel) tbl.getModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtq = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txto1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txto2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txto3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txto4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtans = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Question");

        txtq.setColumns(20);
        txtq.setRows(5);
        jScrollPane1.setViewportView(txtq);

        jLabel2.setText("Option1");

        txto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txto1ActionPerformed(evt);
            }
        });

        jLabel3.setText("option2");

        jLabel4.setText("option 3");

        jLabel5.setText("option 4");

        jLabel6.setText("Answer");

        jButton1.setText("query");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question", "Option1", "Option2", "Option 3", "Option 4", "Answer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl);

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(txto4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txto3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txto2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txto1, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txto1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
        db db=new db();
        Connection con=db.getcon();
        String q=txtq.getText();
        String o1=txto1.getText();
        String o2=txto2.getText();
         String o3=txto3.getText();
        String o4=txto4.getText();
         String ans=txtans.getText();
         //sclass s=new sclass();
         //login l=new login();
        // String m=l.getUsername();
        //String uname= s.getusername();
       //  JOptionPane.showMessageDialog(null,u);
         PreparedStatement ps1=con.prepareStatement("select tid from tbl_treg where tusername=?");
         ps1.setString(1, u);
         ResultSet rs=ps1.executeQuery();
         while(rs.next()){
        // s.getpwd();
         PreparedStatement ps=con.prepareStatement("insert into tbl_question(question,option1,option2,option3,option4,answer,tid) values(?,?,?,?,?,?,?)");
         ps.setString(1, q);
         ps.setString(2, o1);
         ps.setString(3, o2);
         ps.setString(4, o3);
         ps.setString(5, o4);
         ps.setString(6, ans);
         ps.setString(7, rs.getString("tid"));
          int x=ps.executeUpdate();
            if(x>0){
 model.insertRow(model.getRowCount(),new Object[]{txtq.getText(),txto1.getText(),txto2.getText(),txto3.getText(),txto4.getText(),txtans.getText()});
               // JOptionPane.showMessageDialog(null, "Inserted");
                txtq.setText("");
                txto1.setText("");
                txto2.setText("");
                txto3.setText("");
                txto4.setText("");
                txtans.setText("");
            }
         }
        }
        catch(Exception e)
        {
            
        }
         
       //
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new thome(u).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         model.setValueAt(txtq.getText(),tbl.getSelectedRow(),0);
         model.setValueAt(txto1.getText(),tbl.getSelectedRow(),1);
         model.setValueAt(txto2.getText(),tbl.getSelectedRow(),2);
         model.setValueAt(txto3.getText(),tbl.getSelectedRow(),3);
         model.setValueAt(txto4.getText(),tbl.getSelectedRow(),4);
         model.setValueAt(txtans.getText(),tbl.getSelectedRow(),5);
         try{
         db db=new db();
         Connection con=db.getcon();
         PreparedStatement ps=con.prepareStatement("update tbl_question set question=?,option1=?,option2=?,option3=?,option4=?,answer=?  where tid=(select tid  from tbl_treg where tusername=?)");
         ps.setString(1, txtq.getText());
          ps.setString(2, txto1.getText());
           ps.setString(3, txto2.getText());
            ps.setString(4, txto3.getText());
             ps.setString(5, txto4.getText());
              ps.setString(6, txtans.getText());
               ps.setString(7,u);
               //int x=ps.executeUpdate();
              /* if(x>0)
               {
                   JOptionPane.showMessageDialog(null, "Updated");
               }*/
         
         }
         catch(Exception e)
         {
             
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          model.removeRow(tbl.getSelectedRow());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
         txtq.setText(String.valueOf(model.getValueAt(tbl.getSelectedRow(),0)));
         txto1.setText(String.valueOf(model.getValueAt(tbl.getSelectedRow(),1)));
         txto2.setText(String.valueOf(model.getValueAt(tbl.getSelectedRow(),2)));
         txto3.setText(String.valueOf(model.getValueAt(tbl.getSelectedRow(),3)));
         txto4.setText(String.valueOf(model.getValueAt(tbl.getSelectedRow(),4)));
         txtans.setText(String.valueOf(model.getValueAt(tbl.getSelectedRow(),5)));
    }//GEN-LAST:event_tblMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         getContentPane().setBackground(Color.PINK); 
        try{
        db db=new db();
        Connection con=db.getcon();
        PreparedStatement ps=con.prepareStatement("select * from tbl_question where tid=(select tid from tbl_treg where tusername=?)");
        ps.setString(1, u);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            //JOptionPane.showMessageDialog(null, "Inserted");
            model.insertRow(model.getRowCount(),new Object[]{rs.getString("question"),rs.getString("option1"),rs.getString("option2"),rs.getString("Option3"),rs.getString("Option4"),rs.getString("answer")});
        }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(addquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addquestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtans;
    private javax.swing.JTextField txto1;
    private javax.swing.JTextField txto2;
    private javax.swing.JTextField txto3;
    private javax.swing.JTextField txto4;
    private javax.swing.JTextArea txtq;
    // End of variables declaration//GEN-END:variables
}
