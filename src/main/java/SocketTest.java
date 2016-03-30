import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.LineOutputStream;
import org.apache.commons.cli.*;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Properties;

public class SocketTest {
    public static void main(String[] args) throws MessagingException, ParseException, InterruptedException, IOException {
        String hostname = "wwl1726.daum.net";
        int port = 4240;

        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(hostname, port), 1 * 1000);

        LineInputStream in = new LineInputStream(new BufferedInputStream(socket.getInputStream()));
        LineOutputStream out = new LineOutputStream(new BufferedOutputStream(socket.getOutputStream()));

        String line = in.readLine();
        System.out.println(line);

    }
}
