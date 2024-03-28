import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int iStick1 = Integer.parseInt(st.nextToken());
        int iStick2 = Integer.parseInt(st.nextToken());
        int iStick3 = Integer.parseInt(st.nextToken());

        int iMax = 0;
        if(iStick1 > iStick2){
            if(iStick2 > iStick3) {
              iMax = iStick1;
            }
            else {
              iMax = (iStick1>iStick3) ? iStick1 : iStick3;
            }
        }
        else {
          iMax = (iStick2>iStick3) ? iStick2 : iStick3;
        }

        if(iStick1+iStick2+iStick3-iMax > iMax) {
          System.out.println(iStick1+iStick2+iStick3);
        }
        else {
          System.out.print((iStick1+iStick2+iStick3-iMax)*2-1);
        }
    }
}