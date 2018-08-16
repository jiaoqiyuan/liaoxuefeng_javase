package ten_Sec.two_SecBase64;

import java.util.Base64;

public class SecBase64 {
    public static void main(String[] args) throws Exception{
        String original = "Hello\u00ff编码测试";
        String b64 = Base64.getUrlEncoder().withoutPadding().encodeToString(original.getBytes("UTF-8"));
//        String b64 = Base64.getEncoder().withoutPadding().encodeToString(original.getBytes("UTF-8"));
        System.out.println(b64);
        String ori = new String(Base64.getUrlDecoder().decode(b64), "UTF-8");
        System.out.println(ori);
    }
}
