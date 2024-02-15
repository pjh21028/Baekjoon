import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int iTotal = 0;  
        int iNum;
        
        while (st.hasMoreTokens()) {
            iNum = Integer.parseInt(st.nextToken());
            iTotal += iNum*iNum;
        }
        System.out.print(iTotal % 10);        
	}
}