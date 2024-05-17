import java.io.*;
import java.util.*;

public class Main {
    public static int[] iArray;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        iArray = new int[M];

        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int location, int depth) {

        if (depth == M) {
            for (int iVal : iArray) {
                sb.append(iVal).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = location; i <= N; i++) {

            iArray[depth] = i;
            dfs(i + 1, depth + 1);

        }
    }
}