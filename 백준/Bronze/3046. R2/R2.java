import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int iR1 = Integer.parseInt(st.nextToken());
    int iS = Integer.parseInt(st.nextToken());
    System.out.print(iS*2 - iR1);
  }

}