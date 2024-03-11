import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int iNums = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    for(int i = 0; i < iNums; i++) {
      int iKey = Integer.parseInt(st.nextToken());

      map.put(iKey, map.getOrDefault(iKey, 0) + 1);
    }

    int iSeachNum = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine(), " ");
    for(int i = 0; i < iSeachNum; i++) {
      int iKey = Integer.parseInt(st.nextToken());

      sb.append(map.getOrDefault(iKey, 0)).append(' ');
    }

    System.out.println(sb);
  }
}