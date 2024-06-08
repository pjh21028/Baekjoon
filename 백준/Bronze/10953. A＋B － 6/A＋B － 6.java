import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int iTestcase = Integer.parseInt(br.readLine());
        for(int i = 0; i < iTestcase; i++) {
            st = new StringTokenizer(br.readLine(),",");

            int iA = Integer.parseInt(st.nextToken());
            int iB = Integer.parseInt(st.nextToken());
            sb.append(iA + iB + "\n");

        }
        System.out.println(sb);
    }
    
}