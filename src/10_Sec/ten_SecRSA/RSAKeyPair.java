package ten_Sec.ten_SecRSA;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSAKeyPair {
    // 私钥:
    PrivateKey sk;
    // 公钥:
    PublicKey pk;

    // 生成公钥／私钥对:
    public RSAKeyPair() throws GeneralSecurityException {
        KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");
        kpGen.initialize(1024);
        KeyPair kp = kpGen.generateKeyPair();
        this.sk = kp.getPrivate();
        this.pk = kp.getPublic();
    }

    // 从已保存的字节中（例如：读取文件）恢复公钥／私钥:
    public RSAKeyPair(byte[] pk, byte[] sk) throws GeneralSecurityException {
        KeyFactory kf = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec pkSpec = new X509EncodedKeySpec(pk);
        this.pk = kf.generatePublic(pkSpec);
        PKCS8EncodedKeySpec skSpec = new PKCS8EncodedKeySpec(sk);
        this.sk = kf.generatePrivate(skSpec);
    }

    // 把私钥导出为字节
    public byte[] getPrivateKey() {
        return this.sk.getEncoded();
    }

    // 把公钥导出为字节
    public byte[] getPublicKey() {
        return this.pk.getEncoded();
    }

    // 用公钥加密:
    public byte[] encrypt(byte[] message) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, this.pk);
        return cipher.doFinal(message);
    }

    // 用私钥解密:
    public byte[] decrypt(byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, this.sk);
        return cipher.doFinal(input);
    }

    public static void main(String[] args) throws Exception {
        // 明文:
        byte[] plain = "Hello，使用RSA非对称加密算法对数据进行加密！".getBytes("UTF-8");
        // 创建公钥／私钥对:
        RSAKeyPair rsa = new RSAKeyPair();
        // 加密:
        byte[] encrypted = rsa.encrypt(plain);
        System.out.println("encrypted: " + Base64.getEncoder().encodeToString(encrypted));
        // 解密:
        byte[] decrypted = rsa.decrypt(encrypted);
        System.out.println(new String(decrypted, "UTF-8"));
        // 保存公钥／私钥:
        byte[] pk = rsa.getPublicKey();
        byte[] sk = rsa.getPrivateKey();
        System.out.println("pk: " + Base64.getEncoder().encodeToString(pk));
        System.out.println("sk: " + Base64.getEncoder().encodeToString(sk));
        // 重新恢复公钥／私钥
        RSAKeyPair rsa2 = new RSAKeyPair(pk, sk);
        // 加密:
        byte[] encrypted2 = rsa2.encrypt(plain);
        System.out.println("encrypted: " + Base64.getEncoder().encodeToString(encrypted2));
        // 解密:
        byte[] decrypted2 = rsa2.decrypt(encrypted2);
        System.out.println(new String(decrypted2, "UTF-8"));
    }
}
