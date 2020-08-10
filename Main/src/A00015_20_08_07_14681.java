import java.util.Scanner;

public class A00015_20_08_07_14681 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();
		
		if(x>0 && y>0) System.out.println("1");
		if(x>0 && y<0) System.out.println("4");
		if(x<0 && y>0) System.out.println("2");
		else if(x<0 && y<0) System.out.println("3");
		
		
	}

}
