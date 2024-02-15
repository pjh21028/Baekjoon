import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iNum = Integer.parseInt(br.readLine());

        for(int i = 0; i < iNum; i++) {
            String[] sStringArray = br.readLine().split(" ");

            int iRepeatingNum = Integer.parseInt(sStringArray[0]);
			String sString = sStringArray[1];
			
			for(int j = 0; j < sString.length(); j++) {
				for(int k = 0; k < iRepeatingNum; k++) {
					System.out.print(sString.charAt(j));
				}
			}
            System.out.println();
        }
	}
}