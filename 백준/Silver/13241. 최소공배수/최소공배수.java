import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      long lNum1 = Integer.parseInt(st.nextToken());
      long lNum2 = Integer.parseInt(st.nextToken());

      long lGCD = getGCD(Math.max(lNum1, lNum2), Math.min(lNum1, lNum2));

      System.out.println((lNum1*lNum2)/lGCD);
  }

  public static long getGCD(long a, long b) {
      while(b > 0) {
          long lTmp = a;
          a = b;
          b = lTmp % b;
      }
      return a;
  }
}