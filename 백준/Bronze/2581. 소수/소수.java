import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int iNum1= Integer.parseInt(br.readLine());
      int iNum2= Integer.parseInt(br.readLine());
      int iMin = iNum2;
      int iSum = 0;

      for(int i = iNum1; i <= iNum2; i++) {
        boolean check = true;
        if(i == 1) {
          check = false;
        }
        for(int j = 2; j < i; j++) {
          if(i % j == 0) {
            check = false;
            break;
          }
        }
        if(check) {
          if(iMin > i) iMin = i;
          iSum += i;   
        }
      }
      if(iSum == 0) {
        System.out.println(-1);
      } 
      else {
        System.out.println(iSum);
        System.out.println(iMin);
      }
    }
}