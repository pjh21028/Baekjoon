import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iStudentWindowNum = Integer.parseInt(br.readLine());
    int iCount = 1;

    for(int i = 2; i*i <= iStudentWindowNum; i++) {
      iCount++;
    }
    System.out.println(iCount);
  }
}