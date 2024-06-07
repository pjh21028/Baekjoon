import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum = Integer.parseInt(br.readLine());
        int[] iDP = new int[46];  
        iDP[1] = 1;
        for (int i = 2; i <= iNum; i++) {
          iDP[i] = iDP[i-1] + iDP[i-2];
        }
        System.out.print(iDP[iNum]);
    }
}