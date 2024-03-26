import java.io.*;
import java.util.*;

public class Main {
    static int iPeopleNum, iNotInclude, iResult;
    static double dSum = 0;
    static int [] iDifficulty;
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      iPeopleNum = Integer.parseInt(br.readLine());
      iDifficulty = new int[iPeopleNum];
      
      for(int i=0; i < iPeopleNum; i++){
        iDifficulty[i] = Integer.parseInt(br.readLine());
      }
      Arrays.sort(iDifficulty);
      
      iNotInclude = (int)Math.round(iPeopleNum * 0.15);

      for(int i = iNotInclude; i < iPeopleNum - iNotInclude; i++) {
        dSum += iDifficulty[i];
      }
      iResult = (int)Math.round(dSum / (iPeopleNum - 2*iNotInclude));
      System.out.println(iResult);
    }
}