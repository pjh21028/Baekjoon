import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum = Integer.parseInt(br.readLine());
        int iCount = 0;
        int iTemp = iNum;

        do {
            iNum = ((iNum % 10) * 10) + (((iNum / 10) + (iNum % 10)) % 10);
            iCount++;
        }
        while(iTemp != iNum);
    
        System.out.println(iCount);
    }
}