package WeTransfer;
import Desktop.*;
import java.awt.Color;
import java.io.File;
import java.net.URL;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
public class WeTrans_home extends javax.swing.JFrame {


        int dot_color = 0;
        Color red = new Color(255,0,0);
        Color yellow = new Color(255,255,0);
        
    /**
     * Creates new form NewJFrame
     */
    public WeTrans_home() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        animate_panel = new javax.swing.JPanel();
        end_animation = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        a4 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        wetrans_logo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        shut = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        amzon_label = new javax.swing.JLabel();
        amzon = new javax.swing.JLabel();
        calc = new javax.swing.JLabel();
        calc_label = new javax.swing.JLabel();
        top_bar = new javax.swing.JLabel();
        tictac_label = new javax.swing.JLabel();
        tictac = new javax.swing.JLabel();
        wallp = new javax.swing.JLabel();
        wallp_label = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        pay_label = new javax.swing.JLabel();
        wetrans = new javax.swing.JLabel();
        wetrans_label = new javax.swing.JLabel();
        desk_bg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SeolaOS");
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        animate_panel.setBackground(new java.awt.Color(51, 51, 51));
        animate_panel.setAutoscrolls(true);
        animate_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        animate_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        end_animation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animate_panel.add(end_animation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 450));

        jInternalFrame1.getContentPane().add(animate_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 450));

        jButton1.setText("Choose File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 30));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText("Sender Address  :");
        jInternalFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 240, 30));

        fname.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(153, 255, 255));
        jInternalFrame1.getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 390, 30));
        jInternalFrame1.getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 250, 30));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("Enter Destination Address :");
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 340, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("Enter Message  :");
        jInternalFrame1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 240, -1));
        jInternalFrame1.getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 250, 30));
        jInternalFrame1.getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 250, 30));
        jInternalFrame1.getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 390, 30));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wetransfer_button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 300, 50));

        wetrans_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WeTrans_logo.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(wetrans_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 500, 130));

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setOpaque(true);
        jInternalFrame1.getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(60, 50, 840, 470);

        shut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shut.png"))); // NOI18N
        shut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shutMouseClicked(evt);
            }
        });
        getContentPane().add(shut);
        shut.setBounds(860, 460, 70, 80);

        date.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(153, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(date);
        date.setBounds(350, 20, 270, 20);

        amzon_label.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        amzon_label.setForeground(new java.awt.Color(153, 255, 255));
        amzon_label.setText("Amazon");
        getContentPane().add(amzon_label);
        amzon_label.setBounds(50, 210, 80, 40);

        amzon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Picture2.png"))); // NOI18N
        amzon.setLabelFor(amzon_label);
        amzon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amzonMouseClicked(evt);
            }
        });
        getContentPane().add(amzon);
        amzon.setBounds(50, 130, 130, 110);

        calc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calculator.png"))); // NOI18N
        calc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcMouseClicked(evt);
            }
        });
        getContentPane().add(calc);
        calc.setBounds(40, 240, 130, 110);

        calc_label.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        calc_label.setForeground(new java.awt.Color(153, 255, 255));
        calc_label.setText("Calculator");
        getContentPane().add(calc_label);
        calc_label.setBounds(50, 320, 100, 40);

        top_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/desk_topbar.png"))); // NOI18N
        getContentPane().add(top_bar);
        top_bar.setBounds(20, 20, 920, 20);

        tictac_label.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        tictac_label.setForeground(new java.awt.Color(153, 255, 255));
        tictac_label.setText("Tic Tac Toe");
        getContentPane().add(tictac_label);
        tictac_label.setBounds(50, 120, 100, 30);

        tictac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tictactoe.png"))); // NOI18N
        tictac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tictacMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tictacMousePressed(evt);
            }
        });
        getContentPane().add(tictac);
        tictac.setBounds(30, 50, 110, 90);

        wallp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaper-icon.png"))); // NOI18N
        wallp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wallpMouseClicked(evt);
            }
        });
        getContentPane().add(wallp);
        wallp.setBounds(50, 380, 70, 60);

        wallp_label.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        wallp_label.setForeground(new java.awt.Color(153, 255, 255));
        wallp_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wallp_label.setText("<HTML> <HEAD> </HEAD> <BODY>Change <BR> Wallpaper </BODY> </HTML>");
        getContentPane().add(wallp_label);
        wallp_label.setBounds(50, 440, 90, 40);

        pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ama_pay.png"))); // NOI18N
        pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payMouseClicked(evt);
            }
        });
        getContentPane().add(pay);
        pay.setBounds(190, 50, 100, 90);

        pay_label.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        pay_label.setForeground(new java.awt.Color(153, 255, 255));
        pay_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pay_label.setText("Amazon Pay");
        getContentPane().add(pay_label);
        pay_label.setBounds(170, 120, 120, 40);

        wetrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WeTransfer_logo.png"))); // NOI18N
        wetrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wetransMouseClicked(evt);
            }
        });
        getContentPane().add(wetrans);
        wetrans.setBounds(160, 140, 110, 90);

        wetrans_label.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        wetrans_label.setForeground(new java.awt.Color(153, 255, 255));
        wetrans_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wetrans_label.setText("WeTransfer");
        wetrans_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wetrans_labelMouseClicked(evt);
            }
        });
        getContentPane().add(wetrans_label);
        wetrans_label.setBounds(170, 210, 120, 40);

        desk_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seola_wall.png"))); // NOI18N
        desk_bg.setText("jLabel2");
        getContentPane().add(desk_bg);
        desk_bg.setBounds(20, 20, 920, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dellmonitor.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 580);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void dt() {    
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
       LocalDateTime now = LocalDateTime.now();  
       WeTrans_home.date.setText(dtf.format(now));  
      }
