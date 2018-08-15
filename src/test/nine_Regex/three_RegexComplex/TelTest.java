package test.nine_Regex.three_RegexComplex; 

import nine_Regex.three_RegexComplex.Tel;
import org.junit.Test;
import static org.junit.Assert.*;

/** 
* Tel Tester. 
* 
* @author <Authors name> 
* @since <pre>八月 16, 2018</pre> 
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
        assertTrue(Tel.isValidTel("0123-12345678"));
        assertFalse(Tel.isValidTel("123-12345678"));
        assertFalse(Tel.isValidTel("123-0123456"));
        assertFalse(Tel.isValidTel("010-023456"));
        assertFalse(Tel.isValidTel("0123-01234567"));
    }


} 
