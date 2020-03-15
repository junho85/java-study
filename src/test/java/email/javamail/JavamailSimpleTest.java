package email.javamail;

import com.sun.mail.smtp.SMTPAddressSucceededException;
import com.sun.mail.smtp.SMTPTransport;
import org.junit.Test;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class JavamailSimpleTest {
    @Test
    public void test_normal() {
//        final String host = "gmail-smtp-in.l.google.com.";
        final String host = "mx1.hanmail.net";

        final String from = "junho85-test@gmail.com";
        final String to = "junho85@daum.net";

        Properties properties = System.getProperties();

        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);
        session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from)); // from
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); // recipients
            String subject = "This is subject";
            message.setSubject(subject); // subject
            message.setText("This is body"); // content

            Transport.send(message); // send

            // can't get success response code and message

            System.out.println("Sent message successfully");
        } catch (SMTPAddressSucceededException e) {
            System.out.println("SMTPAddressSucceededException");
            System.out.println("SMTPAddressSucceededException getReturnCode = " + e.getReturnCode());
//            System.out.println("SMTPAddressSucceededException getLastServerResponse = " + e.get());
        } catch (MessagingException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void test_normal_success_code_message() {
//        final String host = "gmail-smtp-in.l.google.com.";
        final String host = "mx1.hanmail.net";

        final String from = "junho85-test@gmail.com";
        final String to = "junho85@daum.net";

        Properties properties = System.getProperties();

        // .connect 에서 host 를 인자로 넘기기 때문에 불필요
//        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);
        session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from)); // from
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); // recipients
            String subject = "테스트 제목 입니다." + Thread.currentThread().getStackTrace()[1].getMethodName();
            message.setSubject(subject); // subject
            message.setText("This is body"); // content

            SMTPTransport smtpTransport = (SMTPTransport) session.getTransport("smtp");

            smtpTransport.connect(host, "", "");
            smtpTransport.sendMessage(message, message.getAllRecipients());

            System.out.println("Sent message successfully");

            System.out.println("getLastReturnCode=" + smtpTransport.getLastReturnCode());
            System.out.println("getLastServerResponse=" + smtpTransport.getLastServerResponse());

            System.out.println("reportsuccess:" + smtpTransport.getReportSuccess());
        } catch (SMTPAddressSucceededException e) {
            System.out.println("SMTPAddressSucceededException");
            System.out.println("SMTPAddressSucceededException getReturnCode = " + e.getReturnCode());
//            System.out.println("SMTPAddressSucceededException getLastServerResponse = " + e.get());
        } catch (MessagingException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
