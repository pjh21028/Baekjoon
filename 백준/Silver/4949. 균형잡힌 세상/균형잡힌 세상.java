import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String sString;
    
    while(true) {
      sString = br.readLine();
      if(sString.equals(".")) {	// 종료 조건문
        break;
      }
      sb.append(solve(sString) + '\n');
    }
    System.out.println(sb);
  }

  public static String solve(String s) {
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < s.length(); i++) {
      char cSearchChar = s.charAt(i);

      if(cSearchChar == '(' || cSearchChar == '[') {
        stack.push(cSearchChar);
      }

      else if(cSearchChar == ')') {
        if(stack.empty() || stack.peek() != '(') {
          return "no";
        }
        else {
          stack.pop(); //스택 안에 있는 '('를 빼냄
        }
      }

      else if(cSearchChar == ']') {
        if(stack.empty() || stack.peek() != '[') {
          return "no";
        }
        else {
          stack.pop(); ///스택 안에 있는 '['를 빼냄
        }
      }
    }
    
    if(stack.empty()) { //탐색했을 때 괄호가 아닌 경우 스택이 비여있는 경우, 균형 잡힌 상태
      return "yes";
    }
    else {
      return "no"; //스택 안에 괄호가 push 되어 있는 상태이므로 균형 잡히지 않은 상태
    }
  }
}