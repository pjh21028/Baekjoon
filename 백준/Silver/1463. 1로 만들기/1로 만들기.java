import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iNum = Integer.parseInt(br.readLine());
    System.out.println(recur(iNum, 0));
  }

  static int recur(int N, int iCount) {
    if (N < 2) {
      return iCount;
    }
    return Math.min(recur(N / 2, iCount + 1 + (N % 2)), recur(N / 3, iCount + 1 + (N % 3)));
  }
}