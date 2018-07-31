package six_file.seven_IOSerializable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String dataFile = "saved.data";
        try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            output.writeInt(999);
            output.writeUTF("Hello, world!");
            output.writeObject(new Person("xiaoming"));
        }
        System.out.println("Read...");
        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
            System.out.println(input.readInt());
            System.out.println(input.readUTF());
            System.out.println((Person)input.readObject());
        }
    }
}
