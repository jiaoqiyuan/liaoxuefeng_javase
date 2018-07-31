package six_file.one_ioFile;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File linux = new File("/home/jony");
        System.out.println(linux.isDirectory());

        File notepad = new File("/home/jony/examples");
        System.out.println(notepad.isFile());

        File dir = new File("/home/jony/abc");
        System.out.println(dir.mkdir());

        File readme = new File("/home/jony/abc/readme.txt");
        System.out.println(readme.isFile());
        System.out.println(readme.getAbsolutePath());


    }
}
