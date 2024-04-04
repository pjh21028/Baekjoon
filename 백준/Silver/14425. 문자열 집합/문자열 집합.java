import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int iNum = Integer.parseInt(st.nextToken());
    int iLine = Integer.parseInt(st.nextToken());
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < iNum; i++) {
      map.put(br.readLine(), 0);
    }
    int iCount = 0;
    for (int i = 0; i < iLine; i++) {
      if (map.containsKey(br.readLine())) {
        iCount++;
      }
    }
    System.out.print(iCount);
    }
}