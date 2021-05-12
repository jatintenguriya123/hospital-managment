/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagment;

import UserDao.EmpDao;
import UserPojo.EmpPojo;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Akki
 */
public class AddEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployeeFrame
     */
    public AddEmployeeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        newEmpid();
    }
    private void newEmpid () {
        txtEmpName.setText("");
        txtSal.setText("");
        jcbJob.setSelectedIndex(0);
        try {
            String str = EmpDao.getNewId();
            txtEmpid.setText(str);
            
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error in database", "error", JOptionPane.ERROR_MESSAGE );
            ex.printStackTrace();
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        EmployeeId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpid = new javax.swing.JTextField();
        txtEmpName = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();
        txtAddEmp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jcbJob = new javax.swing.JComboBox();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Employee Panel");

        logout.setText("logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(26, 26, 26))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout))
                .addGap(23, 23, 23))
        );
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(logout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        EmployeeId.setText("empID");

        jLabel3.setText("name");

        jLabel4.setText("job");

        jLabel5.setText("salary");

        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });

        txtSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalActionPerformed(evt);
            }
        });

        txtAddEmp.setText("add emp");
        txtAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddEmpActionPerformed(evt);
            }
        });

        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jcbJob.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "DOCTOR", "RECEPTIONIST", "WARDBOY", "COMPOUNDER", " " }));
        jcbJob.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbJobItemStateChanged(evt);
            }
        });
        jcbJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbJobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmployeeId)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSal)
                    .addComponent(txtEmpName)
                    .addComponent(txtEmpid)
                    .addComponent(jcbJob, 0, 108, Short.MAX_VALUE))
                .addGap(168, 168, 168))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(txtAddEmp)
                        .addGap(31, 31, 31)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmployeeId)
                    .addComponent(txtEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddEmp)
                    .addComponent(btnBack))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void txtSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtSalActionPerformed

    private void txtAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddEmpActionPerformed
        if(! validateInput()) {
            JOptionPane.showMessageDialog(null, "invalid input","error", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        try {
            String eno = txtEmpid.getText();
            String job = jcbJob.getSelectedItem().toString().toUpperCase();
            String ename = txtEmpName.getText();
            double sal = Double.parseDouble(txtSal.getText());
            EmpPojo e = new EmpPojo();
            
            e.setEmpid(eno);
            e.setEmpname(ename);
            e.setJob(job);
            e.setSal(sal);
            System.out.println("a");
            boolean result = EmpDao.addEmployee(e);
             System.out.println("a");
            if(result == true){
                JOptionPane.showMessageDialog(null,"record success", "hurryy" ,JOptionPane.INFORMATION_MESSAGE );
                newEmpid();
            }
            else {
                JOptionPane.showMessageDialog(null, "could not add employee ", "booooo", JOptionPane.INFORMATION_MESSAGE );
            }
               
        }
        catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "sql me dikkat h", "error", JOptionPane.ERROR_MESSAGE);
            sqle.printStackTrace();
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "pleasse provide numaric value for eno and sal", "error",JOptionPane.ERROR_MESSAGE);
            nfe.printStackTrace();
        }
        
    }//GEN-LAST:event_txtAddEmpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       ManageEmployeeFrame mf = new ManageEmployeeFrame();
       mf.setVisible(true);
       this.dispose();
               
    }//GEN-LAST:event_btnBackActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
                                int ans;
        ans = JOptionPane.showConfirmDialog(null, "are you sure", "logging out!",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(ans == JOptionPane.YES_OPTION) {
        this.dispose();
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void jcbJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbJobActionPerformed

    private void jcbJobItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbJobItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbJobItemStateChanged

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
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmployeeId;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcbJob;
    private javax.swing.JButton logout;
    private javax.swing.JButton txtAddEmp;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpid;
    private javax.swing.JTextField txtSal;
    // End of variables declaration//GEN-END:variables
    public boolean validateInput() {
        return !(txtEmpName.getText().isEmpty() || txtSal.getText().isEmpty());
    }
}