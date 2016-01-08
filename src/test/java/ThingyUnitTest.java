import org.junit.Test;
import static org.junit.Assert.*;

public class ThingyUnitTest {
    @Test public void testSomeLibraryMethod() {
        Thingy classUnderTest = new Thingy();
        assertFalse("myMethod should return 'true'", classUnderTest.myMethod());
    }
}
