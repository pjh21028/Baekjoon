import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      int iNum = Integer.parseInt(br.readLine());
      int [] iArray = new int [iNum];
      int [] iCountArray = new int [iNum];
      HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      for(int i = 0; i < iNum; i++) {
        iCountArray[i] = iArray[i] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(iCountArray);

      int rank = 0;
      for(int v : iCountArray) {
        if(!rankingMap.containsKey(v)) {
          rankingMap.put(v, rank);
          rank++;		
        }
      }

      StringBuilder sb = new StringBuilder();
      for(int key : iArray) {
        int ranking = rankingMap.get(key);
        sb.append(ranking).append(' ');
      }
      System.out.println(sb);
    }
}