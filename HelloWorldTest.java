/**
 * 
 */

/**
 * 
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class JavaEclipse_HelloWorldTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testStartup() {
		JavaEclipse_HelloWorld  app = new JavaEclipse_HelloWorld();
		
		assertNotNull(app);
	}

}

