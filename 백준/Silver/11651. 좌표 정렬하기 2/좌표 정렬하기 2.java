import java.util.*;
import java.io.*;

public class Main {
  static int iArray[][];
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int iDotNum = Integer.parseInt(br.readLine());
    iArray = new int[iDotNum][2];

    for(int i=0; i<iDotNum; i++) {
      st = new StringTokenizer(br.readLine());	
      iArray[i][0] = Integer.parseInt(st.nextToken());
      iArray[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(iArray, (arr_1, arr_2) -> {
      if(arr_1[1] == arr_2[1]) {
        return arr_1[0] - arr_2[0];
      }
      else {
        return arr_1[1] - arr_2[1];
      }
    });

    for(int i=0; i<iDotNum; i++) {
      sb.append(iArray[i][0] + " " + iArray[i][1]).append('\n');
    }
    System.out.println(sb);
  }
}