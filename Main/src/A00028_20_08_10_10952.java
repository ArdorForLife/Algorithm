import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A00028_20_08_10_10952 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int num1 = Integer.valueOf(str.nextToken());
			int num2 = Integer.valueOf(str.nextToken());
			if(num1 == 0 && num2 == 0) break;
			int sum = num1 + num2;
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}

}