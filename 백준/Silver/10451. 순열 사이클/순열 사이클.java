import java.io.*;
import java.util.*;

public class Main {
  static int [] iArray;
  static boolean [] bCheck;
  static int iCycle;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iTestNum = Integer.parseInt(br.readLine());
    for(int iTestCase = 0; iTestCase < iTestNum; iTestCase++) {
        int iPermutNum = Integer.parseInt(br.readLine());
        iArray = new int[iPermutNum + 1];
        iCycle = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < iPermutNum + 1; i++) {
          iArray[i] = Integer.parseInt(st.nextToken());
        }

        bCheck = new boolean[iPermutNum + 1];
        for(int i = 1; i < iPermutNum + 1; i++) {
          if(!bCheck[i]) {
            dfs(i);
            iCycle++;
          }
        }
        System.out.println(iCycle);
      }
    }

  static void dfs(int iStart) {
    bCheck[iStart]= true;

    int iNext = iArray[iStart];
    if(!bCheck[iNext]) {
      dfs(iArray[iStart]);
    }
  }
  
}