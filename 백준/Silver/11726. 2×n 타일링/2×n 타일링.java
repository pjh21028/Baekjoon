import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iNum = Integer.parseInt(br.readLine());
    int[] iDP = new int[iNum + 1];

    iDP[0] = 1;
    iDP[1] = 1;
    for(int i = 2; i <= iNum; i++) {
      iDP[i] = (iDP[i - 1] + iDP[i - 2]) % 10007;
    }
    System.out.println(iDP[iNum]);
  }
}