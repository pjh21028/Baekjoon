import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iNum = Integer.parseInt(br.readLine());
		int iSum = 0;
		String[] sStr = br.readLine().split("");
		br.close();
		
		for(int i = 0; i < iNum; i++) {
			iSum += Integer.parseInt(sStr[i]);
		}
		System.out.println(iSum);
	}
}