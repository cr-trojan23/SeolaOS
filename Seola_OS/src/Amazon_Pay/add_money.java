package Amazon_Pay;
import Amazon.home;
import Desktop.*;
import java.awt.Color;
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
public class add_money extends javax.swing.JFrame {


        int dot_color = 0;
        Color red= new Color(255,0,0);
        Color yellow= new Color(255,255,0);
        
    /**
     * Creates new form NewJFrame
     */
    public add_money() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        cc = new javax.swing.JRadioButton();
        dc = new javax.swing.JRadioButton();
        amount = new javax.swing.JTextField();
        na_label = new javax.swing.JLabel();
        exp1 = new javax.swing.JComboBox<>();
        exp2 = new javax.swing.JComboBox<>();
        cnat = new javax.swing.JTextField();
        otp = new javax.swing.JTextField();
        cvvt = new javax.swing.JTextField();
        cht = new javax.swing.JTextField();
        cno = new javax.swing.JLabel();
        cvv = new javax.swing.JLabel();
        cna = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        exp = new javax.swing.JLabel();
        amt1 = new javax.swing.JLabel();
        sub = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        shut = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        amzon = new javax.swing.JLabel();
        calc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        top_bar = new javax.swing.JLabel();
        tictac_label = new javax.swing.JLabel();
        tictac = new javax.swing.JLabel();
        wallp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        wallp1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        pay_label = new javax.swing.JLabel();
        wetrans = new javax.swing.JLabel();
        wetrans_label = new javax.swing.JLabel();
        desk_bg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        jInternalFrame1.setBackground(new java.awt.Color(51, 51, 51));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addmoney.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 140, 120));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ama_pay2.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, 0, 1220, 160));

        amt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        amt.setForeground(new java.awt.Color(153, 255, 255));
        amt.setText("Please wait while we send OTP");
        jInternalFrame1.getContentPane().add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        cc.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        cc.setForeground(new java.awt.Color(153, 255, 255));
        cc.setText("Credit Card");
        cc.setContentAreaFilled(false);
        cc.setHideActionText(true);
        cc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cc.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jInternalFrame1.getContentPane().add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, -1));

        dc.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        dc.setForeground(new java.awt.Color(153, 255, 255));
        dc.setText("Debit Card");
        dc.setContentAreaFilled(false);
        dc.setHideActionText(true);
        dc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dc.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jInternalFrame1.getContentPane().add(dc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        amount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jInternalFrame1.getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 90, 30));

        na_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        na_label.setForeground(new java.awt.Color(153, 255, 255));
        jInternalFrame1.getContentPane().add(na_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 160, 30));

        exp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028" }));
        jInternalFrame1.getContentPane().add(exp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 80, -1));

        exp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jInternalFrame1.getContentPane().add(exp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 80, -1));

        cnat.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jInternalFrame1.getContentPane().add(cnat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 270, 30));

        otp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jInternalFrame1.getContentPane().add(otp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 140, 30));

        cvvt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jInternalFrame1.getContentPane().add(cvvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 80, 30));

        cht.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jInternalFrame1.getContentPane().add(cht, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 270, 30));

        cno.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        cno.setForeground(new java.awt.Color(153, 255, 255));
        cno.setText("Card Number");
        jInternalFrame1.getContentPane().add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        cvv.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        cvv.setForeground(new java.awt.Color(153, 255, 255));
        cvv.setText("CVV / CVC");
        jInternalFrame1.getContentPane().add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        cna.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        cna.setForeground(new java.awt.Color(153, 255, 255));
        cna.setText("Cardholder Name");
        jInternalFrame1.getContentPane().add(cna, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        mail.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        mail.setForeground(new java.awt.Color(153, 255, 255));
        mail.setText("Please enter OTP sent to your E-Mail");
        jInternalFrame1.getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        exp.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        exp.setForeground(new java.awt.Color(153, 255, 255));
        exp.setText("Expiry Date");
        jInternalFrame1.getContentPane().add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        amt1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        amt1.setForeground(new java.awt.Color(153, 255, 255));
        amt1.setText("Amount");
        jInternalFrame1.getContentPane().add(amt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        sub.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sub.setText("Submit");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 360, 90, -1));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setOpaque(true);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jInternalFrame1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        email.setText("jLabel2");
        jInternalFrame1.getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(110, 40, 800, 490);

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

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("Amazon");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 210, 70, 40);

        amzon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Picture2.png"))); // NOI18N
        amzon.setLabelFor(jLabel6);
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

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("Calculator");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 320, 90, 40);

        top_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/desk_topbar.png"))); // NOI18N
        getContentPane().add(top_bar);
        top_bar.setBounds(20, 20, 920, 20);

        tictac_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tictac_label.setForeground(new java.awt.Color(153, 255, 255));
        tictac_label.setText("Tic Tac Toe");
        getContentPane().add(tictac_label);
        tictac_label.setBounds(50, 120, 90, 30);

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

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<HTML> <HEAD> </HEAD> <BODY>Change <BR> Wallpaper </BODY> </HTML>");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 440, 80, 40);

        wallp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ama_pay.png"))); // NOI18N
        wallp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wallp1MouseClicked(evt);
            }
        });
        getContentPane().add(wallp1);
        wallp1.setBounds(190, 50, 100, 90);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Amazon Pay");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 120, 110, 40);

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

        desk_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seola_wall.png"))); // NOI18N
        desk_bg.setText("jLabel2");
        getContentPane().add(desk_bg);
        desk_bg.setBounds(20, 20, 920, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dellmonitor.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void dt() {    
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
       LocalDateTime now = LocalDateTime.now();  
       add_money.date.setText(dtf.format(now));  
      }

double ran1 = (Math.random()*10); 
int ran11 = (int)(ran1);
String n1 = String.valueOf(ran11);
double ran2 = (Math.random()*10);
int ran22 = (int)(ran2);
String n2 = String.valueOf(ran22);
double ran3 = (Math.random()*10);
int ran33 = (int)(ran3);
String n3 = String.valueOf(ran33);
double ran4 = (Math.random()*10);
int ran44 = (int)(ran4);
String n4 = String.valueOf(ran44);
double ran5 = (Math.random()*10);
int ran55 = (int)(ran5);
String n5 = String.valueOf(ran55);
double ran6 = (Math.random()*10);
int ran66 = (int)(ran6);
String n6 = String.valueOf(ran66);
String random = n1.concat(n2).concat(n3).concat(n4).concat(n5).concat(n6);
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

    private void wallp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wallp1MouseClicked
new Amazon_Pay.add_money().setVisible(true);
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

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
amt1.setVisible(false);
cna.setVisible(false);
cnat.setVisible(false);
cno.setVisible(false);
exp1.setVisible(false);
exp2.setVisible(false);
exp.setVisible(false);
cvv.setVisible(false);
amt.setVisible(false);
amount.setVisible(false);
cc.setVisible(false);
dc.setVisible(false);
jLabel10.setVisible(false);
cvvt.setVisible(false);
cht.setVisible(false);
otp.setEnabled(true);
otp.setEditable(true);
otp.setVisible(true);
mail.setVisible(true);
mail.setEnabled(true);
sub.setVisible(true);
sub.setEnabled(true);

      final String username = "noreply.seolaos@gmail.com";  
        final String password = "!@#456&*(0";                 

        Properties prop = new Properties();
	prop.put("mail.smtp.host", "smtp.gmail.com");  
        prop.put("mail.smtp.port", "587");            
        prop.put("mail.smtp.auth", "true");             
        prop.put("mail.smtp.starttls.enable", "true");  
        
        Session session = Session.getInstance(prop, new javax.mail.Authenticator()
                {
                    protected PasswordAuthentication getPasswordAuthentication() 
                        {
                            return new PasswordAuthentication(username, password);
                        }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("noreply.seolaos@gmail.com"));  //Sender Address
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email.getText()) //To Address
            );
            message.setSubject("(SeolaOS) Amazon Pay OTP");
            message.setText("Hey There!" + "\n" + na_label.getText() + ", Here is your OTP for the transaction :"
            + "\n" + random + "\n" + "Please don't share your OTP to anyone, keep it confidential!" );

            Transport.send(message); 

            

        } catch (MessagingException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }//GEN-LAST:event_jLabel10MousePressed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
