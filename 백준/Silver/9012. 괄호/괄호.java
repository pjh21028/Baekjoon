import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int iTestNum = Integer.parseInt(br.readLine());

    for(int i = 0; i < iTestNum; i++) {
      sb.append(VPS_Reading(br.readLine())).append('\n');
    }
    System.out.println(sb);
  }

  public static String VPS_Reading(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char cChar = s.charAt(i);

      if (cChar == '(') {
        stack.push(cChar);
      }
      else if (stack.empty()) {
        return "NO";
      }
      else {
        stack.pop();
      }
    }
    if (stack.empty()) {
      return "YES";
    } 
    else {
      return "NO";
    }
  }
}