import java.io.*;
import java.util.*;

public class Main {
  static int iZero;
  static int iOne;
  static int iZero_Plus_One;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      fibonacci(N);			
      sb.append(iZero).append(' ').append(iOne).append('\n');
    }
    System.out.println(sb);

  }

  public static void fibonacci(int N) {
    iZero = 1;
    iOne = 0;
    iZero_Plus_One = 1;

    for (int i = 0; i < N; i++) {
      iZero = iOne;
      iOne = iZero_Plus_One;
      iZero_Plus_One = iZero + iOne;
    }

  }

}