import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A00039_20_08_21_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int [] A = new int [10];
		String str = String.valueOf(N);
		
		for(int i=0;i<str.length();i++) {
			A[(str.charAt(i)-48)]++;
		}
		
		for(int j : A) {
			System.out.println(j);
		}
		
		
		
	}

}
