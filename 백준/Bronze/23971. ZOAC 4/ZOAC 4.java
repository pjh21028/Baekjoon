import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H, W, N, M;
        
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int iHeight = (H - 1) / (N + 1) + 1;
        int iWidth = (W - 1) / (M + 1) + 1;

        System.out.print(iHeight * iWidth);
    }
}