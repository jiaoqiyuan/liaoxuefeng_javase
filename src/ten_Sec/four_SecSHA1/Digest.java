package ten_Sec.four_SecSHA1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Digest {
    public static byte[] digest(String hashAlgorithm, byte[] input) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance(hashAlgorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md.update(input);
        return md.digest();
    }

    public static void main(String[] args) throws Exception{
        String s = "Java摘要算法";
        byte[] input = s.getBytes("UTF-8");
        byte[] r1 = digest("MD5", input);
        System.out.println(r1.length + ": " + String.format("%0" + (r1.length * 2) + "x", new BigInteger(1, r1)));
        byte[] r2 = digest("SHA-1", input);
        System.out.println(r2.length + ": " + String.format("%0" + (r2.length * 2) + "x", new BigInteger(1, r2)));
        byte[] r3 = digest("SHA-256", input);
        System.out.println(r3.length + ": " + String.format("%0" + (r3.length * 2) + "x", new BigInteger(1, r3)));
//        byte[] r4 = digest("RipeMD160", input);
//        System.out.println(r4.length + ": " + String.format("%0" + (r4.length * 2) + "x", new BigInteger(1, r4)));

    }
}
