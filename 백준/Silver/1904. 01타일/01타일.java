import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    System.out.println(Tile(N));
  }

  public static int Tile(int a) {
    if (a == 1) {
      return 1;
    } 
    if (a == 2) {
      return 2;
    }

    int iValue1 = 1;
    int iValue2 = 2;
    int iSum = 0;
    for (int i = 2; i < a; i++) {
      iSum = (iValue2 + iValue1) % 15746;
      iValue1 = iValue2;	
      iValue2 = iSum;
    }

    return iSum;
  }
}