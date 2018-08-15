package test.nine_Regex.three_RegexComplex; 

import nine_Regex.three_RegexComplex.QQ;
import org.junit.Test;
import static org.junit.Assert.*;

/** 
* QQ Tester. 
* 
* @author <Authors name> 
* @since <pre>八月 15, 2018</pre> 
* @version 1.0 
*/ 
public class QQTest { 

    /**
    *
    * Method: isValidQQ(String s)
    *
    */
    @Test
    public void testIsValidQQ() throws Exception {
        assertTrue(QQ.isValidQQ("10000"));
        assertTrue(QQ.isValidQQ("99999"));
        assertTrue(QQ.isValidQQ("1234567890"));
        assertTrue(QQ.isValidQQ("9999999999"));
        assertFalse(QQ.isValidQQ("00001"));
        assertFalse(QQ.isValidQQ("099999"));
    }


} 
