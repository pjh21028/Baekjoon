import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bReader.readLine(), " ");

        int iDay;

        int iUp = Integer.parseInt(st.nextToken());
        int iDown = Integer.parseInt(st.nextToken());
        int iLength = Integer.parseInt(st.nextToken());

        iDay = (iLength - iDown) / (iUp - iDown);
		if ((iLength - iDown) % (iUp - iDown) != 0) {
            iDay++;
        }
		System.out.println(iDay);   
    }
}