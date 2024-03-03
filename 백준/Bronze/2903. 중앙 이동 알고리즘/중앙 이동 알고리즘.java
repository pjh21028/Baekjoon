import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int iTestTime = Integer.parseInt(br.readLine());
      
      System.out.println((int)Math.pow(Math.pow(2, iTestTime) +1, 2));
    }
}