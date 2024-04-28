import java.io.*;

public class Main {
  static long[] lSequence = new long[101];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    evaluate_padovan();
    int iTestcase = Integer.parseInt(br.readLine());
    for (int i = 0; i < iTestcase; i++) {
      sb.append(lSequence[Integer.parseInt(br.readLine())]).append('\n');
    }
    System.out.println(sb);
  }

  public static void evaluate_padovan() {
    lSequence[1] = 1;
    lSequence[2] = 1;
    lSequence[3] = 1;
    for (int i = 4; i < 101; i++) {
      lSequence[i] = lSequence[i - 2] + lSequence[i - 3];
    }
  }

}