package One;

public class ArrayofArraysDemo {
	public static void main(String[] args) {
		String [] [] cartoons = {
				{"Flintstones", "Fred", "Wilma", "Pebbles", "Dino"},
				{"Rubbles", "Barney", "Betty"},
				{"Jetsons", "George", "Jane"},
				{"Scooby Doo Gang", "Scooby Doo", "Shaggy"}};
		
		for (int i = 0; i < cartoons.length; i++) {
			System.out.print(cartoons[i][0] + ":");
			for (int j = 1;j < cartoons[i].length; j++) {
				System.out.print(cartoons[i][j] + ":");;
			}
		}
		}
	}
//desired print out:
// Flintstones:Fred:Wilma:Pebbles:Dino:Rubbles:Barney:Betty:Jetsons:George:Jane:Scooby Doo Gang:Scooby Doo:Shaggy:


