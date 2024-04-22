import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int iTestCase = Integer.parseInt(br.readLine());

    while (iTestCase-- > 0) {

      StringTokenizer st = new StringTokenizer(br.readLine());

      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      LinkedList<int[]> q = new LinkedList<>();	
      st = new StringTokenizer(br.readLine());

      for (int i = 0; i < N; i++) {
        q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
      }

      int iCount = 0;

      while (!q.isEmpty()) {	
        int[] front = q.poll();	
        boolean bMax = true;

        for(int i = 0; i < q.size(); i++) {
          if(front[1] < q.get(i)[1]) {
            q.offer(front);
            for(int j = 0; j < i; j++) {
              q.offer(q.poll());
            }
            bMax = false;
            break;
          }
        }
        if(bMax == false) {
          continue;
        }
        iCount++;
        if(front[0] == M) {	
          break;
        }
      }
      sb.append(iCount).append('\n');
    }
    System.out.println(sb);
  }

}