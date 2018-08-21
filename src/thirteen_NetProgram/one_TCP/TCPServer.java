package thirteen_NetProgram.one_TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class TCPServer {

    public LocalDateTime currentTime() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9090);
        System.out.println("TCP server ready.");
        Socket sock = ss.accept();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(sock.getInputStream(), StandardCharsets.UTF_8))) {
            try (BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(sock.getOutputStream(), StandardCharsets.UTF_8))) {
                String cmd = reader.readLine();
                if ("time".equals(cmd)) {
                    writer.write(LocalDateTime.now().toString() + "\n");
                    writer.flush();
                } else {
                    writer.write("Sorry?\n");
                    writer.flush();
                }
            }
        }
        sock.close();
        ss.close();
    }
}
