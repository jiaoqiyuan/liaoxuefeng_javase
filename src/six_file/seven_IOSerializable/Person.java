package six_file.seven_IOSerializable;

import java.io.Serializable;

public class Person implements Serializable {
    private final String name;

    public Person(String name) {
        System.out.println("Create " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
