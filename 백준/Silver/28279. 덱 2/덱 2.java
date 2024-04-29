import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayDeque<Integer> ArrDq = new ArrayDeque<Integer>();
    StringBuilder sb = new StringBuilder();

    int iInstructionNum = Integer.parseInt(br.readLine());

    for (int i = 0; i < iInstructionNum; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int iOrder = Integer.parseInt(st.nextToken());

      switch (iOrder) {

        case 1: {
          ArrDq.addFirst(Integer.parseInt(st.nextToken()));
          break;
        }

        case 2: {
          ArrDq.addLast(Integer.parseInt(st.nextToken()));
          break;
        }

        case 3: {
          if (ArrDq.isEmpty()) {
            sb.append(-1).append('\n');
          } 
          else {
            sb.append(ArrDq.pollFirst()).append('\n');
          }
          break;
        }

        case 4: {
          if (ArrDq.isEmpty()) {
            sb.append(-1).append('\n');
          } 
          else {
            sb.append(ArrDq.pollLast()).append('\n');
          }
          break;
        }

        case 5: {
          sb.append(ArrDq.size()).append('\n');
          break;
        }

        case 6: {
          if (ArrDq.isEmpty()) {
            sb.append(1).append('\n');
          } 
          else {
            sb.append(0).append('\n');
          }
          break;
        }

        case 7: {
          if (ArrDq.isEmpty()) {
            sb.append(-1).append('\n');
          } 
          else {
            sb.append(ArrDq.peekFirst()).append('\n');
          }
          break;
        }

        case 8: {
          if (ArrDq.isEmpty()) {
            sb.append(-1).append('\n');
          } 
          else {
            sb.append(ArrDq.peekLast()).append('\n');
          }
          break;
        }
      }
    }
    System.out.println(sb);
  }
}