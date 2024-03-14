import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int iMachineNum = Integer.parseInt(st.nextToken());

        long lMuscleLoss[] = new long[iMachineNum];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < iMachineNum; i++){
            lMuscleLoss[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(lMuscleLoss);
        long lResult = lMuscleLoss[iMachineNum - 1];

        if(iMachineNum % 2 == 0){
            for(int i = 0; i < iMachineNum / 2; i++){
                long lMinMuscleLoss = lMuscleLoss[i] + lMuscleLoss[iMachineNum - 1 - i];
                if(lResult < lMinMuscleLoss) {
                  lResult = lMinMuscleLoss;
                }
            }
        }
        else{
            for(int i = 0; i < iMachineNum / 2; i++){
                long lMinMuscleLoss = lMuscleLoss[i] + lMuscleLoss[iMachineNum - 2 - i];
                if(lResult < lMinMuscleLoss) {
                  lResult = lMinMuscleLoss;
                }
            }
        }
        System.out.println(lResult);
    }
}