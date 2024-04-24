import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int iRow = Integer.parseInt(st.nextToken());
    int iColumn = Integer.parseInt(st.nextToken());
    int iBlockNum = Integer.parseInt(st.nextToken());
    int[][] iArray = new int[iRow][iColumn];
    int iMin = 256;
    int iMax = 0;
    for(int i = 0; i < iRow; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < iColumn; j++) {
        iArray[i][j] = Integer.parseInt(st.nextToken());
        if(iMin > iArray[i][j]) {
          iMin = iArray[i][j];
        }
        if(iMax < iArray[i][j]) {
          iMax = iArray[i][j];
        }
      }
    }
    int iTime = 64000000;
    int iheight = 0;
    for(int i = iMin; i <= iMax; i++) {
      int iCount = 0;
      int iBlock = iBlockNum;
      for(int j = 0; j < iRow; j++) {
        for(int k = 0; k < iColumn; k++) {
          if(i < iArray[j][k]) {
            iCount += ((iArray[j][k] - i) * 2);
            iBlock += (iArray[j][k] - i);
          }else {
            iCount += (i - iArray[j][k]);
            iBlock -= (i - iArray[j][k]);
          }
        }
      }
      if(iBlock < 0) break;

        if(iTime >= iCount) {
          iTime = iCount;
          iheight = i;
        }
      }
      System.out.println(iTime + " " + iheight);
  }
}