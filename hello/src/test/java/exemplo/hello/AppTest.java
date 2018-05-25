package exemplo.hello;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
	
	@Test
    public void testApp()    {
		
        final String expected = "Hello World!";
		final String actual = App.getGreeting();
		assertTrue( expected.equals(actual) );
        
    }
}
