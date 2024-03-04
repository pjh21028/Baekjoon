import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
      
    int iMember = Integer.parseInt(st.nextToken());
    int iNum = Integer.parseInt(st.nextToken());
    int iResult = factorial(iMember) / (factorial(iMember - iNum) * factorial(iNum));

    System.out.println(iResult);
  }

  static int factorial(int N) {
    if (N <= 1)	{
      return 1;
    }
    return N * factorial(N - 1);
  }
}