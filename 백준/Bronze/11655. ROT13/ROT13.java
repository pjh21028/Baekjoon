import java.io.*;
import java.util.*;

public class Main {
  static String sString;
  static char cChar;
  static int iChangeNum;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    sString = br.readLine();
    for (int i = 0; i < sString.length(); i++) {
      cChar = sString.charAt(i);
      if (!Character.isLetter(cChar)) {
        sb.append(cChar);
        continue;
      }
      iChangeNum = (int)cChar + 13;
      if (Character.isUpperCase(cChar) && iChangeNum > 90) {
        iChangeNum -= 26;
      }
      if (Character.isLowerCase(cChar) && iChangeNum > 122) {
        iChangeNum -= 26;
      }
      sb.append((char)iChangeNum);
    }
    System.out.print(sb);
  }
}