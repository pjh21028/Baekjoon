import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> lCrane = new ArrayList<>();

        int iCraneNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < iCraneNum; i++) {
            lCrane.add(Integer.parseInt(st.nextToken()));
        }
        
        int iBoxNum = Integer.parseInt(br.readLine());
        List<Integer> lBox = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < iBoxNum; i++) {
            lBox.add(Integer.parseInt(st.nextToken()));
        }
        lCrane.sort(Collections.reverseOrder());
        lBox.sort(Collections.reverseOrder());
        if(lCrane.get(0) < lBox.get(0)) {
            System.out.println(-1);
            return;
        }
        int iDay = 0;
        while(!lBox.isEmpty()){
            int iBoxIdx = 0, iCraneIdx = 0;

            while(iCraneIdx < iCraneNum){
                if(iBoxIdx == lBox.size())
                    break;
                else if(lCrane.get(iCraneIdx) >= lBox.get(iBoxIdx)){
                    lBox.remove(iBoxIdx);
                    iCraneIdx++;
                }
                else {
                    iBoxIdx++;
                }
            }
            iDay++;
        }
        System.out.println(iDay);
    }
}