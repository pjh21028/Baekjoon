import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iNum = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        
        for (int i=0; i < iNum; i++) {
            pq.add(Long.parseLong(br.readLine()));
        }
        long lNum = 0;

        while (pq.size() > 1) {
            long lTemp1 = pq.poll();
            long lTemp2 = pq.poll();

            lNum += lTemp1 + lTemp2;
            pq.add(lTemp1 + lTemp2); 
        }
        System.out.println(lNum);
    }
}