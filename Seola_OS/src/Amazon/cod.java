package Amazon;


import Desktop.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srinivas
 */
public class cod extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    public cod() {
        setLocation(200, 200);
        initComponents();

    }
public static void dt() {    
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
       LocalDateTime now = LocalDateTime.now();  
       sin_date.setText(dtf.format(now));  
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
        sin_date = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        wallp1 = new javax.swing.JLabel();
        tictac = new javax.swing.JLabel();
        calc = new javax.swing.JLabel();
        calc_label = new javax.swing.JLabel();
        amzon = new javax.swing.JLabel();
        amzn_label = new javax.swing.JLabel();
        shut = new javax.swing.JLabel();
        tictac_label = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        pay_label = new javax.swing.JLabel();
        wetrans = new javax.swing.JLabel();
        wetrans_label = new javax.swing.JLabel();
        sin_bg = new javax.swing.JLabel();
        dell = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 572));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(null);

        sin_date.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sin_date.setForeground(new java.awt.Color(153, 255, 255));
        sin_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sin_dateMouseEntered(evt);
            }
        });
        getContentPane().add(sin_date);
        sin_date.setBounds(350, 20, 270, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/desk_topbar.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 20, 920, 20);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jInternalFrame1.setMaximumSize(new java.awt.Dimension(100, 40));
        jInternalFrame1.setName(""); // NOI18N
        try {
            jInternalFrame1.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrame1.setVisible(true);
        jInternalFrame1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jInternalFrame1MouseMoved(evt);
            }
        });
        jInternalFrame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jInternalFrame1MouseEntered(evt);
            }
        });
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Order placed successfully. Thanks for shopping with us.");
        jInternalFrame1.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 190, 880, 62);

        jButton1.setBackground(java.awt.Color.orange);
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1);
        jButton1.setBounds(470, 350, 180, 50);

        jButton2.setBackground(java.awt.Color.orange);
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setText("Continue Shopping");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2);
        jButton2.setBounds(250, 350, 180, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/amalogo.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 0, 560, 170);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel3);
        jLabel3.setBounds(-40, 0, 1040, 490);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(40, 40, 890, 500);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<HTML> <HEAD> </HEAD> <BODY>Change <BR> Wallpaper </BODY> </HTML>");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 440, 80, 40);

        wallp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaper-icon.png"))); // NOI18N
        wallp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wallp1MouseClicked(evt);
            }
        });
        getContentPane().add(wallp1);
        wallp1.setBounds(50, 380, 70, 60);

        tictac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tictactoe.png"))); // NOI18N
        tictac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tictacMouseClicked(evt);
            }
        });
        getContentPane().add(tictac);
        tictac.setBounds(30, 70, 100, 80);

        calc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calculator.png"))); // NOI18N
        calc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcMouseClicked(evt);
            }
        });
        getContentPane().add(calc);
        calc.setBounds(40, 260, 130, 110);

        calc_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        calc_label.setForeground(new java.awt.Color(153, 255, 255));
        calc_label.setText("Calculator");
        getContentPane().add(calc_label);
        calc_label.setBounds(50, 350, 90, 40);

        amzon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Picture2.png"))); // NOI18N
        amzon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amzonMouseClicked(evt);
            }
        });
        getContentPane().add(amzon);
        amzon.setBounds(50, 160, 130, 110);

        amzn_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        amzn_label.setForeground(new java.awt.Color(153, 255, 255));
        amzn_label.setText("Amazon");
        getContentPane().add(amzn_label);
        amzn_label.setBounds(50, 240, 70, 40);

        shut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shut.png"))); // NOI18N
        shut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shutMouseClicked(evt);
            }
        });
        getContentPane().add(shut);
        shut.setBounds(860, 460, 70, 80);

        tictac_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tictac_label.setForeground(new java.awt.Color(153, 255, 255));
        tictac_label.setText("Tic Tac Toe");
        getContentPane().add(tictac_label);
        tictac_label.setBounds(50, 140, 90, 30);

        pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ama_pay.png"))); // NOI18N
        pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payMouseClicked(evt);
            }
        });
        getContentPane().add(pay);
        pay.setBounds(190, 50, 100, 90);

        pay_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pay_label.setForeground(new java.awt.Color(153, 255, 255));
        pay_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pay_label.setText("Amazon Pay");
        getContentPane().add(pay_label);
        pay_label.setBounds(170, 120, 110, 40);

        wetrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WeTransfer_logo.png"))); // NOI18N
        wetrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wetransMouseClicked(evt);
            }
        });
        getContentPane().add(wetrans);
        wetrans.setBounds(160, 140, 110, 90);

        wetrans_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        wetrans_label.setForeground(new java.awt.Color(153, 255, 255));
        wetrans_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wetrans_label.setText("WeTransfer");
        wetrans_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wetrans_labelMouseClicked(evt);
            }
        });
        getContentPane().add(wetrans_label);
        wetrans_label.setBounds(170, 210, 110, 40);

        sin_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seola_wall.png"))); // NOI18N
        sin_bg.setText("jLabel2");
        getContentPane().add(sin_bg);
        sin_bg.setBounds(20, 20, 920, 520);

        dell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dellmonitor.png"))); // NOI18N
        getContentPane().add(dell);
        dell.setBounds(0, 0, 960, 572);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shutMouseClicked
        new shut().setVisible(true);
        dispose();
    }//GEN-LAST:event_shutMouseClicked

    private void amzonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amzonMouseClicked
        new Amazon.Amazn().setVisible(true);
        dispose();
    }//GEN-LAST:event_amzonMouseClicked

    private void tictacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tictacMouseClicked
        new tic().setVisible(true);
        dispose();
    }//GEN-LAST:event_tictacMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jInternalFrame1.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void jInternalFrame1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternalFrame1MouseEntered
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1MouseEntered

    private void sin_dateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sin_dateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sin_dateMouseEntered

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void jInternalFrame1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternalFrame1MouseMoved
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1MouseMoved

    private void calcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcMouseClicked
        new Calc.calc().setVisible(true);
        dispose();
    }//GEN-LAST:event_calcMouseClicked

    private void wallp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wallp1MouseClicked
        new wallp().setVisible(true);
        dispose();
    }//GEN-LAST:event_wallp1MouseClicked

    private void payMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseClicked
        new Amazon_Pay.Pay_sign().setVisible(true);
        dispose();
    }//GEN-LAST:event_payMouseClicked

    private void wetransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wetransMouseClicked
new WeTransfer.WeTransfer().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_wetransMouseClicked

    private void wetrans_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wetrans_labelMouseClicked
new WeTransfer.WeTransfer().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_wetrans_labelMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new Amazon.Amazn().setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

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
            java.util.logging.Logger.getLogger(boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amzn_label;
    private javax.swing.JLabel amzon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel calc;
    private javax.swing.JLabel calc_label;
    private javax.swing.JLabel dell;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel pay;
    private javax.swing.JLabel pay_label;
    private javax.swing.JLabel shut;
    public static transient javax.swing.JLabel sin_bg;
    public static transient javax.swing.JLabel sin_date;
    private javax.swing.JLabel tictac;
    private javax.swing.JLabel tictac_label;
    private javax.swing.JLabel wallp1;
    private javax.swing.JLabel wetrans;
    private javax.swing.JLabel wetrans_label;
    // End of variables declaration//GEN-END:variables
}
