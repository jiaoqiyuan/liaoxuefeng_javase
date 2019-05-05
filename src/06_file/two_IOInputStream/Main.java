package six_file.two_IOInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        try (InputStream input = new FileInputStream("/home/jony/abc/readme.txt")) {
            int n;
            byte[] buffer = new byte[1000];
            while ((n = input.read(buffer)) != -1) {
                System.out.println(n + " bytes read.");
            }
        }
    }
}
