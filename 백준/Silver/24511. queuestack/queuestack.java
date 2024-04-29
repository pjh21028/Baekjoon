import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int iDataStructureNum= Integer.parseInt(br.readLine());
      int[] iArray = new int[iDataStructureNum];
      Deque<Integer> deque = new ArrayDeque<>();

        // arr[i][0] = 0이면 큐, 1이면 스택
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for(int i = 0; i < iDataStructureNum; i++) {
        iArray[i] = Integer.parseInt(st.nextToken());
      }
      
      st = new StringTokenizer(br.readLine(), " ");
      for(int i = 0; i < iDataStructureNum; i++) {
        int iNum = Integer.parseInt(st.nextToken());
        if (iArray[i] == 0) {
          deque.addLast(iNum);
        }
      }

      int iSequenceLength = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < iSequenceLength; i++) {
        deque.addFirst(Integer.parseInt(st.nextToken()));
        bw.write(deque.pollLast()+" ");
      }
      bw.flush();
    }
}