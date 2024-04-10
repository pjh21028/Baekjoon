import java.io.*;
import java.util.*;

public class Main {
    static int iClassNum;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    static int [][]iClassTime;
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      iClassNum= Integer.parseInt(br.readLine());
      iClassTime = new int[iClassNum+1][2];
      StringTokenizer st;
      
      for(int i=1; i<=iClassNum; i++){
        st = new StringTokenizer(br.readLine(), " ");
        iClassTime[i][0] = Integer.parseInt(st.nextToken());
        iClassTime[i][1] = Integer.parseInt(st.nextToken());
      }
        Arrays.sort(iClassTime, (a,b) ->{
          if(a[0] > b[0]){
            return 1;
          }
          else if(a[0]==b[0]){
            return a[1]-b[1];
          }
          else{
            return -1;
          }
        });

      pq.add(iClassTime[1][1]);
      for(int i=2; i<=iClassNum; i++){
        if(pq.peek() <=iClassTime[i][0]){
          pq.poll();
        }
        pq.add(iClassTime[i][1]);
      }
      System.out.println(pq.size() );
    }
}