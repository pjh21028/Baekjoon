import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static int[] iStack;
  public static int iSize = 0;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int iCmdNum = Integer.parseInt(br.readLine());

    iStack = new int[iCmdNum];

    while (iCmdNum-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      String S = st.nextToken();

      switch (S) {
      case "push":
        push(Integer.parseInt(st.nextToken()));
        break;

      case "pop":
        sb.append(pop()).append('\n');
        break;

      case "size":
        sb.append(size()).append('\n');
        break;

      case "empty":
        sb.append(empty()).append('\n');
        break;

      case "top":
        sb.append(top()).append('\n');
        break;
      }

    }
    System.out.println(sb);
  }

  public static void push(int item) {
    iStack[iSize] = item;
    iSize++;
  }

  public static int pop() {
    if(iSize == 0) {
      return -1;
    }
    else {
      int res = iStack[iSize - 1];
      iStack[iSize - 1] = 0;
      iSize--;
      return res;
    }
  }

  public static int size() {
    return iSize;
  }

  public static int empty() {
    if(iSize == 0) {
      return 1;
    }
    else {
      return 0;
    }
  }

  public static int top() {
    if(iSize == 0) {
      return -1;
    }
    else {
      return iStack[iSize - 1];
    }
  }
}