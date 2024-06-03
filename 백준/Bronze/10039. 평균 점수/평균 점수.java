import java.io.*;
import java.util.*;

public class Main {    
  public static void main(String[] args) throws IOException {     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int [] iArray = new int[5];
    int iSum = 0;
    for(int i = 0; i < 5; i++) {
      iArray[i] = Integer.parseInt(br.readLine());
      if(iArray[i] < 40) {
        iArray[i] = 40;
      }
      iSum += iArray[i];
    }
    System.out.println(iSum/5);
  }
}