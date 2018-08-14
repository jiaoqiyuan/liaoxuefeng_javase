package test.nine_Regex.one_RegexIntro; 

import nine_Regex.one_RegexIntro.Is1990s;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** 
* Is1990s Tester. 
* 
* @author <Authors name> 
* @since <pre>八月 14, 2018</pre> 
* @version 1.0 
*/ 
public class Is1990sTest { 


    /**
    *
    * Method: is19xx(String s)
    *
    */
    @Test
    public void testIs19xx() throws Exception {
        assertTrue(Is1990s.is19xx("1900"));
        assertTrue(Is1990s.is19xx("1910"));
        assertTrue(Is1990s.is19xx("1905"));
        assertTrue(Is1990s.is19xx("1902"));
        assertTrue(Is1990s.is19xx("1934"));

        assertTrue(Is1990s.is19xx(null));
    }


} 
