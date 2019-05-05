package ten_Sec.four_SecSHA1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA {
    public static byte[] toSHA1(byte[] input) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md.update(input);
        return md.digest();
    }

    public static void main(String[] args) throws Exception{
        String s = "MD5照耀算法测试";
        byte[] r = toSHA1(s.getBytes("UTF-8"));
        System.out.println(String.format("%040x", new BigInteger(1, r)));
    }
}
