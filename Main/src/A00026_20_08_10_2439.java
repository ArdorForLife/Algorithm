import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A00026_20_08_10_2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++) {
					bw.write(" ");
				}
				for(int j=1;j<=i;j++) {
					bw.write("*");
				}bw.write("\n");
			}
			bw.flush();
			bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
