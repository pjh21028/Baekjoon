import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 	
  public static void main(String[] args) throws IOException {		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
    int iMoney = Integer.parseInt(br.readLine());
    int iCount = 0;

    while(iMoney > 0) {
      if(iMoney % 5 == 0) {
        iCount += iMoney / 5;
        System.out.println(iCount);
        return;
      }
      if(iMoney < 2) {
        System.out.println(-1);
        return;
      }
      iMoney -= 2;
      iCount++;
    }
    System.out.println(iCount);
  }
}