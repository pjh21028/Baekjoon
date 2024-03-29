import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int iNum = Integer.parseInt(br.readLine());

    for (int i = 2; i <= Math.sqrt(iNum); i++) {
      while (iNum % i == 0) {
        sb.append(i).append('\n');
          iNum /= i;
      }
    }
    if (iNum != 1) {
      sb.append(iNum);
    }
    System.out.println(sb);
  }
}