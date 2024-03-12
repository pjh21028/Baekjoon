import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int iCityNum = Integer.parseInt(br.readLine());
		
		long[] lRoadNum = new long[iCityNum - 1];	
		long[] iCost = new long[iCityNum]; 
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < iCityNum - 1; i++) {
			lRoadNum[i] = Long.parseLong(st.nextToken());
		}
	
		st = new StringTokenizer(br.readLine(), " ");
		for(int j = 0; j < iCityNum; j++) {
			iCost[j] = Long.parseLong(st.nextToken());
		}
		
		long lSum = 0;
		long lMinCost = iCost[0];
 
 
		for(int i = 0; i < iCityNum - 1; i++) {
		    if(iCost[i] < lMinCost) {
		        lMinCost = iCost[i];
			}
			lSum += (lMinCost * lRoadNum[i]);
		}
		System.out.println(lSum);
	}
}