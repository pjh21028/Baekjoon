import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iNum = Integer.parseInt(br.readLine());
    int iCount = 0;

    while (iNum >= 5) {
      iCount += iNum / 5;
      iNum /= 5;
    }
    System.out.println(iCount); 
  }
}