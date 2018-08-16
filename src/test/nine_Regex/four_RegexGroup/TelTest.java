package test.nine_Regex.four_RegexGroup; 

import nine_Regex.four_RegexGroup.Tel;
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

    @Test
    public void testIsValidTel() {
        assertEquals(new Tel("010", "123456"), Tel.parse("010-123456"));
        assertEquals(new Tel("0123", "12345678"), Tel.parse("0123-12345678"));

        assertNull(Tel.parse("123-12345678"));
        assertNull(Tel.parse("010-0123456"));
        assertNull(Tel.parse("010#12345678"));
        assertNull(Tel.parse("0123-12345678"));
    }

} 
