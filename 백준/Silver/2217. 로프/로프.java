import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Main { 	
  public static void main(String[] args) throws IOException {		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

    int iRopeNum = Integer.parseInt(br.readLine());
    Integer [] iRopeMaxWeight = new Integer [iRopeNum];

    for(int i = 0; i < iRopeNum; i++) {
      iRopeMaxWeight[i] = Integer.parseInt(br.readLine());
    }
    
    Arrays.sort(iRopeMaxWeight,Collections.reverseOrder());
    int iResult = 0;
    for (int i = 0; i < iRopeNum; i++) {
      iResult = Math.max(iResult, iRopeMaxWeight[i] * (i+1));
    }
    System.out.println(iResult);
  }
}