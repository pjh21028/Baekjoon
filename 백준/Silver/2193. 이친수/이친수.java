import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int iCount = Integer.parseInt(br.readLine());
      long lDP[] = new long[iCount+1];
      lDP[0] = 0;
      lDP[1] = 1;
      for (int i = 2; i <= iCount; i++){
        lDP[i] = lDP[i-1] + lDP[i-2];
      }
      System.out.println(lDP[iCount]);
    }
}