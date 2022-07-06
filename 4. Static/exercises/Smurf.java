package exercises;

public class Smurf {
	
	private static Smurf PAPA;
	private static Smurf SMURFETTE;
	
	private String name;

	public static Smurf createSmurf(String name) {
		
		
		if (name == "papa" | name == "smurfette") {
			
			return null;
			
		}
		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	public String getName() {
		return name;
	}
	
	public static Smurf createPapaSmurf() {
		
		if(PAPA == null) {
			System.out.println("Creating " + "papa" + " Smurf");
			PAPA = new Smurf("Papa");
			return PAPA;
		}
		
		System.out.println("Papa has already been created");
		return PAPA;
	}
	
public static Smurf createSmurfetteSmurf() {
		
		if(SMURFETTE == null) {
			System.out.println("Creating " + "smurfette" + " Smurf");
			SMURFETTE = new Smurf("Smurfette");
			return SMURFETTE;
		}
		
		System.out.println("Smurfette has already been created");
		return SMURFETTE;
	}
	
	
	
	

}
