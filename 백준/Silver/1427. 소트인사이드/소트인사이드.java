import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      char [] iArray = br.readLine().toCharArray();
      Arrays.sort(iArray);
      for (int i = iArray.length - 1; i >= 0; i--) {
        System.out.print(iArray[i]);
      }     
    }
}