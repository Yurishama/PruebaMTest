import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static junit.framework.Assert.assertTrue;


public class DummyUnitTest {

    @Before
    public void beforeTestDo(){
        System.out.println("BeforeTest");
    }

    @Test
    public void dummyTest() {
        System.out.println("This is a Test");
        assertTrue(true);

    }

    @After
    public void afterTestDo(){
        System.out.println("AfterTest");
    }
}