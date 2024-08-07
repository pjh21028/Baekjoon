import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum = Integer.parseInt(br.readLine());
        sb.append((int) (Math.pow(2, iNum) - 1) + "\n");

        Hanoi(iNum, 1, 2, 3);
        System.out.println(sb);

        
    }

    public static void Hanoi(int N, int start, int mid, int to) throws IOException {
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        Hanoi(N - 1, start, to, mid);
        sb.append(start + " " + to + "\n");

        Hanoi(N - 1, mid, start, to);
    }
}