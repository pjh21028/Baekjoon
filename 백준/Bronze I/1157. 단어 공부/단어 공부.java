import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int[] iArray = new int[26];
		String sString = br.readLine();
		int iMax = 0;
		char cResult = '?';
 
		for (int i = 0; i < sString.length(); i++) {
			if ('a' <= sString.charAt(i) && sString.charAt(i) <= 'z') {
				iArray[sString.charAt(i) - 97]++;
			} else {
				iArray[sString.charAt(i) - 65]++;
			}
		}
        
		for (int i = 0; i < 26; i++) {
 
			if (iArray[i] > iMax) {
				iMax = iArray[i];
				cResult = (char) (i + 65);
			} 
			else if (iArray[i] == iMax) {
				cResult = '?';
			}
		}
		System.out.print(cResult);
	}
}