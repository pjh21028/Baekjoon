import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int iNum = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      String sArray[] = new String[iNum];

      for(int i = 0; i < iNum; i++) {
        sArray[i] = br.readLine();
      }
      for (int i = 0; i < iNum; i++) {
        int iCount = 0;
        int iSum = 0;
        for (int j = 0; j < sArray[i].length(); j++) {
          if (sArray[i].charAt(j) == 'O') {
            iCount++;
          } else {
            iCount = 0;
          }
          iSum += iCount;
        }
        sb.append(iSum);
        sb.append('\n');
      }
      System.out.print(sb);
    }
}