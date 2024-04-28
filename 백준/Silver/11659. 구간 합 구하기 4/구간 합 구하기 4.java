import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int iNum = Integer.parseInt(st.nextToken());
    int iTestCase = Integer.parseInt(st.nextToken());
    int[] iNumArray = new int[iNum + 1];
    StringBuilder sb = new StringBuilder();
    st = new StringTokenizer(br.readLine(), " ");
    
    for(int i = 1; i <= iNum; i++) {
      iNumArray[0] = 0;
      iNumArray[i] = iNumArray[i - 1] + Integer.parseInt(st.nextToken());
    }
    for(int j = 0; j < iTestCase; j++) {
      st = new StringTokenizer(br.readLine(), " ");
      int iStart = Integer.parseInt(st.nextToken());
      int iEnd = Integer.parseInt(st.nextToken());
      
      sb.append(iNumArray[iEnd] - iNumArray[iStart - 1]).append("\n");
    }
    System.out.println(sb);
  }
}