import java.io.*;
import java.util.*;

public class Main {
    public static long lC;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int [] iArray = new int[3];
        for(int i = 0; i < 3; i++) {
            iArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(iArray);
        System.out.print(iArray[1]);
    }
    
}