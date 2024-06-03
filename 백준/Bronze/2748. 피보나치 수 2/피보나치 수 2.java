import java.io.*;
import java.util.*;

public class Main {
  static long[] lArray;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

      lArray = new long[N + 1];

    for(int i = 0; i < N + 1; i++) {
      lArray[i] = -1;
    }

    lArray[0] = 0;
    lArray[1] = 1;
    System.out.println(Fib(N));
  }

  public static long Fib(int N) {
    if(lArray[N] == -1) {
      lArray[N] = Fib(N - 1) + Fib(N - 2);
    }
    return lArray[N];
  }

}