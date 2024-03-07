import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long sNum = Long.parseLong(br.readLine());

    int iStartNumtoLastNum = 1;
    while(true) {
      if(sNum >= iStartNumtoLastNum) {
        sNum -= iStartNumtoLastNum;
      }
      else {
        break;
      }
      iStartNumtoLastNum++;
    }
 
    System.out.println(--iStartNumtoLastNum);
  }
}