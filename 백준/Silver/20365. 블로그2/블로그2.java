import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iPaintingNum;
    String sPaintingColor;
    
    iPaintingNum = Integer.parseInt(br.readLine());
    sPaintingColor = br.readLine();
    char[] cColorArray = sPaintingColor.toCharArray();
    
    char cFirstColor = cColorArray[0]; 
    
    int iColorNum1 = 1,iColorNum2 = 0; //제일 처음 오는 색이 iColorNum1,다른 색이 iColorNum2
    
    boolean bFlag = false;
    
    for(int i = 1; i < iPaintingNum; i++) {
      if(cColorArray[i] != cFirstColor && !bFlag) {
        iColorNum2++;
        bFlag = true;
        cFirstColor = cColorArray[i];
        
      }else if(cColorArray[i]!=cFirstColor && bFlag) {
        iColorNum1++;
        bFlag = false;
        cFirstColor = cColorArray[i];
      }
    }

    int iMinResult = Math.min(iColorNum1, iColorNum2) + 1; //여기서 1을 더해주는 이유는 전체 칠하는 횟수 1회를 말함
    System.out.println(iMinResult);    
  }
}