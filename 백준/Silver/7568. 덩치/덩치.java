import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int iPeopleNum = Integer.parseInt(br.readLine());

    int[][] iBigArray = new int[iPeopleNum][2];

    for(int i = 0; i < iPeopleNum; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      iBigArray[i][0] = Integer.parseInt(st.nextToken());
      iBigArray[i][1] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i < iPeopleNum; i++) {
      int iRank = 1;
      for(int j = 0; j < iPeopleNum; j++) {
        if(i == j) {
          continue;
        }
        if (iBigArray[i][0] < iBigArray[j][0] && iBigArray[i][1] < iBigArray[j][1]) {
          iRank++;
        }
      }

      sb.append(iRank).append(' ');
    }
    System.out.println(sb);
  }
}