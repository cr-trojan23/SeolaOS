package Desktop;
import java.awt.Color;
import java.util.TimerTask;
import java.util.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srinivas
 */
public class shut extends javax.swing.JFrame {
        int counter = 0;
        int counter2 = 0;
        Color red= new Color(255,0,0);
        Color yellow= new Color(255,255,0);
    /**
     * Creates new form NewJFrame
     */
    public shut() {
        setLocation(200, 200);
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

        jLabel3 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 572));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 72)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("SeolaOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 200, 310, 90);

        d1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        d1.setText(".");
        d1.setToolTipText("");
        d1.setDoubleBuffered(true);
        d1.setFocusCycleRoot(true);
        getContentPane().add(d1);
        d1.setBounds(380, 260, 20, 40);

        d2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        d2.setText(".");
        d2.setToolTipText("");
        d2.setDoubleBuffered(true);
        d2.setFocusCycleRoot(true);
        getContentPane().add(d2);
        d2.setBounds(420, 260, 20, 40);

        d3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        d3.setText(".");
        d3.setToolTipText("");
        d3.setDoubleBuffered(true);
        d3.setFocusCycleRoot(true);
        getContentPane().add(d3);
        d3.setBounds(460, 260, 20, 40);

        d4.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        d4.setText(".");
        d4.setToolTipText("");
        d4.setDoubleBuffered(true);
        d4.setFocusCycleRoot(true);
        getContentPane().add(d4);
        d4.setBounds(500, 260, 20, 40);

        d5.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        d5.setText(".");
        d5.setToolTipText("");
        d5.setDoubleBuffered(true);
        d5.setFocusCycleRoot(true);
        getContentPane().add(d5);
        d5.setBounds(540, 260, 20, 40);

        d6.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        d6.setText(".");
        d6.setToolTipText("");
        d6.setDoubleBuffered(true);
        d6.setFocusCycleRoot(true);
        getContentPane().add(d6);
        d6.setBounds(580, 260, 20, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Seola_bg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 920, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dellmonitor.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 572);

        a.setText("jLabel4");
        getContentPane().add(a);
        a.setBounds(370, 370, 310, 90);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents
{
        Timer timer = new Timer();
        TimerTask task;
            task = new TimerTask() {
                public void run() {
                    counter++;
                    if (counter == 0) {
                        d1.setForeground(red);
                        d2.setForeground(red);
                        d3.setForeground(red);
                        d4.setForeground(red);
                        d5.setForeground(red);
                        d6.setForeground(red);
                    } else if (counter == 1) {
                        d1.setForeground(yellow);
                        d2.setForeground(red);
                        d3.setForeground(red);
                        d4.setForeground(red);
                        d5.setForeground(red);
                        d6.setForeground(red);
                    } else if (counter == 3) {
                        d1.setForeground(yellow);
                        d2.setForeground(yellow);
                        d3.setForeground(red);
                        d4.setForeground(red);
                        d5.setForeground(red);
                        d6.setForeground(red);
                    } else if (counter == 4) {
                        d1.setForeground(yellow);
                        d2.setForeground(yellow);
                        d3.setForeground(yellow);
                        d4.setForeground(red);
                        d5.setForeground(red);
                        d6.setForeground(red);
                    } else if (counter == 5) {
                        d1.setForeground(yellow);
                        d2.setForeground(yellow);
                        d3.setForeground(yellow);
                        d4.setForeground(yellow);
                        d5.setForeground(red);
                        d6.setForeground(red);
                    } else if (counter == 6) {
                        d1.setForeground(yellow);
                        d2.setForeground(yellow);
                        d3.setForeground(yellow);
                        d4.setForeground(yellow);
                        d5.setForeground(red);
                        d6.setForeground(red);
                    } else if (counter == 7) {
                        d1.setForeground(yellow);
                        d2.setForeground(yellow);
                        d3.setForeground(yellow);
                        d4.setForeground(yellow);
                        d5.setForeground(yellow);
                        d6.setForeground(red);
                    } else if (counter == 8) {
                        d1.setForeground(yellow);
                        d2.setForeground(yellow);
                        d3.setForeground(yellow);
                        d4.setForeground(yellow);
                        d5.setForeground(yellow);
                        d6.setForeground(yellow);
                    
                        dispose();
                    } 
                }
            };
        timer.scheduleAtFixedRate(task, 500, 500);
        }
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
            java.util.logging.Logger.getLogger(shut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    public static transient javax.swing.JLabel d1;
    public static transient javax.swing.JLabel d2;
    public static transient javax.swing.JLabel d3;
    public static transient javax.swing.JLabel d4;
    public static transient javax.swing.JLabel d5;
    public static transient javax.swing.JLabel d6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
