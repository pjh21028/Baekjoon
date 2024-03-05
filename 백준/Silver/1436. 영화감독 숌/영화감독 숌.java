import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int iNum = 666;
    int iCount = 1;

    while(iCount != N) {
      iNum++;
      if(String.valueOf(iNum).contains("666")) {
          iCount++;
      }
    }
    System.out.println(iNum);
  }
}