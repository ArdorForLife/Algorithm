import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A00023_20_08_10_11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i=1;i<=t;i++) {
				String text = br.readLine();
				String[] word = text.split(" ");
				int a = Integer.parseInt(word[0]);
				int b = Integer.parseInt(word[1]);
				bw.write("Case #"+i+": "+(a+b)+"\n");
			}
			bw.flush();
			bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
