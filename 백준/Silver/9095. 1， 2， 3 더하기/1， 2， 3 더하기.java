import java.io.*;

public class Main {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int iTestcase = Integer.parseInt(br.readLine());

    for (int i = 0; i< iTestcase; i++) {
      int iNum = Integer.parseInt(br.readLine());
      int[] iDP = new int[11];

      iDP[1] = 1;
      iDP[2] = 2;
      iDP[3] = 4;

      for (int j = 4; j <= iNum; j++) {
        iDP[j] = iDP[j - 1] + iDP[j - 2] + iDP[j - 3];
      }

      bw.write(iDP[iNum] + "\n");
    }
    bw.flush();
  }
}