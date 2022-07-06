package exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
	
	@org.junit.jupiter.api.Test
	public void test() {
		BetterArrayList<String> names = new BetterArrayList<String>();
		
		names.add("Fayez");
		names.add("Tony");
		names.add("Ghalid");
		names.add("Connor");
		names.add("Joey");
		
		assertEquals("Joey", names.pop());
		
		
	}

}
