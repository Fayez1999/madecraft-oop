package examples;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlayingWithJunit {

	@Test
	void testName() throws Exception {
		assertEquals(4, Calculator.add(2,2));
	}
	
	@Test
	void testName2() {
		assertEquals(9, Calculator.subtract(7, 2));
	}
}
