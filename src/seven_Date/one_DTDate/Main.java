package seven_Date.one_DTDate;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        Date now = new Date();
        System.out.println(now);

        long t = now.getTime();
        System.out.println(t);

        System.out.println(new Date(t));
    }
}
