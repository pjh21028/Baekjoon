import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int iStudentNum = Integer.parseInt(br.readLine()); 

      Queue<Integer> q = new LinkedList<>();
      Stack<Integer> s = new Stack<>();
      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int i = 0; i < iStudentNum; i++) {
        q.offer(Integer.parseInt(st.nextToken()));
      }
      int iStart = 1;

      while(!q.isEmpty()) {
        if(q.peek() == iStart) {
          q.poll();
          iStart++;
        }
        else if(!s.isEmpty() && s.peek() == iStart) {
          s.pop();
          iStart++;
        }
        else {
          s.push(q.poll());
        }
      }
      while(!s.isEmpty()) {
        if(s.peek() == iStart) {
          s.pop();
          iStart++;
        }
        else {
          System.out.println("Sad");
          return;
        }
      }
      System.out.println("Nice");
    }
}