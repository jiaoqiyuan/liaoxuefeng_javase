package test.nine_Regex.five_RegexGreedy; 

import nine_Regex.five_RegexGreedy.ZeroCount;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;

/** 
* ZeroCount Tester. 
* 
* @author <Authors name> 
* @since <pre>八月 16, 2018</pre> 
* @version 1.0 
*/ 
public class ZeroCountTest { 

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: zeros(String s)
    *
    */
    @Test
    public void testZeros() throws Exception {
        assertEquals(0, ZeroCount.zeros("123456"));
        assertEquals(1, ZeroCount.zeros("123450"));
        assertEquals(2, ZeroCount.zeros("123400"));
        assertEquals(3, ZeroCount.zeros("123000"));
        assertEquals(4, ZeroCount.zeros("120000"));
        assertEquals(2, ZeroCount.zeros("100100"));
    }


} 
