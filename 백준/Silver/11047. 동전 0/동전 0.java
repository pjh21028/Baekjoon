import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int iCoinNum = Integer.parseInt(st.nextToken());
		int iMoneySum = Integer.parseInt(st.nextToken());
		int [] iCoinSample = new int [iCoinNum];
		int iCount = 0;
		
		for(int i = 0; i < iCoinNum; i++) {
			iCoinSample[i] = Integer.parseInt(br.readLine());
		}
		for(int i = iCoinNum - 1; i >= 0; i--) {
			if(iCoinSample[i] <= iMoneySum) {
				iCount += (iMoneySum / iCoinSample[i]);
				iMoneySum %= iCoinSample[i];
			}
		}
		System.out.println(iCount);
	}
}