import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int iMonth = Integer.parseInt(st.nextToken());
        int iDay = Integer.parseInt(st.nextToken());
        String[] sDays = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] iMonths = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int n = 0;
        for (int i = 0; i < iMonth; i++) {
            n += iMonths[i];
        }
        n += iDay-1;
        System.out.print(sDays[n%7]);
    }
}