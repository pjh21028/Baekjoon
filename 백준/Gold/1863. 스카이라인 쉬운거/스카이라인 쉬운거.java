import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Integer> stack = new Stack<>();

        int iBuildingNum = Integer.parseInt(br.readLine());
        int iAnswer = 0;
        for(int i = 0; i < iBuildingNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty() && stack.peek() > y) {
                iAnswer++;
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek() == y) {
                continue;
            }
            stack.push(y);
        }
        while (!stack.isEmpty())
            {
                if(stack.peek() > 0) {
                    iAnswer++;
                }
                stack.pop();
            }
            System.out.println(iAnswer);
    }
}