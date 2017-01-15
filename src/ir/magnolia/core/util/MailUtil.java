package ir.magnolia.core.util;


import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import java.util.Properties;

public class MailUtil {

    public static boolean sendMail(String to, byte[] file, String subject, String body) {
        try {
            Properties properties = System.getProperties();
            properties.setProperty("mail.smtp.host", Configuration.getProperty("mail_host"));
            properties.setProperty("mail.smtp.port", Configuration.getProperty("mail_port"));
            Session session = Session.getDefaultInstance(properties);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Configuration.getProperty("mail_from")));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new ByteArrayDataSource(file, "application/pdf");
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(Configuration.getProperty("mail_filename"));
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            return true;
        } catch (Exception mex) {
            mex.printStackTrace();
            return false;
        }
    }
}
