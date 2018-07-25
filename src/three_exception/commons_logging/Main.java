package three_exception.commons_logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    static Log log = LogFactory.getLog(Main.class);
    public static void main(String[] args) {
        Person p = new Person("xiao hong");
        log.info(p.hello());
        System.out.println(p.hello());
        try {
            new Person(null);
        } catch (Exception e) {
            log.error("Exception", e);
        }

    }
}
