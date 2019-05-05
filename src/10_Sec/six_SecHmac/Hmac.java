package ten_Sec.six_SecHmac;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.math.BigInteger;
import java.security.Key;

public class Hmac {
    public static byte[] hmac(String hmacAlgorithm, SecretKey skey, byte[] input) throws Exception {
        Mac mac = Mac.getInstance(hmacAlgorithm);
        mac.init(skey);
        mac.update(input);
        return mac.doFinal();
    }

    public static void main(String[] args) throws Exception{
        String algorithm = "HmacSHA1";
        String data = "helloworld";
        KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
        SecretKey skey = keyGen.generateKey();
        byte[] key = skey.getEncoded();
        System.out.println(String.format("Key: %0" + (key.length *2) + "x", new BigInteger(1, key)));

        //用这个key计算HmacSHA1
        byte[] result = hmac(algorithm, skey, data.getBytes("UTF-8"));
        System.out.println(String.format("Hash: %0" + (result.length * 2) + "x", new BigInteger(1, result)));
    }
}
