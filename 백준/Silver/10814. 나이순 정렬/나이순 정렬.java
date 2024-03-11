import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iMemberNum = Integer.parseInt(br.readLine());
    String[][] sArray = new String[iMemberNum][2];
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < iMemberNum; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      sArray[i][0] = st.nextToken();
      sArray[i][1] = st.nextToken();
    }

    Arrays.sort(sArray, new Comparator<String[]>() {
      public int compare(String[]o1, String[]o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
      }
    });
    
    for(int i = 0; i < iMemberNum; i++) {
      sb.append(sArray[i][0]).append(" ").append(sArray[i][1]).append("\n");
    }
    System.out.println(sb);
  }
}