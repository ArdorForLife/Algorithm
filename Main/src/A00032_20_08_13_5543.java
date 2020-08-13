import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A00032_20_08_13_5543 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int bur,bev;
		
		int [] a = new int [5];
		
		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		if(a[0]>a[1]) bur=a[1];
		else bur=a[0];
		if(bur>a[2]) bur=a[2];
		else {};
		
		if(a[3]>a[4]) bev=a[4];
		else bev=a[3];
					
		System.out.println(bur+bev-50);
	}

}
