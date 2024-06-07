import java.io.*;
import java.util.*;

public class Main {
  static int iNum;
  static StringBuilder sResult;

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String sString;
    while ((sString = br.readLine()) != null) {
      iNum = Integer.parseInt(sString);
      sResult =new StringBuilder();
      int iLen = (int) Math.pow(3, iNum); 
      for (int i = 0; i < iLen; i++) {
        sResult.append("-");
      }

      func(0, iLen); 
      System.out.println(sResult);

    }
  }

  public static void func(int start,int size) { 
    if(size==1) { 
      return;
    }
    int iNewSize=size/3;
    for(int i = start + iNewSize; i < start + 2 * iNewSize; i++) {
      sResult.setCharAt(i, ' ');
    }

    func(start, iNewSize); 
    func(start+2*iNewSize, iNewSize);  
  }

}