import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String sInput = st.nextToken();
        int iRadix = Integer.parseInt(st.nextToken());
        br.close();
      
        int iTemp = 1; 
        int iSum = 0; 

        for(int i = sInput.length()-1 ; i >= 0; i--) {
            char cChar = sInput.charAt(i);

            if('0' <= cChar && cChar <= '9') { 
              iSum += (cChar - '0') * iTemp;
            }
            else {
              iSum += (cChar- 'A' + 10) * iTemp; 
            }
            iTemp *= iRadix;
        }

        System.out.println(iSum);
    }
}