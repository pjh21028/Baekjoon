import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

  public static int[][] iAptArray = new int[15][15];

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    APT();

    int iTestNum = Integer.parseInt(br.readLine());

    for (int i = 0; i < iTestNum; i++) {
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      sb.append(iAptArray[k][n]).append('\n');
    }
    System.out.println(sb);
  }


  public static void APT() {
  
    for (int i = 0; i < 15; i++) {
      iAptArray[i][1] = 1; 
      iAptArray[0][i] = i; 
    }

    for (int i = 1; i < 15; i++) {
      for (int j = 2; j < 15; j++) { 
        iAptArray[i][j] = iAptArray[i][j - 1] + iAptArray[i - 1][j];
      }
    }
  }
}