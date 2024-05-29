import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
    }
    public static int arithmetic_sequence(int num) {
        int iCount = 0; 

        if (num < 100) {
            return num;
        }

        else {
            iCount = 99;
            for (int i = 100; i <= num; i++) {
                int iHundred = i / 100; 
                int iTen = (i / 10) % 10;
                int iOne = i % 10;

                if ((iHundred - iTen) == (iTen - iOne)) { 
                    iCount++;
                }
            }
        }

        return iCount;
    }
}