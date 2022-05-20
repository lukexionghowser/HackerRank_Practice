import java.util.*;
import java.io.*;

public class series {
	
	public static void main(String []argh){
		
		
        Scanner in = new Scanner(System.in);
        int q=in.nextInt(); //number of queries
        
        if(q <= 500 && q >= 0) { //this works to 0=<q=<500
        
        for(int i=0;i<q;i++){ //this loop is working based on q
        	//should for loop be a while loop? nesting loop inside loop
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int z = 0; //for exponent loop

            int m = 0;
            double p = Math.pow(m,z);
            
            //input # queries: 2
            //input for query one: 0, 2, 10
            //ouput 2, 6, 14, 30, 62, 126, 254, 510, 1022, 2046
          //input for query two: 5, 3, 5
            //output 8, 14, 26, 50, 98
            
          while (z < n) {
            if(a <=50 && a >=0) {
            	
            	double x = Math.pow(2,z);
            	int y = 0;

            	//this is the working line but off by 2
            	System.out.println( a + Math.round(x)* b );
                m = ( a + 1 * b);
                // (a + 1*b) + (2*b) + (4*b) + (8*b) + (16*b) + (32*b) etc
                //System.out.println(m + Math.round(x) *b);
                
            } else {
            	System.out.println("Enter a value between 0-50 only.");
            }
            
           // System.out.println("z count= " +z);
           // m = 
            //System.out.println(m + p *b);
            z++;
        }
        
        in.close();
    }
	}//close if 
        else {
        	//input validation for q
        	System.out.println("Enter a value between 0-500 only.");
	
	
	}}
	
}
