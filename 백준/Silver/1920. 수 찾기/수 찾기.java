import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int iNums = Integer.parseInt(st.nextToken());
    int [] iNumsArray = new int[iNums];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < iNums; i++) {
      iNumsArray[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(iNumsArray);
    
    int iSearchingNum = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int j = 0; j < iSearchingNum; j++) {
      int iSearching = Integer.parseInt(st.nextToken());
      int iInsert = Arrays.binarySearch(iNumsArray, iSearching);
      if (iInsert < 0) {
        sb.append(0 + "\n");
      } 
      else {
        sb.append(1 + "\n"); 
      }
    }
    System.out.println(sb);
  }
}