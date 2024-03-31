import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int [] iArray = new int [5];
      int iSum = 0;
      int iAverage;
      
      for(int i = 0; i < 5; i++) {
        iArray[i] = Integer.parseInt(br.readLine());
        iSum += iArray[i];
      }
      Arrays.sort(iArray);
      iAverage = iSum / 5;
      System.out.println(iAverage);
      System.out.println(iArray[2]);      
    }
}