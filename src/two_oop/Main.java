package two_oop;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Math
        System.out.println(Math.sqrt(2));

        //Random
        Random rnd = new Random(123456);
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt());

        //SecureRandom
        SecureRandom sr = new SecureRandom();
        System.out.println(sr.nextInt());
        System.out.println(sr.nextInt());

        //BigInteger
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5));  //bi的5次方

        //BigDecimal
        BigDecimal bd = new BigDecimal("123.10");
        System.out.println(bd.multiply(bd));
    }
}
