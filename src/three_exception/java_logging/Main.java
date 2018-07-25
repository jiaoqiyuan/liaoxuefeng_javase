package three_exception.java_logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.setLevel(Level.WARNING);
        logger.info("Create new person...");
        Person p = new Person("xiao hong");
        System.out.println(p.hello());
        try {
            new Person(null);
        } catch (Exception e) {
            logger.log(Level.WARNING, "Create new person failed", e);
        }

        logger.info("Program end.");
    }
}
