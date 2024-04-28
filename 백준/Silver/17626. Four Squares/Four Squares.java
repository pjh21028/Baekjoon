import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iNum = Integer.parseInt(br.readLine());
    int[] iDP = new int[iNum + 1];

    iDP[0] = 0;
    iDP[1] = 1;
    for(int i = 2; i <= iNum; i++) {
      iDP[i] = iDP[i - 1];
      for(int j = 1; j * j <= i; j++) {
        iDP[i] = Math.min(iDP[i], iDP[i - (j * j)]);
      }
      iDP[i]++;
    }
    System.out.println(iDP[iNum]);
  }
}