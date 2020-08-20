import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A00038_20_08_20_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] a = new int [9];
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		int [] b = new int [9];
		for(int j=0;j<b.length;j++) {
			b[j]=a[j];
		}
		Arrays.sort(a);
		
		for(int l=0;l<a.length;l++) {
			if(b[l]==a[8]) {temp=l;}
		}
		
		
		System.out.println(a[8]);
		System.out.println(temp+1);
	}

}
