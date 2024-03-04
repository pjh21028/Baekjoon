import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iWordNum = Integer.parseInt(br.readLine());
    String [] sArray = new String[iWordNum];    

    for(int i = 0; i < iWordNum; i++) {
      sArray[i] = br.readLine();
    }
    Arrays.sort(sArray, new Comparator<String>() {
      public int compare(String s1, String s2) { 
        if (s1.length() == s2.length()) {
          return s1.compareTo(s2);
        } 
        else {
          return s1.length() - s2.length();
        }
      }
    });
    StringBuilder sb = new StringBuilder();

    sb.append(sArray[0]).append('\n');

    for (int i = 1; i < iWordNum; i++) {
      if (!sArray[i].equals(sArray[i - 1])) {
        sb.append(sArray[i]).append('\n');
      }
    }
    System.out.println(sb);
  }
}