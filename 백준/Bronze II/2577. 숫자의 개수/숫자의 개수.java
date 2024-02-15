import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {		

        int [] iArray = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum1, iNum2, iNum3, iMultiNum;
        String sString;

        iNum1 = Integer.parseInt(br.readLine());
        iNum2 = Integer.parseInt(br.readLine());
        iNum3 = Integer.parseInt(br.readLine());
        iMultiNum = iNum1*iNum2*iNum3;
        sString = String.valueOf(iMultiNum);
        
		for(int i = 0; i <= 9; i++) {
			int iCount = 0;
			for(int j = 0; j < sString.length(); j++) {
				if((sString.charAt(j) - '0') == i) {
                    iCount++;
                }
			}
			System.out.println(iCount);
		}
	}
}