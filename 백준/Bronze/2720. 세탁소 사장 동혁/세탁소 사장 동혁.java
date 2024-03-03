import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iTestNum = Integer.parseInt(br.readLine());
        int iQuarter = 25;  
        int iDime = 10;  
        int iNickel = 5; 
        int iPenny = 1; 
        StringBuilder sb = new StringBuilder();
      
        for (int i = 0; i < iTestNum; i++) {
            int iChange = Integer.parseInt(br.readLine());
            sb.append(iChange / iQuarter + " ");
            iChange %= iQuarter;
            sb.append(iChange / iDime + " ");
            iChange %= iDime;
            sb.append(iChange / iNickel + " ");
            iChange %= iNickel;
            sb.append(iChange / iPenny + "\n");
        }
        System.out.print(sb);
    }
}