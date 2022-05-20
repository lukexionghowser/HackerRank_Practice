package One;
import java.util.Scanner;

public class hackerrank3 {
	
	private static final int FIELD_LENGTH = 3;
	private static final String PADDING = "               "; // 15 spaces
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            
            String format = "%" + FIELD_LENGTH + "d";
            System.out.printf(format, x);
           //System.out.printf("%-30.30s  %-30.30s%n", s1, x);
            //System.out.printf(s1 + PADDING + x);

        }
        System.out.println("================================");

}

}
