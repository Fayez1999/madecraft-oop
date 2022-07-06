package exercises;

public class SmurfFactory {
	
	public static void main(String[] args) {
		Smurf.createSmurf("handy");
		Smurf papa = Smurf.createPapaSmurf();
		Smurf papa2 = Smurf.createPapaSmurf();
		Smurf papa3 = Smurf.createPapaSmurf();
		Smurf smurfette = Smurf.createSmurfetteSmurf();
		Smurf smurfette2 = Smurf.createSmurfetteSmurf();
		Smurf.createSmurf("smurfette");
		Smurf.createSmurf("smurfette");
		Smurf.createSmurf("smurfette");
		
		System.out.println(papa.hashCode());
		System.out.println(papa2.hashCode());
		System.out.println(papa3.hashCode());
		System.out.println(smurfette.hashCode());
		System.out.println(smurfette2.hashCode());
		
		int asInt = (int) 'k';
		System.out.println(asInt);
		
		char letter = (char) 99;
		
		System.out.println(letter);
	}

}
