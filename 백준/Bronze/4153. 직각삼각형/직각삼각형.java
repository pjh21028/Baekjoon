import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      
      int iXSide = Integer.parseInt(st.nextToken());
      int iYSide = Integer.parseInt(st.nextToken());
      int iZSide = Integer.parseInt(st.nextToken());

      if(iXSide == 0 && iYSide == 0 && iZSide == 0) {
        break;
      }
      if((iXSide * iXSide + iYSide * iYSide) == iZSide * iZSide) {
        System.out.println("right");
      }
      else if(iXSide * iXSide == (iYSide * iYSide + iZSide * iZSide)) {
        System.out.println("right");
      }
      else if(iYSide * iYSide == (iZSide * iZSide + iXSide * iXSide)) {
        System.out.println("right");
      }
      else {
        System.out.println("wrong");
      }
    }
  }
}