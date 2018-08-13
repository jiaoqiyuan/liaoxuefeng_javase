package test.eight_JUnit.one_JUnitTest;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import eight_JUnit.one_JUnitTest.Caculator;

import static org.junit.Assert.assertEquals;


/**
* Caculator Tester.
*
* @author <Authors name>
* @since <pre>八月 13, 2018</pre>
* @version 1.0
*/
public class CaculatorTest {

@Before
public void before() throws Exception {
    System.out.println("before");
}

@After
public void after() throws Exception {
    System.out.println("after");
}

/**
*
* Method: caculate(String expression)
*
*/
@Test
public void testCaculate() throws Exception {
//TODO: Test goes here...
    assertEquals(3, new Caculator().caculate("1+2"));
    assertEquals(6, new Caculator().caculate("1+2+3"));
}

@Test
public void testCalculateWithSpace() {
    assertEquals(3, new Caculator().caculate(" 1 + 2"));
}

} 
