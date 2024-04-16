import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
  static boolean [] bPrime;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iTestCase = Integer.parseInt(br.readLine());

    for(int i = 0; i < iTestCase; i++) {
      int iNum = Integer.parseInt(br.readLine());
    
      int[][] iStickerArray = new int[2][iNum+1];
      int[][] iDp = new int[2][iNum+1];
      for(int j = 0; j < 2; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int k = 1; k <= iNum; k++) {
            iStickerArray[j][k] = Integer.parseInt(st.nextToken());
        }
      }
      iDp[0][1] = iStickerArray[0][1];
      iDp[1][1] = iStickerArray[1][1];
      for (int j = 2; j <= iNum; j++) {
        iDp[0][j] = Math.max(iDp[1][j - 1], iDp[1][j - 2]) + iStickerArray[0][j];
        iDp[1][j] = Math.max(iDp[0][j - 1], iDp[0][j - 2]) + iStickerArray[1][j];
      }
       System.out.println(Math.max(iDp[0][iNum], iDp[1][iNum]));
    }
  }
}