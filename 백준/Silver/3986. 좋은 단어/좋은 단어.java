import java.util.*;
import java.io.*;

public class Main {
    static int iCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iWordNum = Integer.parseInt(br.readLine());
        iCount = 0;
        for (int i = 0; i < iWordNum; i++) {
            String sWord = br.readLine();
            goodWordCheck(sWord);
        }
        System.out.print(iCount);
    }

    static void goodWordCheck(String s) {
        if (s.length() % 2 == 1) return; 
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.size() > 0 && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty()) {
          iCount++;
        }
    }
}