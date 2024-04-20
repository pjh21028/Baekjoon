import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());

    int[] iStack = new int[N];

    int iIndex = 0;
    int iStart = 0;

    // N 번 반복
    while(N -- > 0) {
      int iValue = Integer.parseInt(br.readLine());

      if(iValue > iStart) {
        for(int i = iStart + 1; i <= iValue; i++) {
          iStack[iIndex] = i;
            iIndex++;
          sb.append('+').append('\n');
        }
        iStart = iValue; 
      }  
      else if(iStack[iIndex - 1] != iValue) {
          System.out.println("NO");
          System.exit(0);
      }
      iIndex--;
      sb.append('-').append('\n');
    }
    System.out.println(sb);
  }
}
