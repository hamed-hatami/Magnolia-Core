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

    public static void main(String[] args) {
        MailUtil.sendMail("info@CafeParvaz.ir", "hamedhatami2012@gmail.com", "sample".getBytes(), "subject", "message body");
    }

    public static boolean sendMail(String from, String to, byte[] file, String subject, String body) {
        try {
            Properties properties = System.getProperties();
            properties.setProperty("mail.smtp.host", "127.0.0.1");
            properties.setProperty("mail.smtp.port", "25");
            Session session = Session.getDefaultInstance(properties);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new ByteArrayDataSource(file, "application/pdf");
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("CafeParvaz.pdf");
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            return true;
        } catch (Exception mex) {
            return false;
        }
    }
}
