import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int iPlaceNum;					
  static int[] iEachPlaceHoney;		
  static long lMaxHoney;		

  static long lTotalHoney;			
  static long[] toRightTotal;	
  static long[] toLeftTotal;

  static void case1() {
    long lBee1, lBee2;			

    for (int i = 1; i <= iPlaceNum - 2; i++) {
      lBee1 = lTotalHoney - iEachPlaceHoney[0] - iEachPlaceHoney[i];
      lBee2 = lTotalHoney - toRightTotal[i];
      lMaxHoney = Math.max(lMaxHoney, lBee1 + lBee2);
    }
  }

  static void case2() {
    long lBee1, lBee2;

    for (int i = iPlaceNum - 2; i >= 1; i--) {
      lBee1 = lTotalHoney - iEachPlaceHoney[iPlaceNum - 1] - iEachPlaceHoney[i];
      lBee2 = lTotalHoney - toLeftTotal[i];
      lMaxHoney = Math.max(lMaxHoney, lBee1 + lBee2);
    }
  }
  static void case3() {
    long lBee1, lBee2;

    for (int i = 1; i <= iPlaceNum - 2; i++) {
      lBee1 = toRightTotal[i] - iEachPlaceHoney[0];
      lBee2 = toLeftTotal[i] - iEachPlaceHoney[iPlaceNum - 1];
      lMaxHoney = Math.max(lMaxHoney, lBee1 + lBee2);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    iPlaceNum = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    iEachPlaceHoney = new int[iPlaceNum];
    toRightTotal = new long[iPlaceNum];			
    toLeftTotal = new long[iPlaceNum];	
    long lTemp = 0;
    for (int i = 0; i < iPlaceNum; i++) {
      iEachPlaceHoney[i] = Integer.parseInt(st.nextToken());

      lTemp += iEachPlaceHoney[i];
      toRightTotal[i] = lTemp;
    }

    lTemp = 0;
    for (int i = iPlaceNum - 1; i >= 0; i--) {
      lTemp += iEachPlaceHoney[i];
      toLeftTotal[i] = lTemp;
    }

    lTotalHoney = toRightTotal[iPlaceNum - 1];

    case1();
    case2();
    case3();

    System.out.println(lMaxHoney);
  }
}
