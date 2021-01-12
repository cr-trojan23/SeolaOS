/*
 * Copyright (C) 2020 Srinivas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package WeTransfer;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.Tag;
import java.awt.HeadlessException;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author Srinivas
 */
public class WeTrans_test{

    /**
     *
     * @author Pandu
     */
    public static void transfer()
    {         
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String text = WeTrans_home.a2.getText();
            String to_address = WeTrans_home.a1.getText();
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
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            try {
             Regions clientRegion = Regions.AP_SOUTH_1;
             String bucketName = "seola-os";
             String filePath = WeTrans_home.a3.getText();
             String fileName = WeTrans_home.fname.getText();
        
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                    .withRegion(clientRegion)
                    .build();
            
            PutObjectRequest request = new PutObjectRequest(bucketName, fileName, new File(filePath));
            AccessControlList acl = new AccessControlList();
            acl.grantPermission(GroupGrantee.AllUsers, Permission.Read);
            request.setAccessControlList(acl);
            List<Tag> tags = new ArrayList<>();
            tags.add(new Tag("archive", "true"));
            request.setTagging(new ObjectTagging(tags));
            s3Client.putObject(request);
           
            URL url = s3Client.getUrl(bucketName, fileName);
            
            System.out.println(url);
            
            
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("noreply.seolaos@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to_address)
            );
            message.setSubject("File transfer successful");
            message.setText("'"+uname+"' has sent you some files. Click this url  : " + String.valueOf(url));

            Transport.send(message);
            
            }
            catch (AmazonServiceException e) {

            System.out.println(e);
        } catch (SdkClientException e) {

            System.out.println(e);
        }
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
        }
catch ( HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
        
        }     
    
        }



