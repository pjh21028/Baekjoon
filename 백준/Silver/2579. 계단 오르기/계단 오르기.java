import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iNum = Integer.parseInt(br.readLine());

    int[] iDP = new int[iNum + 1];
    int[] iArray = new int[iNum + 1];


    for (int i = 1; i <= iNum; i++) {
      iArray[i] = Integer.parseInt(br.readLine());
    }
    iDP[1] = iArray[1];
    if (iNum >= 2) {
      iDP[2] = iArray[1] + iArray[2];
    }

    for (int i = 3; i <= iNum; i++) {
      iDP[i] = Math.max(iDP[i - 2] , iDP[i - 3] + iArray[i - 1]) + iArray[i];
    }

    System.out.println(iDP[iNum]);

  }

}