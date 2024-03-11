import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[] iQue = new int[10001];
  static int iFirst = 0;
  static int iLast = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iInputNUm = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < iInputNUm; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String S = st.nextToken();

      switch(S) {
      case "push" :
        push(Integer.parseInt(st.nextToken()));
        break;
      case "pop" :
        sb.append(pop()).append("\n");
        break;
      case "size" :
        sb.append(size()).append("\n");
        break;
      case "empty" :
        sb.append(empty()).append("\n");
        break;
      case "front" :
        sb.append(front()).append("\n");
        break;
      case "back" :
        sb.append(back()).append("\n");
        break;
      }
    }
    System.out.println(sb);
  }

  public static void push(int X) {
    iQue[iLast] = X;
    iLast++;
  }

  public static int pop() {
    if(iLast - iFirst == 0) {
      return -1;
    }else {
      int P = iQue[iFirst];
      iFirst++;
      return P;
    }
  }

  public static int size() {
    return iLast - iFirst;
  }

  public static int empty() {
    if(iLast - iFirst == 0) {
      return 1;
    }else {
      return 0;
    }
  }

  public static int front() {
    if(iLast - iFirst == 0) {
      return -1;
    }else {
      int F = iQue[iFirst];
      return F;
    }
  }

  public static int back() {
    if(iLast - iFirst == 0) {
      return -1;
    }else {
      int B = iQue[iLast - 1];
      return B;
    }
  }
}