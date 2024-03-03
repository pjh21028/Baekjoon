import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iNum= Integer.parseInt(br.readLine());
    int iCount = 1; 
    int iRange = 2;	

    if (iNum == 1) {
      System.out.print(1);
    }

    else {
      while (iRange <= iNum) {	
        iRange = iRange + (6 * iCount);
        iCount++;
      }
      System.out.print(iCount);
    }
  }
}