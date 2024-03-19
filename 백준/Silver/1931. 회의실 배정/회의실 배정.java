import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iMeetingNum = Integer.parseInt(br.readLine());
    int[][] iMeetingTime = new int[iMeetingNum][2];
    StringTokenizer st;

    for(int i = 0; i < iMeetingNum; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      iMeetingTime[i][0] = Integer.parseInt(st.nextToken());
      iMeetingTime[i][1] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(iMeetingTime, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[1] == o2[1]) {
          return o1[0] - o2[0];
        }
        return o1[1] - o2[1];
      }
    });

    int iCount = 0;
    int iPrevEndTime = 0;

    for(int i = 0; i < iMeetingNum; i++) {
      if(iPrevEndTime <= iMeetingTime[i][0]) {
        iPrevEndTime = iMeetingTime[i][1];
        iCount++;
      }
    }
    System.out.println(iCount);
  }
}