package ten_Sec.sven_SecAES;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Base64;

public class AES_ECB_Cipher {
    static final String CIPHER_NAME = "AES/ECB/PKCS5Padding";

    //加密
    public static byte[] encrypt(byte[] key, byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance(CIPHER_NAME);
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return cipher.doFinal(input);
    }

    //解密
    public static byte[] decrypt(byte[] key, byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance(CIPHER_NAME);
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        return cipher.doFinal(input);
    }

    public static void main(String[] args) throws Exception{
        //原文
        String message = "Hello, world! encrypted using AES!";
        System.out.println("Message: " + message);
        //128位密钥=16 bytes Key:
        byte[] key = "1234567890abcdef".getBytes("UTF-8");
        //加密
        byte[] data = message.getBytes(StandardCharsets.UTF_8);
        byte[] encrypted = encrypt(key, data);
        System.out.println("Encrypted data: " + Base64.getEncoder().encodeToString(encrypted));
        //解密
        byte[] decrypted = decrypt(key, encrypted);
        System.out.println("Decrypted data: " + new String(decrypted, "UTF-8"));

    }
}
