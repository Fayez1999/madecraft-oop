package exercises;

public class Main {
	
	public static void main(String[] args) {
		
		BetterArrayList<String> strings = new BetterArrayList<String>();
		
		strings.add("Fayez");
		strings.add("Tony");
		strings.add("Ghalid");
		strings.add("Connor");
		strings.add("Joey");
		
		strings.printList();
		System.out.println(strings.pop());
	}

}
