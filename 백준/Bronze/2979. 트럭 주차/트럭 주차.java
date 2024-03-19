import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());	
    int B = Integer.parseInt(st.nextToken());	
    int C = Integer.parseInt(st.nextToken());
    int iFirstTruckTime = 101; 
    int iLastTruckTime = 0;	
    int[][] iTruck = new int[3][2];
    int[] iArray = new int[100];
    int iFee = 0;

    for(int i=0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      int iStartTime = Integer.parseInt(st.nextToken());
      int iEndTime = Integer.parseInt(st.nextToken());
      iTruck[i][0] = iStartTime;
      iTruck[i][1] = iEndTime;

      for(int j=iStartTime; j < iEndTime; j++) {
        iArray[j]++;
      }
    }

    for(int i=0; i<3; i++) {
      for(int j=0; j<2; j++) {
        if(iTruck[i][j] < iFirstTruckTime)	{
          iFirstTruckTime = iTruck[i][j];
        }
        if(iTruck[i][j] > iLastTruckTime)	{
          iLastTruckTime = iTruck[i][j];
        }
      }
    }
    for (int i = iFirstTruckTime; i < iLastTruckTime; i++) {
        switch (iArray[i]) {
        case 1:
            iFee = iFee + A*iArray[i];
            break;
        case 2:
            iFee = iFee + B*iArray[i];
            break;
        case 3:
            iFee = iFee + C*iArray[i];
            break;
        }
    }
    System.out.println(iFee);
    br.close();
  }

}