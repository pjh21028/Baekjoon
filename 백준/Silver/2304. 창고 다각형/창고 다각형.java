import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iColumnNum = Integer.parseInt(br.readLine());
    int [] iArray = new int[1001];
    int iStart = Integer.MAX_VALUE;
    int iEnd = 0;
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < iColumnNum; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int iPosition = Integer.parseInt(st.nextToken());
        int iHeight = Integer.parseInt(st.nextToken());
        iArray[iPosition] = iHeight;
        iStart = Math.min(iPosition, iStart);
        iEnd = Math.max(iPosition, iEnd);
    }
    Stack<Integer> stack = new Stack<>();
    int iTemp = iArray[iStart];
    
    for (int i = iStart + 1; i <= iEnd; i++) {
        if(iArray[i] < iTemp)  { 
          stack.push(i); 
        }
        else {
            while (!stack.isEmpty()) {
                int x = stack.pop(); 
                iArray[x] = iTemp; 
            }
            iTemp = iArray[i];
        }
    }
    stack.clear();

    iTemp = iArray[iEnd];
    for(int i = iEnd - 1; i >= iStart; i--){
        if(iArray[i] < iTemp) stack.push(i);
        else {
            while (!stack.isEmpty()) {
                int x = stack.pop();
                  iArray[x]=iTemp;
            }
            iTemp=iArray[i];
        }
    }
    int iResult = 0;
    for (int i = iStart; i <= iEnd; i++) {
      iResult += iArray[i];
    }

    sb.append(iResult).append("\n");
    System.out.print(sb);
  }

}