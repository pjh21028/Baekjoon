import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
  public static boolean[] bPrime = new boolean[300001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    get_prime();

    StringBuilder sb = new StringBuilder();
    while(true) {
      int iInputNum = Integer.parseInt(br.readLine());
      if(iInputNum == 0) {
        break;
      }
      int iCount = 0;
      for(int i = iInputNum + 1; i <= 2 * iInputNum; i++) {
        if(!bPrime[i]) {
          iCount++;
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