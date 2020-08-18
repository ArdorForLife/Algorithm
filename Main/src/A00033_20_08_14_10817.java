import java.util.Arrays;
import java.util.Scanner;

public class A00033_20_08_14_10817 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int [] X = new int [3];
		for(int i=0;i<X.length;i++) {
			X[i]=sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(X);
		System.out.println(X[1]);
		
		
	}

}
