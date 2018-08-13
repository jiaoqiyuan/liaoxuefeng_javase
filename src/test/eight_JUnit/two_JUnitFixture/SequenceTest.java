package test.eight_JUnit.two_JUnitFixture;

import org.junit.*;

public class SequenceTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("    setUp()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("    tearDown()");
    }

    public SequenceTest() {
        System.out.println("  new SequenceTest()");
    }

    @Test
    public void testA() {
        System.out.println("    testA()");
    }

    @Test
    public void testB() {
        System.out.println("    testB()");
    }

    @Test
    public void testC() {
        System.out.println("    testC()");
    }
}
