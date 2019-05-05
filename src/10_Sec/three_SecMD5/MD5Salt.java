package ten_Sec.three_SecMD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Salt {
    public static byte[] toMD5(byte[] input) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md.update(input);
        return md.digest();
    }

    public static void main(String[] args) throws Exception{
        String s = "MD5照耀算法测试";
        String salt = "Random salt";
        byte[] r = MD5Salt.toMD5((s + salt).getBytes("UTF-8"));
        System.out.println(String.format("%032x", new BigInteger(1, r)));
    }
}
