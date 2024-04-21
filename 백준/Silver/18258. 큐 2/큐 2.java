import java.io.*;
import java.util.*;

public class Main {
  static int[] iQueue = new int[2000001];
  static int iSize = 0;	
  static int iFront = 0;
  static int iBack = 0;
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int iCmdNum = Integer.parseInt(br.readLine());

    while(iCmdNum-- > 0) {
      st = new StringTokenizer(br.readLine(), " ");
      switch(st.nextToken()){
      case "push": push(Integer.parseInt(st.nextToken())); break;
      case "pop" : pop(); break;
      case "size" : size(); break;
      case "empty" : empty(); break;
      case "front" : front(); break;
      case "back" : back(); break;

      }
    }
    System.out.println(sb);
  }

  static void push(int n) {
    iQueue[iBack] = n;
    iBack++;
    iSize++;
  }

  static void pop() {
    if(iSize == 0) {
      sb.append(-1).append('\n');
    }
    else {
      sb.append(iQueue[iFront]).append('\n');	
      iSize--;
      iFront++;	
    }
  }

  static void size() {
    sb.append(iSize).append('\n');
  }

  static void empty() {
    if(iSize == 0) {
      sb.append(1).append('\n');
    }
    else sb.append(0).append('\n');
  }

  static void front() {
    if(iSize == 0) { 
      sb.append(-1).append('\n');
    }
    else {
      sb.append(iQueue[iFront]).append('\n');	 
    }
  }

  static void back() {
    if(iSize == 0) {
      sb.append(-1).append('\n');
    }
    else {
      sb.append(iQueue[iBack - 1]).append('\n');	
    }
  }

}