import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int[][] iDP = new int[30][30];
 
		for (int i = 0; i < 30; i++) {
			iDP[i][i] = 1;
			iDP[i][0] = 1;
		}
        for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				iDP[i][j] = iDP[i - 1][j - 1] + iDP[i - 1][j];
			}
		}
        StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        int iTestCase = Integer.parseInt(br.readLine());
        
		for(int i = 0; i < iTestCase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int iLeft = Integer.parseInt(st.nextToken());	
			int iRight = Integer.parseInt(st.nextToken());
					
			sb.append(iDP[iRight][iLeft]).append('\n');
		}
		
		System.out.println(sb);
    }
}