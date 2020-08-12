import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A00031_20_08_12_10039 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		int [] a = new int [5];
		
			for(int i=0;i<a.length;i++) {
				a[i] = Integer.parseInt(br.readLine());
				if(a[i]<40) {a[i]=40;}
				sum=sum+a[i];
		}System.out.println(sum/5);

	}
}
