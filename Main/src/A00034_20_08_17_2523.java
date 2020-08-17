import java.util.Scanner;

public class A00034_20_08_17_2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] a = new int [2*n-1];
		
		for(int i=0;i<a.length;i++) {
		if(i<=n-1) a[i]=i+1;
		else if(i>n-1) a[i]=a[2*n-2-i];
			for(int j=1;j<a[i]+1;j++) {
				System.out.print("*");
			}System.out.println();
		}

	}
		
		
}
