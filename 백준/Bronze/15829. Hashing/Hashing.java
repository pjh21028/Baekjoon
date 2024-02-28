import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iStringLength = Integer.parseInt(br.readLine());
		String sString = br.readLine();
		long lResult = 0;
		long lPow = 1;
		for(int i = 0; i < iStringLength; i++) {
			lResult += ((sString.charAt(i) - 96) * lPow);
			lPow = (lPow * 31) % 1234567891;
		}
		System.out.println(lResult % 1234567891);
	}

}