String amnt = amount.getText();
        if(otp.getText().equals(random))
    {
try{
    Class.forName("java.sql.DriverManager");
    Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/seolaos", "root", "Mysql@123");
    Statement stmt = (Statement) c.createStatement();
    String qry = "update acc set Amt = Amt + '"+amnt+"' where email = '"+email.getText()+"';";
    stmt.executeUpdate(qry);
    JOptionPane.showMessageDialog(this, "Money added to your account!");
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conec = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/seolaos", "root", "Mysql@123");
            String text = email.getText();
            String qr = "Select * from acc where Email = '"+text+"';";
            Statement st = (Statement) conec.createStatement();
            ResultSet res = st.executeQuery(qr);
            if (res.next()) {
                String user = res.getString("Email");
                String pass = res.getString("Password");
                String uname = res.getString("Name");
                String pamt = res.getString("Amt");
                
                    new Pay().setVisible(true);
                    Pay.pay_amt.setText(String.valueOf(pamt));
                    Pay.na_label.setText("Welcome " + uname);
                    Pay.email.setText(user);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    dispose();
}

catch(Exception e)
{
    JOptionPane.showMessageDialog(this, e.getMessage());
}
    }
    else
    {
        JOptionPane.showMessageDialog(this, "OTP doesn't match! Please try again");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed


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
                new add_money().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    public static transient javax.swing.JLabel amt;
    private javax.swing.JLabel amt1;
    private javax.swing.JLabel amzon;
    private javax.swing.JLabel calc;
    private javax.swing.JRadioButton cc;
    private javax.swing.JTextField cht;
    private javax.swing.JLabel cna;
    private javax.swing.JTextField cnat;
    private javax.swing.JLabel cno;
    private javax.swing.JLabel cvv;
    private javax.swing.JTextField cvvt;
    public static transient javax.swing.JLabel date;
    private javax.swing.JRadioButton dc;
    public static transient javax.swing.JLabel desk_bg;
    public static transient javax.swing.JLabel email;
    private javax.swing.JLabel exp;
    private javax.swing.JComboBox<String> exp1;
    private javax.swing.JComboBox<String> exp2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static transient javax.swing.JLabel mail;
    public static transient javax.swing.JLabel na_label;
    public static transient javax.swing.JTextField otp;
    private javax.swing.JLabel pay;
    private javax.swing.JLabel pay_label;
    private javax.swing.JLabel shut;
    public static transient javax.swing.JButton sub;
    private javax.swing.JLabel tictac;
    private javax.swing.JLabel tictac_label;
    private javax.swing.JLabel top_bar;
    private javax.swing.JLabel wallp;
    private javax.swing.JLabel wallp1;
    private javax.swing.JLabel wetrans;
    private javax.swing.JLabel wetrans_label;
    // End of variables declaration//GEN-END:variables
}