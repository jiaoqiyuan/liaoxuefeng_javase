package thirteen_NetProgram.two_TCPMultiThread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        InetAddress addr = InetAddress.getByName("localhost");
        try (Socket sock = new Socket(addr, 9090)){
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(sock.getInputStream(), StandardCharsets.UTF_8))){
                try (BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(sock.getOutputStream(), StandardCharsets.UTF_8))){
                    writer.write("time\n");
                    writer.flush();
                    String resp = reader.readLine();
                    System.out.println("Server Response: " + resp);
                    Thread.sleep(1000);
                    writer.write("q\n");
                    writer.flush();
                    resp = reader.readLine();
                    System.out.println("Server response: " + resp);
                }
            }
        }
    }
}
