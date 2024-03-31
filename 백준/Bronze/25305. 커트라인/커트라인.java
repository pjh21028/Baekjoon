import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int iStudentNum = Integer.parseInt(st.nextToken());
      int iAwardNum = Integer.parseInt(st.nextToken());
      int [] iArray = new int [iStudentNum];
      int iCutLine;
      st =  new StringTokenizer(br.readLine());
      for(int i = 0; i < iStudentNum; i++) {
        iArray[i] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(iArray);
      iCutLine = iArray[iStudentNum - iAwardNum];
      System.out.println(iCutLine);      
    }
}