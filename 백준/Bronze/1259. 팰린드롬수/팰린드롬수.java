import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      String sString = br.readLine();
      StringBuilder sb = new StringBuilder(sString);
      
      String sStringReverse = sb.reverse().toString();

      if(sString.equals("0")) {
        break;
      }

      if(sString.equals(sStringReverse)) {
        System.out.println("yes");
      }else{
        System.out.println("no");
      }
    }
  }
}