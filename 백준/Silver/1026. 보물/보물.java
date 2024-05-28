import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] iArray = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            iArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(iArray); 

        Integer[] IArray = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            IArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(IArray, Comparator.reverseOrder()); 

        int iAnswer = 0;
        for (int i = 0; i < N; i++) { 
            iAnswer += iArray[i] * IArray[i];
        }

        bw.write(iAnswer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}