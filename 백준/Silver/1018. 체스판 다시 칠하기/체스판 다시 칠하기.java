import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

  public static boolean[][] bArray;
  public static int iMin = 64;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int iRow = Integer.parseInt(st.nextToken());
    int iColumn = Integer.parseInt(st.nextToken());

    bArray = new boolean[iRow][iColumn];

    for (int i = 0; i < iRow; i++) {
      String sString = br.readLine();
      for (int j = 0; j < iColumn; j++) {
        if (sString.charAt(j) == 'W') {
          bArray[i][j] = true;
        } else {
          bArray[i][j] = false;
        }
      }
    }
    int N_row = iRow  - 7;
    int M_col = iColumn - 7;

    for (int i = 0; i < N_row; i++) {
      for (int j = 0; j < M_col; j++) {
        find(i, j);
      }
    }
    System.out.println(iMin);
  }

  public static void find(int x, int y) {
    int iLastX = x + 8;
    int iLastY = y + 8;
    int iCount = 0;

    boolean bJudgeTF= bArray[x][y];
    for (int i = x; i < iLastX; i++) {
      for (int j = y; j < iLastY; j++) {
        if (bArray[i][j] != bJudgeTF) {	
            iCount++;
        }
        bJudgeTF = (!bJudgeTF);
      }
      bJudgeTF = !bJudgeTF;
    }
    iCount = Math.min(iCount, 64 - iCount);
    iMin = Math.min(iMin, iCount);
  }
}