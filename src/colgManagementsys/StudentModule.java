/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colgManagementsys;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author welcome
 */
public class StudentModule extends javax.swing.JFrame {
   Connection con;
    ResultSet rs;
    Statement st;
 
    public StudentModule() {
        initComponents();
         tabledisplay();
    }

     public void tabledisplay()
     {
           try
       {
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/colgmannageproject","root","");
           st=con.createStatement();
           String sql="Select *from student";
           rs=st.executeQuery(sql);
           DefaultTableModel m1=(DefaultTableModel)jTable1.getModel();
           m1.setRowCount(0);
           //jTable1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
           while(rs.next())
       {
             m1.addRow(new Object[]{
             rs.getString("id"),rs.getString("firsname"),rs.getString("lastname"),rs.getString("classname"),
             rs.getString("year"),rs.getString("dob"),rs.getString("contact"),rs.getString("emailid"),
             rs.getString("gender"),rs.getString("permenentaddress"),rs.getString("presentaddress")
           });
       }
       }
       catch(Exception e6)
           {
             JOptionPane.showMessageDialog(this,e6.getMessage());
           }
    }                             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Module");

        jTable1.setBackground(new java.awt.Color(153, 153, 255));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "StudentI D", "First Name", "Last Name", "Class Name", "year ", " DOB", "Contact", "Email ID", "Gender", "Permenent Address", "Present Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowSelectionAllowed(true);
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 153));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colgManagementsys/images/add.png"))); // NOI18N
        jButton1.setText("Add Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colgManagementsys/images/update.png"))); // NOI18N
        jButton2.setText("Update Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Module");

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colgManagementsys/images/butttons/DELETE.jpg"))); // NOI18N
        jButton3.setText("Delete All ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colgManagementsys/images/cance.jpg"))); // NOI18N
        jButton4.setText("Delete Record");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 51));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colgManagementsys/images/butttons/back1.jpg"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addGap(45, 45, 45)
                        .addComponent(jButton4)
                        .addGap(46, 46, 46)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Open Student add new Record frame.
       AddStudentRecord adsr1=new AddStudentRecord();
        adsr1.setVisible(true);
        adsr1.setSize(960,530);

         adsr1.show();
         dispose();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Delete All record.
         int rowcount=jTable1.getRowCount();
         if(rowcount==0){
           JOptionPane.showMessageDialog(this,"Table is already Empty..","OPPS..",JOptionPane.ERROR_MESSAGE);
          }
        else
        {
           int c=JOptionPane.showConfirmDialog(this,"Delete all records from table?","Delete All Record",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           if(c==0)// 0 means yes 1 means no
          { 
              String sql="delete from student";
              try
              {
                  con.createStatement();   
                  int n=st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this,"Records Deleted Successfully !","Deleted",JOptionPane.INFORMATION_MESSAGE);
                 tabledisplay();
               }
               catch(Exception ex)
               {
                   JOptionPane.showMessageDialog(this,ex.getMessage());
               }
           }
        }
              
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    //DELETE SELECTED RECORD
    int row=jTable1.getSelectedRow();
         if(row==-1){
           JOptionPane.showMessageDialog(this,"Select At Least One Row To delete","OPPS..",JOptionPane.ERROR_MESSAGE);
          }
        else
        {
             String cell=(String)jTable1.getModel().getValueAt(row,0);
             int c=JOptionPane.showConfirmDialog(this,"Delete Selected Record?","Delete Record",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(c==0)// 0 means yes 1 means no
          { 
              String sql="delete from student where id="+cell+"";
              try
              {
                  con.createStatement();   
                  int n=st.executeUpdate(sql);    
                  JOptionPane.showMessageDialog(this,"Record Deleted Successfully !","Deleted",JOptionPane.INFORMATION_MESSAGE);
                 tabledisplay();
               }
               catch(Exception ex)
               {
                   JOptionPane.showMessageDialog(this,ex.getMessage());
               }
           }            
    }                                      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //Update Selectd Row.
        int row;
        String cell;
        row=jTable1.getSelectedRow();
        if(row==-1){
           JOptionPane.showMessageDialog(this,"Select At Least One Row To Update","OPPS..",JOptionPane.ERROR_MESSAGE);
          }
        else
        {
       cell=(String)jTable1.getModel().getValueAt(row,0);
       UpdateStudentRecord udsr=new UpdateStudentRecord();
       udsr.setVisible(true);
       udsr.show();
       udsr.updateStudentrecord(cell);
       this.dispose();
        }
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         // go back to admin panel
        AdminPanelCMS adm2=new  AdminPanelCMS();
        adm2.setVisible(true);
        adm2.setSize(720,420);
        adm2.show();
        this.dispose();
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
            java.util.logging.Logger.getLogger(StudentModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
