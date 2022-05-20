import java.util.Scanner;

//series answer

//input # queries: 2
//input for query one: 0, 2, 10
//ouput 2, 6, 14, 30, 62, 126, 254, 510, 1022, 2046
//input for query two: 5, 3, 5
//output 8, 14, 26, 50, 98
//(a+2^0 *b),(a+2^0*b+2^1*b), 2^2, 2^3 etc

public class hackerrankp {
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            int pow_of_2=1;
            for(int j=0;j<n;j++){
                sum+=pow_of_2*b;
                pow_of_2*=2;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }

}
