import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 	
  public static void main(String[] args) throws IOException {		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
    int iBagNum = Integer.parseInt(br.readLine());
    int iCount = 0;

    while(iBagNum > 0) {
      if(iBagNum % 5 == 0) {
        iCount += iBagNum / 5;
        System.out.println(iCount);
        return;
      }
      if(iBagNum < 3) {
        System.out.println(-1);
        return;
      }
      iBagNum -= 3;
      iCount++;
    }
    System.out.println(iCount);
  }
}