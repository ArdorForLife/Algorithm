import java.util.Scanner;

public class A00019_20_08_07_8393 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
