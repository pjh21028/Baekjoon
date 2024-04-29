import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iBalloonNum = Integer.parseInt(br.readLine());

    Deque<int[]> q = new ArrayDeque<>();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] iArray = new int[iBalloonNum];
    for(int i = 0; i < iBalloonNum; i++) {
      iArray[i] = Integer.parseInt(st.nextToken());
    }
    StringBuilder sb = new StringBuilder();
    
    sb.append("1 ");
    int iIn = iArray[0];

    for(int i = 1; i < iBalloonNum; i++){
      q.add(new int[] {(i+1), iArray[i]});
    }

    while(!q.isEmpty()) {
      if(iIn >0) {
        for(int i = 1; i < iIn; i++) {
          q.add(q.poll());
        }

        int[] iNext = q.poll();
          iIn = iNext[1];
        sb.append(iNext[0]+" ");
      }
      else {
        for(int i=1; i< -iIn; i++	) {
          q.addFirst(q.pollLast());
        }

        int[] iNext = q.pollLast();
        iIn = iNext[1];
        sb.append(iNext[0]+" ");
      }
    }
    System.out.println(sb.toString());
  }
}