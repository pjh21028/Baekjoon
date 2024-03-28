import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int iCoordinateNum = Integer.parseInt(br.readLine());
    int [] iXCoordinate = new int[iCoordinateNum];
    int [] iYCoordinate = new int[iCoordinateNum];
    int iWidth, iHeight, iArea;
    for(int i = 0; i < iCoordinateNum; i++) {
      st = new StringTokenizer(br.readLine());
      iXCoordinate[i] = Integer.parseInt(st.nextToken());
      iYCoordinate[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(iXCoordinate);
    Arrays.sort(iYCoordinate);
    iWidth = iXCoordinate[iCoordinateNum -1] - iXCoordinate[0];
    iHeight = iYCoordinate[iCoordinateNum -1] - iYCoordinate[0];
    iArea = iWidth*iHeight;
    System.out.println(iArea);
  }
}