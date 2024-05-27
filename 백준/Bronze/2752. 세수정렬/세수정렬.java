import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] iArray = new int[3];
        for(int i = 0; i < 3; i++) {
            iArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(iArray);
        for(int i = 0; i < 3; i++) {
            System.out.print(iArray[i] + " ");
        }
    }
}