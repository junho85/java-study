package net;

import org.junit.Test;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class TLSTest {
    @Test
    public void test() throws IOException {
        final String host = "pop3.lolipop.jp";
        final int port = 995;

//        System.setProperty("javax.net.debug", "ssl");
        System.setProperty("javax.net.debug", "all");

        SSLSocketFactory basicSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) basicSocketFactory.createSocket(host, port);
        socket.startHandshake();

        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                socket.getOutputStream())));

//        out.println("GET / HTTP/1.0");
//        out.println();
//        out.flush();

        /*
         * Make sure there were no surprises
         */
//        if (out.checkError())
//            System.out.println(
//                    "SSLSocketClient:  java.io.PrintWriter error");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));

        String inputLine;

        inputLine = in.readLine();
        System.out.println(inputLine);

//        while ((inputLine = in.readLine()) != null)
//            System.out.println(inputLine);

        in.close();
        out.close();
        socket.close();
//        SSLSocketFactory tlsSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
//        socket = tlsSocketFactory.createSocket(socket, host, port, true);
    }
}
