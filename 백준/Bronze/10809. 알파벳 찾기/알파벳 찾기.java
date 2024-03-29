import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int iArray[] = new int[26];
		for (int i = 0; i < 26; i++) {
			iArray[i] = -1;
		}		
		for (int i = 0; i < s.length(); i++) {
			char cChar = s.charAt(i);

			if (iArray[cChar - 97] == -1) {
				iArray[cChar - 97] = i;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(iArray[i] + " ");
		}
	}
}