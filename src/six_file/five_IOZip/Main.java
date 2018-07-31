package six_file.five_IOZip;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        try (ZipInputStream zip = new ZipInputStream(new BufferedInputStream(new FileInputStream("/home/jony/abc/readme.zip")))) {
            ZipEntry entry = null;
            while ( (entry = zip.getNextEntry()) != null) {
                if (entry.isDirectory()) {
                    System.out.println("F  " + entry.getName() + " " + entry.getSize());
                } else {
                    System.out.println("D " + entry.getName());
                    printFileContent(zip);
                }
            }
        }
    }

    static void printFileContent(ZipInputStream zip) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int n;
        while ( (n = zip.read(buffer)) != -1) {
            output.write(buffer, 0, n);
        }
        byte[] data = output.toByteArray();
        System.out.println("Size: " + data.length);
        System.out.println(new String(data, "utf-8"));
    }
}