public void animate(){
            animate_panel.setVisible(true);
            Double random = Math.random();
            int random_int = (int)(random*10);
            System.out.println(random_int);
            switch (random_int){
                case 0: 
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wetrans1.gif"))); // NOI18N
                    break;
                case 1: 
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans2.gif")));
                    break;
                case 2: 
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans3.gif")));
                    break;
                case 3: 
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans4.gif")));
                    break;
                case 4: 
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans5.gif")));
                    break;
                case 5: 
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans6.gif")));
                    break;
                case 6:
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans7.gif")));
                    break;
                case 7:
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans8.gif")));
                    break;
                case 8:
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans9.gif")));
                    break;
                case 9:
                    end_animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wtrans10.gif")));
                    break;
            }
}
    private void shutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shutMouseClicked
new shut().setVisible(true);
dispose();
    }//GEN-LAST:event_shutMouseClicked

    private void tictacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tictacMouseClicked
new tic().setVisible(true);
dispose();
    }//GEN-LAST:event_tictacMouseClicked

    private void amzonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amzonMouseClicked
new Amazon.Amazn().setVisible(true);
dispose();
    }//GEN-LAST:event_amzonMouseClicked

    private void tictacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tictacMousePressed
      
    }//GEN-LAST:event_tictacMousePressed

    private void calcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcMouseClicked
new Calc.calc().setVisible(true);
dispose();
    }//GEN-LAST:event_calcMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
dt();    // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
dt();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void wallpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wallpMouseClicked
new wallp().setVisible(true); 
dispose();
    }//GEN-LAST:event_wallpMouseClicked

    private void payMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseClicked
new Amazon_Pay.Pay_sign().setVisible(true);
dispose();
    }//GEN-LAST:event_payMouseClicked

    private void wetransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wetransMouseClicked
new WeTransfer().setVisible(true);
dispose();
    }//GEN-LAST:event_wetransMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   JFileChooser jfc = new JFileChooser();
jfc.setVisible(true);
int i=jfc.showOpenDialog(this);    
if(i==JFileChooser.APPROVE_OPTION){    
        File f=jfc.getSelectedFile();    
        String filepath=f.getPath();    
        String fname = f.getName();
        a3.setText(filepath);
        WeTrans_home.fname.setText(fname);
}
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        

        animate();
        
        
        WeTrans_test.transfer();
        


        try {
            Class.forName("com.mysql.jdbc.Driver");
            String text = WeTrans_home.a2.getText();
            Connection conec = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/seolaos", "root", "Mysql@123");
            String qry = "select * from wetransfer where Email = '"+text+"'";
            Statement stmt = (Statement) conec.createStatement();
            ResultSet res = stmt.executeQuery(qry);
            if(res.next()){
                String uname = res.getString("Name");
                String umail = res.getString("Email");
        final String username = "noreply.seolaos@gmail.com";
        final String password = "!@#456&*(0";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("noreply.seolaos@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(umail));
            message.setSubject("File transfer successful");
            message.setText("Your files have been sent successfully to " + a1.getText());

            Transport.send(message);
            
            
        
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
        }
catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
        animate_panel.setVisible(false);
             JOptionPane.showMessageDialog(null, "Transfer successful!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void wetrans_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wetrans_labelMouseClicked
new WeTransfer().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_wetrans_labelMouseClicked


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
                new WeTrans_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static transient javax.swing.JTextField a1;
    public static transient javax.swing.JTextField a2;
    public static transient javax.swing.JTextField a3;
    public static transient javax.swing.JTextField a4;
    private javax.swing.JLabel amzon;
    private javax.swing.JLabel amzon_label;
    public static javax.swing.JPanel animate_panel;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel calc;
    private javax.swing.JLabel calc_label;
    public static transient javax.swing.JLabel date;
    public static transient javax.swing.JLabel desk_bg;
    private javax.swing.JLabel end_animation;
    public static javax.swing.JLabel fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pay;
    private javax.swing.JLabel pay_label;
    private javax.swing.JLabel shut;
    private javax.swing.JLabel tictac;
    private javax.swing.JLabel tictac_label;
    private javax.swing.JLabel top_bar;
    private javax.swing.JLabel wallp;
    private javax.swing.JLabel wallp_label;
    private javax.swing.JLabel wetrans;
    private javax.swing.JLabel wetrans_label;
    private javax.swing.JLabel wetrans_logo;
    // End of variables declaration//GEN-END:variables
}