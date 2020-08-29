import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class HelloTest {

        @Test
        public void testGetHello() {
            assertEquals("Hello, World!", new Hello().getHello());
        }

}
