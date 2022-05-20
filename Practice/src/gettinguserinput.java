package One;
import java.util.Scanner;

public class gettinguserinput {
	public static void main(String[] args) {
		// create the scanner object
		Scanner input = new Scanner(System.in);
		
		//output
		System.out.print("enter a floating point value please:  ");
		
		//wait for the user to enter something
		double value = input.nextDouble();
		
		//tell the user what was entered
		System.out.print("You entered: " + value);
	}

}
