import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int iFirstNum = Integer.parseInt(st.nextToken());
        int iFinalNum = Integer.parseInt(st.nextToken());
        int iCount = 1;
       
        while (iFinalNum != iFirstNum) {
            if(iFinalNum < iFirstNum) {
                System.out.println(-1);
                return;
            }
            String sString = String.valueOf(iFinalNum);
            if(iFinalNum % 2 == 0) {
              iFinalNum /= 2;
            } 
            else if(sString.charAt(sString.length() - 1) == '1') {
              sString = sString.substring(0, sString.length() - 1);
              iFinalNum = Integer.parseInt(sString);
            } 
            else {
              System.out.println(-1);
              return;
            }
          iCount++;
        }
        System.out.println(iCount);
    }
}