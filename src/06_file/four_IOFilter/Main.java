package six_file.four_IOFilter;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        try (CountInputStream input = new CountInputStream(new GZIPInputStream(new BufferedInputStream(new FileInputStream("/home/jony/abc/readme.txt.gz"))))) {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int n;
            while( (n = input.read(buffer)) != -1) {
                output.write(buffer, 0, n);
            }
            byte[] data = output.toByteArray();
            String text = new String(data, "utf-8");
            System.out.println(text);
            System.out.println(input.count);
        }
    }
}
