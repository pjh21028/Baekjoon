import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
  public static boolean[] bPrime = new boolean[1000001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    get_prime();
    int iTestCase = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < iTestCase; i++) {
      int iInputNum = Integer.parseInt(br.readLine());
      int iCount = 0;
      if(iInputNum % 2 == 0 && iInputNum != 0) {
        for (int j = 2; j <= iInputNum / 2; j++) {
          if (!bPrime[j]) { 
            if (!bPrime[iInputNum - j]) {
              iCount++;
            }
          }
        }
      }
      sb.append(iCount).append('\n');
    }
    System.out.print(sb);
  }
  public static void get_prime() {
    bPrime[0] = bPrime[1] = true;

    for(int i = 2; i <= Math.sqrt(bPrime.length); i++) {
      if(bPrime[i]) {
        continue;
      }
      for(int j = i * i; j < bPrime.length; j += i) {
      bPrime[j] = true;
      }
    }
  }
}