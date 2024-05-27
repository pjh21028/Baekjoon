import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] iArray = new int[5];
        int iPeopleNum = Integer.parseInt(st.nextToken());
        int iAreaNum = Integer.parseInt(st.nextToken());
        int iNewsPeople = iPeopleNum*iAreaNum;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++) {
            iArray[i] = Integer.parseInt(st.nextToken()) - iNewsPeople;
        }
        for(int i = 0; i < 5; i++) {
            System.out.print(iArray[i] + " ");
        } 
    }
}