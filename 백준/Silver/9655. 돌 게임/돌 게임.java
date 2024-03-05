import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iRockNum = Integer.parseInt(br.readLine());
    int[] iTestArray = new int[1001];

    iTestArray[1] = 1;
    iTestArray[2] = 2;
    iTestArray[3] = 1;
    for (int i = 4; i <= iRockNum; i++) {
        iTestArray[i] = Math.min(iTestArray[i-1],iTestArray[i-3]) + 1;
    }
    if (iTestArray[iRockNum] % 2 == 0) {
      System.out.print("CY");
    } else {
      System.out.print("SK");
    }
  }
}