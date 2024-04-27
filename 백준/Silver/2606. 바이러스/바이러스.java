import java.io.*;
import java.util.*;

public class Main {
  static boolean[] bCheck;
  static int[][] iArray;
  static int iCount = 0;
  static int iNode, iLine;
  static Queue<Integer> q = new LinkedList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    iNode = Integer.parseInt(br.readLine());
    iLine = Integer.parseInt(br.readLine());

    iArray = new int[iNode+1][iNode+1];
    bCheck = new boolean[iNode+1];

    for(int i = 0 ; i < iLine ; i ++) {
      StringTokenizer str = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(str.nextToken());
      int b = Integer.parseInt(str.nextToken());

      iArray[a][b] = iArray[b][a] =  1;	
    }
      dfs(1);
      System.out.println(iCount-1);
    }
  
  public static void dfs(int start) {
    bCheck[start] = true;
    iCount++;

    for(int i = 0 ; i <= iNode ; i++) {
      if(iArray[start][i] == 1 && !bCheck[i])
        dfs(i);
    }

  }
}
