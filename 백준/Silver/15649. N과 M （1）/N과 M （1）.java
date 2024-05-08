import java.io.*;
import java.util.*;

public class Main {
    public static int[] iArray;
    public static boolean[] bVisit;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        iArray = new int[M];
        bVisit = new boolean[N];
        dfs(N, M, 0);
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int iVal : iArray) {
                sb.append(iVal).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!bVisit[i]) {
                bVisit[i] = true;
                iArray[depth] = i + 1;
                dfs(N, M, depth + 1);
                bVisit[i] = false;
            }
        }
    }

}