package One;

public class Puppy {
	public Puppy(String name) {
	//this constructor has only one parameter, name.
		System.out.print("Passed Name is: " + name);
	}
	public static void main(String [] args) {
		//now we are going to create an object myPuppy
		//can use either of these below
		//Puppy myPuppy = new Puppy("Tommy");
		new Puppy("Tommy");
	}

}
