import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iIntegerNum = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
    int[] iNumArray = new int[iIntegerNum];
    int[] iDp = new int[iIntegerNum];
    
    for(int i = 0; i < iIntegerNum; i++) {
      iNumArray[i] = Integer.parseInt(st.nextToken());
    }

    iDp[0] = iNumArray[0];
    int iMax = iNumArray[0];

    for (int i = 1; i < iIntegerNum; i++) {
      iDp[i] = Math.max(iDp[i - 1] + iNumArray[i], iNumArray[i]);
      iMax = Math.max(iMax, iDp[i]);
    }
    System.out.println(iMax);
  }
}