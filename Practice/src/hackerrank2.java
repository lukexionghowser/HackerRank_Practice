package One;
import java.util.Scanner;

public class hackerrank2 {
	
	//input example using integer and string
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        int i = 0;
	        double d = 0.0;
	        try {
	            i = Integer.parseInt(scan.nextLine());
	            d = Double.parseDouble(scan.nextLine());
	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	        }
	        String s = scan.nextLine();
	        
	        /*
	         //can't do nextLine() for a string after nextInt()
	        int i = scan.nextInt(); 
	        double d = scan.nextDouble();
	        String s = scan.nextLine();

*/

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }

}
