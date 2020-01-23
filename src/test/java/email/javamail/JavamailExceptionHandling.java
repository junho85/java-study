package email.javamail;

import com.sun.mail.smtp.SMTPAddressFailedException;
import com.sun.mail.smtp.SMTPSendFailedException;
import com.sun.mail.smtp.SMTPSenderFailedException;
import com.sun.mail.util.MailConnectException;
import org.junit.Test;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class JavamailExceptionHandling {
    @Test
    public void test_SMTPSenderFailedException() {
        //        final String host = "gmail-smtp-in.l.google.com.";
        final String host = "mx1.hanmail.net";

        final String from = "junho85-test@gmail.com";
        final String to = "junho85@daum.net";

        Properties properties = System.getProperties();

        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from)); // from
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress("junho85@daum.net")); // exists
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("junho85_not_exists@daum.net")); // not exists
            message.setSubject("This is subject"); // subject
            message.setText("This is body"); // content

            Transport.send(message); // send

            System.out.println("Sent message successfully");
        } catch (MessagingException messagingException) {
            messagingException.printStackTrace();

            Exception ex = messagingException;
            do {
                if (ex instanceof MailConnectException) {
                    // TODO
                } else if (ex instanceof SendFailedException) {
                    // send fail error

                    if (ex instanceof SMTPSenderFailedException) {
                        SMTPSenderFailedException smtpSenderFailedException = (SMTPSenderFailedException) ex;

                        // TODO
                        System.out.println("SMTPSenderFailedException");
                        System.out.println(smtpSenderFailedException.getAddress());
                        System.out.println(smtpSenderFailedException.getCommand());
                        System.out.println(smtpSenderFailedException.getReturnCode());

                    } else if (ex instanceof SMTPSendFailedException) {
                        System.out.println("SMTPSendFailedException");
                        // smtp send fail happened
                        SMTPSendFailedException smtpSendFailedException = (SMTPSendFailedException) ex;

                        // valid sent addresses
                        javax.mail.Address[] validSentAddresses = smtpSendFailedException.getValidSentAddresses();
                        if (validSentAddresses != null) {
                            for (javax.mail.Address address : validSentAddresses) {
                                System.out.println(address.toString());
                            }
                        }

                        // valid unsent addresses
                        javax.mail.Address[] validUnsentAddresses = smtpSendFailedException.getValidUnsentAddresses();
                        if (validUnsentAddresses != null) {
                            for (javax.mail.Address address : validUnsentAddresses) {
                                System.out.println(address.toString());
                            }
                        }

                    } else if (ex instanceof SMTPAddressFailedException) {
                        System.out.println("SMTPAddressFailedException");
                        SMTPAddressFailedException smtpAddressFailedException = (SMTPAddressFailedException) ex;

                        final int returnCode = smtpAddressFailedException.getReturnCode();
                        String message = smtpAddressFailedException.getMessage();

                        System.out.println(smtpAddressFailedException.getAddress().toString());
                        System.out.println(returnCode);
                        System.out.println(message);
                    }
                }

                if (ex instanceof MessagingException) {
                    ex = ((MessagingException) ex).getNextException();
                } else {
                    ex = null;
                }
            } while (ex != null);
        }

    }
}
