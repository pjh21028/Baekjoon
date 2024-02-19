import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sTokenizer;
        int iTrafficLightNum, iRoadLength;
        int iTrafficLightposition, iRed, iGreen;
        int iMovingTime = 0, iMovingLength = 0, iTrafficLightIndex = 0;

        sTokenizer = new StringTokenizer(bReader.readLine());
        iTrafficLightNum = Integer.parseInt(sTokenizer.nextToken());
        iRoadLength = Integer.parseInt(sTokenizer.nextToken());
       
        int[][] iTrafficLightArray = new int[iTrafficLightNum][3];
        for(int i = 0; i < iTrafficLightNum; i++) {
            sTokenizer = new StringTokenizer(bReader.readLine());
            iTrafficLightArray[i][0] = Integer.parseInt(sTokenizer.nextToken());
            iTrafficLightArray[i][1] = Integer.parseInt(sTokenizer.nextToken());
            iTrafficLightArray[i][2] = Integer.parseInt(sTokenizer.nextToken());          
        }

        while(iMovingLength < iRoadLength) {
            if(iTrafficLightIndex == iTrafficLightNum) {
                iMovingTime += iRoadLength - iMovingLength;
                break;
            }
            iTrafficLightposition =  iTrafficLightArray[iTrafficLightIndex][0];
            iRed = iTrafficLightArray[iTrafficLightIndex][1];
            iGreen = iTrafficLightArray[iTrafficLightIndex][2];
           
            iMovingTime += iTrafficLightposition - iMovingLength;
            iMovingLength = iTrafficLightposition;
            if(iMovingTime % (iRed + iGreen) < iRed) {
                iMovingTime += iRed - (iMovingTime % (iRed + iGreen));
            }
            iTrafficLightIndex++;            
        }
        System.out.println(iMovingTime);        
    }
}