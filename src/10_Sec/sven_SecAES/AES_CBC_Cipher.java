package ten_Sec.sven_SecAES;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Base64;

import static java.lang.String.join;

public class AES_CBC_Cipher {

    public static byte[] join(byte[] bs1, byte[] bs2) {
        byte[] r = new byte[bs1.length + bs2.length];
        System.arraycopy(bs1, 0, r, 0, bs1.length);
        System.arraycopy(bs2, 0, r, bs1.length, bs2.length);
        return r;
    }

    static final String CIPHER_NAME = "AES/CBC/PKCS5Padding";
    //加密
    public static byte[] encrypt(byte[] key, byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance(CIPHER_NAME);
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");

        //CBC模式需要生成一个16 bytes的initialization vector
        SecureRandom sr = SecureRandom.getInstanceStrong();
        byte[] iv = sr.generateSeed(16);
        IvParameterSpec ivps = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivps);
        byte[] data = cipher.doFinal(input);
        //IV不需要保密，把IV和密文一起返回
        return join(iv, data);
    }

    //解密
    public static byte[] decrypt(byte[] key, byte[] input) throws GeneralSecurityException {
        //把input分割成IV和密文
        byte[] iv = new byte[16];
        byte[] data = new byte[input.length - 16];
        System.arraycopy(input, 0, iv, 0, 16);
        System.arraycopy(input, 16, data, 0, data.length);

        //解密
        Cipher cipher = Cipher.getInstance(CIPHER_NAME);
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        IvParameterSpec ivps = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivps);
        return cipher.doFinal(data);
    }

    public static void main(String[] args) throws Exception{
        //原文
        String message = "Hello, world! encrypted using AES!";
        System.out.println("Message: " + message);
        //128位密钥=16 bytes Kye:
        byte[] key = "1234567890abcdef".getBytes("UTF-8");
        //加密
        byte[] data = message.getBytes(StandardCharsets.UTF_8);
        byte[] encrypted = encrypt(key, data);
        System.out.println("Encrypted data: " + Base64.getEncoder().encodeToString(encrypted));

        //解密
        byte[] decrypted = decrypt(key, encrypted);
        System.out.println("Decrypted data:  " + new String(decrypted, "UTF-8"));
    }
}
