import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int iCount = Integer.parseInt(br.readLine());
        int iNum = 0;
        Set<String> hSet = new HashSet<>();
        for (int i = 0; i < iCount; i++) {
            String sString = br.readLine();
            if (sString.equals("ENTER")) {
                hSet.clear();
            } else {
                if (hSet.contains(sString)) {
                    continue;
                }
                hSet.add(sString);
                iNum++;
            }
        }
        System.out.println(iNum);
    }
}