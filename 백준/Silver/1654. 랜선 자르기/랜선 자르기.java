import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int iOriginalLanNum = Integer.parseInt(st.nextToken()); 
    int iNeedLanNum = Integer.parseInt(st.nextToken()); 
    int[] iArray = new int[iOriginalLanNum];
    long lMax = 0;

    for (int i = 0; i < iOriginalLanNum; i++) {
      iArray[i] = Integer.parseInt(br.readLine());
      if(lMax < iArray[i]) {
        lMax = iArray[i];
      }
    }
    
    lMax++; 
    
    long lMin = 0; 
    long lMid = 0; 
    while (lMin < lMax) { 
      lMid = (lMax + lMin) / 2;
      long lCount = 0;
      for (int i = 0; i < iArray.length; i++) {
        lCount += (iArray[i] / lMid);
      }
      
      if(lCount < iNeedLanNum) {
        lMax = lMid;
      }
      else {
        lMin = lMid + 1;
      }
    }
    System.out.println(lMin - 1);
  }
}