import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class JavaHelloWorldTests {

	@Test
	void testEcho() {
		JavaEclipse_HelloWorld app = new JavaEclipse_HelloWorld();
		
		String message = "Hello world";
		assertNotNull(app);
		assertEquals(message, app.echo(message));
	}
	
	@Test
	void testFail() {
		assertTrue(true);
	}

}
