import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int iXCoordinate = Integer.parseInt(st.nextToken());
    int iYCoordinate = Integer.parseInt(st.nextToken());
    int iWCoordinate = Integer.parseInt(st.nextToken());
    int iHCoordinate = Integer.parseInt(st.nextToken());
    int iDistance1 = iWCoordinate - iXCoordinate;
    int iDistance2 = iHCoordinate - iYCoordinate;
    int iCompare1 = Math.min(iDistance1, iXCoordinate);
    int iCompare2 = Math.min(iDistance2, iYCoordinate);
    int iResult = Math.min(iCompare1, iCompare2);
    System.out.println(iResult);
  }
}