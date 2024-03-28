import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int [] iXCoordinateArr = new int[3];
    int [] iYCoordinateArr = new int[3];
    for(int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      iXCoordinateArr[i] = Integer.parseInt(st.nextToken());
      iYCoordinateArr[i] = Integer.parseInt(st.nextToken());
    }
    System.out.println(findAxis(iXCoordinateArr) + " " + findAxis(iYCoordinateArr));
  }
  static int findAxis(int[] array){
      if(array[0] == array[1]) {
        return array[2]; 
      }
      else {
        return (array[0] == array[2]) ? (array[1]) : (array[0]);
      }
  }
}
