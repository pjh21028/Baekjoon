import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int iNum1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int iNum2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        
        if(iNum1 > iNum2) {
            System.out.print(iNum1);
        }
        else {
            System.out.print(iNum2);
        }
    }   
}