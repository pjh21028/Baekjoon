import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int iNum1 = Integer.parseInt(st.nextToken());
		int iNum2 = Integer.parseInt(st.nextToken());
		int iMax = Math.max(iNum1, iNum2);
		int iMin = Math.min(iNum1, iNum2);
		int iQuot = iMax;
		int iRemain = iMin;
		
		while(iQuot % iRemain != 0) {
			int iNextQuot = iQuot;
			iQuot = iRemain;
			iRemain = iNextQuot % iRemain;
		}
		System.out.println(iRemain);
		
		int iInteger = iMax;
		while(iMax % iMin != 0) {
			iMax += iInteger;
		}
		System.out.println(iMax);
	}

}