import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int iPeople1 = Integer.parseInt(st.nextToken());
    int iPeople2 = Integer.parseInt(st.nextToken());
    Map<String, Integer> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    for (int i = 0; i < iPeople1; i++) {
      map.put(br.readLine(), 1);
    }
    for (int i = 0; i < iPeople2; i++) {
      String sName = br.readLine();
      map.put(sName, map.getOrDefault(sName,0) +  1);
      if (map.get(sName) == 2) list.add(sName);
    }
    StringBuilder sb = new StringBuilder();
    Collections.sort(list);
    sb.append(list.size() + "\n");
    for (String s : list) {
      sb.append(s + "\n");
    }
    System.out.print(sb);
    }
}