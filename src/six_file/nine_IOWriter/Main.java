package six_file.nine_IOWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        try (Writer writer = new FileWriter("/home/jony/abc/readme.output.txt")) {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("/home/jony/abc/readme.output.txt"), "utf-8")) {
            writer.write("Hello");
            writer.write("你好");
            writer.write("你好");

        }
    }
}
