import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] iBurgerArr = new int[3];
        int [] iDrinkArr = new int[2];
        int iMin = 0;
        for(int i = 0; i < 3; i++) {
            iBurgerArr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 2; i++) {
            iDrinkArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(iBurgerArr);
        Arrays.sort(iDrinkArr);
        iMin = iBurgerArr[0] + iDrinkArr[0] - 50;
        System.out.print(iMin);
    }
}