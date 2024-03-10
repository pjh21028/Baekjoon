import java.util.Arrays;
import java.util.Comparator;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iDairyProductNum = Integer.parseInt(br.readLine());
    Integer[] iPriceArray = new Integer[iDairyProductNum];
    
    for(int i=0;i < iDairyProductNum; i++) {
      iPriceArray[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(iPriceArray, Comparator.reverseOrder());

    int iSum = 0;
    for(int i=0;i < iDairyProductNum;i++){
      if(i%3==2) {
        continue;
      }
      iSum += iPriceArray[i];
    }
    System.out.println(iSum);
  }
}