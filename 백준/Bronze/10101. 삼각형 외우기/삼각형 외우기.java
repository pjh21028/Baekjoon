import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int iAngle1 = Integer.parseInt(br.readLine());
    int iAngle2 = Integer.parseInt(br.readLine());
    int iAngle3 = Integer.parseInt(br.readLine());

    if((iAngle1 + iAngle2 + iAngle3) != 180) {
      System.out.println("Error");
    }else if(iAngle1 == iAngle2 && iAngle2 == iAngle3) {
      System.out.println("Equilateral");
    }else if(iAngle1 == iAngle2 || iAngle2 == iAngle3 || iAngle1 == iAngle3) {
      System.out.println("Isosceles");
    }else {
      System.out.println("Scalene");
    }
  }
}