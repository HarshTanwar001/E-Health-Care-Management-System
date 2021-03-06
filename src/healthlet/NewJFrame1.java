package healthlet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jr1 = new javax.swing.JRadioButton();
        jr2 = new javax.swing.JRadioButton();
        jr3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Selection Window");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME DOCTOR, HAVE A NICE DAY !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 29, 290, 32));

        buttonGroup1.add(jr1);
        jr1.setText("Add a new patient ");
        jr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr1ActionPerformed(evt);
            }
        });
        getContentPane().add(jr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 79, 247, 30));

        buttonGroup1.add(jr2);
        jr2.setText("Discharge a patient");
        getContentPane().add(jr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 127, 247, 30));

        buttonGroup1.add(jr3);
        jr3.setText("View patients record from the archive");
        getContentPane().add(jr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 175, 247, 33));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_icons/Button-Next-icon.png"))); // NOI18N
        jButton1.setMnemonic('e');
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 234, 120, 40));

        jButton2.setFont(new java.awt.Font("Lucida Console", 2, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_icons/Plus.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (jr1.isSelected() == true) { this.setVisible(false);
                                new NewJFrame2().setVisible(true);}     
if (jr2.isSelected() == true) { this.setVisible(false);
                                new NewJFrame3().setVisible(true);}
if (jr3.isSelected() == true) { this.setVisible(false);
                                new NewJFrame4().setVisible(true);}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jr1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jr1;
    private javax.swing.JRadioButton jr2;
    private javax.swing.JRadioButton jr3;
    // End of variables declaration//GEN-END:variables
}
