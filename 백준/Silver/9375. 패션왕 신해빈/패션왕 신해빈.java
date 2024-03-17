import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int iTestCase;

    iTestCase = Integer.parseInt(br.readLine());
    for(int i = 0; i < iTestCase; i++) {
      HashMap<String, Integer> hm = new HashMap<>();	// <종류, 개수>

      int iClothNum = Integer.parseInt(br.readLine());	// 입력받는 옷의 개수

      for(int j = 0; j < iClothNum; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String sCloth = st.nextToken();
        String sKind = st.nextToken();

        if (hm.containsKey(sKind)) {
          hm.put(sKind, hm.get(sKind) + 1);
        } 
        else {
          hm.put(sKind, 1);
        }
      }

      int iResult = 1;

      for (int iKindCase : hm.values()) {
        iResult *= (iKindCase + 1);
      }
      sb.append(iResult - 1).append('\n');
    }
    System.out.println(sb);
  }
}