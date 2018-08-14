package test.nine_Regex.two_RegexTel; 

import nine_Regex.two_RegexTel.Tel;
import org.junit.Test;
import static org.junit.Assert.*;

/** 
* Tel Tester. 
* 
* @author <Authors name> 
* @since <pre>八月 14, 2018</pre> 
* @version 1.0 
*/ 
public class TelTest { 


    /**
    *
    * Method: isValidTel(String s)
    *
    */
    @Test
    public void testIsValidTel() throws Exception {
         assertTrue(Tel.isValidTel("010-123456"));
         assertTrue(Tel.isValidTel("010-12345678"));
         assertTrue(Tel.isValidTel("0123-123456"));
         assertTrue(Tel.isValidTel("0123-12345678"));
         assertTrue(Tel.isValidTel("123-12345678"));
         assertTrue(Tel.isValidTel("123-0123456"));

         assertTrue(Tel.isValidTel("010#12345678"));
         assertTrue(Tel.isValidTel("010X12345678"));
         assertTrue(Tel.isValidTel("01-12345678"));
         assertTrue(Tel.isValidTel("01234-12345678"));
         assertTrue(Tel.isValidTel("01A-12345678"));
         assertTrue(Tel.isValidTel("0123-12345"));
         assertTrue(Tel.isValidTel("0123-12345X"));
         assertTrue(Tel.isValidTel("0123-123456789"));
         assertTrue(Tel.isValidTel("0123-12345678X"));
    }


} 
