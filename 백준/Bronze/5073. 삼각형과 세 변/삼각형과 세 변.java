import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int[] iEdgeArr = new int[3];

    while(true) {
      st = new StringTokenizer(br.readLine());
      iEdgeArr[0] = Integer.parseInt(st.nextToken());
      iEdgeArr[1] = Integer.parseInt(st.nextToken());
      iEdgeArr[2] = Integer.parseInt(st.nextToken());


      if(iEdgeArr[0] == 0 && iEdgeArr[1] == 0 && iEdgeArr[2] == 0) {
        break;
      }
      Arrays.sort(iEdgeArr);

      if(iEdgeArr[2] >= iEdgeArr[0] + iEdgeArr[1]) {
        System.out.println("Invalid");
      }else if(iEdgeArr[0] == iEdgeArr[1] && iEdgeArr[1] == iEdgeArr[2]) {
        System.out.println("Equilateral");
      }else if(iEdgeArr[0] == iEdgeArr[1] || iEdgeArr[1] == iEdgeArr[2] || iEdgeArr[0] == iEdgeArr[2]) {
        System.out.println("Isosceles");
      }else {
        System.out.println("Scalene");
      }
    }
  }
}