package email;

import com.sun.mail.smtp.SMTPTransport;
import org.apache.commons.cli.*;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Mail {
    public static void main(String[] args) throws MessagingException, ParseException, InterruptedException {
        // ex) --host=mail.test.com --port=25 --from=abc@test.com --to=test@test.com

        Options options = new Options();

        options.addOption(Option.builder().longOpt("host")
                .desc("smtp server host")
                .hasArg()
                .build());

        options.addOption(Option.builder().longOpt("port")
                .desc("smtp server port")
                .hasArg()
                .build());

        options.addOption(Option.builder().longOpt("from")
                .desc("from address")
                .hasArg()
                .build());

        options.addOption(Option.builder().longOpt("to")
                .desc("to address")
                .hasArg()
                .build());

        CommandLineParser parser = new DefaultParser();

        CommandLine line = parser.parse(options, args);

        String host = line.getOptionValue("host");
        String port = line.getOptionValue("port");
        String from = line.getOptionValue("from");
        String to = line.getOptionValue("to");

        String subject = "test subject";
        String body = "test message";

        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.ssl.protocols", "SSLv2Hello SSLv3");
//        props.put("mail.smtp.ssl.protocols", "SSLv2Hello TLSv1"); // 서버 SSLv3 지원 안 할 때 성공
//        props.put("mail.smtp.ssl.protocols", "SSLv3");
//        props.put("mail.smtp.ssl.protocols", "TLSv1");


        Session session = Session.getDefaultInstance(props, null);
        session.setDebug(true);

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));

        InternetAddress toAddress = new InternetAddress(to);

        message.addRecipient(Message.RecipientType.TO, toAddress);

        message.setSubject(subject);
        message.setText(body);

        SMTPTransport transport = (SMTPTransport)session.getTransport("smtp");

        transport.connect();

        transport.sendMessage(message, message.getAllRecipients());

        System.out.println(transport.getLastReturnCode());

        Thread.sleep(10000);
        transport.close();
    }
}
