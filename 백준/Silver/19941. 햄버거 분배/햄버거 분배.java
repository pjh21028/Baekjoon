import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int iTableLength = Integer.parseInt(st.nextToken());
      int iChooseLength = Integer.parseInt(st.nextToken());
      char [] cArrangeArray = new char[iTableLength];
      boolean [] bSearchArray = new boolean[iTableLength];
      int iResult = 0;

      st = new StringTokenizer(br.readLine());
      cArrangeArray = st.nextToken().toCharArray();

      for(int i=0; i < iTableLength; i++) {
        if(cArrangeArray[i] == 'P') {
          for(int j = -iChooseLength; j <= iChooseLength; j++) {
            if(i + j >= iTableLength) {
              break;
            }
            if(i + j < 0) {
              continue;
            }

            if(cArrangeArray[i+j] == 'H' && bSearchArray[i+j] == false) {
              bSearchArray[i+j] = true;
              iResult++;
              break;
            }
          }
        }
      }
      System.out.println(iResult);
    }
}