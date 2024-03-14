import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iSum = Integer.MAX_VALUE;
    StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
    
    while (subtraction.hasMoreTokens()) {
      int iTemp = 0;
       StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");
      while (addition.hasMoreTokens()) {
        iTemp += Integer.parseInt(addition.nextToken());
      }
      
      if (iSum == Integer.MAX_VALUE) {
        iSum = iTemp;
      } else {
        iSum -= iTemp;
      }
    }
    System.out.println(iSum);
  }
}