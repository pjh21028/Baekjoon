import java.util.*;
import java.io.*;

public class Main {
  static int iNthBigNum;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    StringTokenizer st;

    int iNthBigNum = Integer.parseInt(br.readLine());

    for(int i = 0; i < iNthBigNum; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0;j < iNthBigNum; j++) {
        pq.add(Integer.parseInt(st.nextToken()));
      }
    }

    for(int i = 0;i < iNthBigNum - 1; i++) {
      pq.remove();
    }
    bw.write(pq.poll()+"");
    bw.flush();
    bw.close();
  }
}