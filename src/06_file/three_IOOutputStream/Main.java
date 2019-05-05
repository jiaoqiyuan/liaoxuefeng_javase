package six_file.three_IOOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        try(OutputStream output = new FileOutputStream("/home/jony/abc/readme.txt.bak")) {
            byte[] b1 = "Hello".getBytes("utf-8");
            output.write(b1);
            byte[] b2 = "你好".getBytes("utf-8");
            output.write(b2);
        }
    }
}