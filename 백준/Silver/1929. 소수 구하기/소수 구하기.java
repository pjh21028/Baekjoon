import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
  static boolean [] bPrime;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int iIntegerM = Integer.parseInt(st.nextToken());
    int iIntegerN = Integer.parseInt(st.nextToken());
    
    bPrime = new boolean[iIntegerN + 1];
    get_prime();

    StringBuilder sb = new StringBuilder();

    for(int i = iIntegerM; i <= iIntegerN; i++) {
      if(!bPrime[i]) sb.append(i).append('\n');
    }
    System.out.println(sb);
  }
  public static void get_prime() {
    bPrime[0] = bPrime[1] = true;

    for(int i = 2; i <= Math.sqrt(bPrime.length); i++) {
      if(bPrime[i]) continue;
      for(int j = i * i; j < bPrime.length; j += i) {
        bPrime[j] = true;
      }
    }
  }
}