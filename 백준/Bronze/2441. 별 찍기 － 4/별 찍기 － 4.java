import java.io.*;
import java.util.*;

public class Main {
    public static long lC;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iNum = Integer.parseInt(br.readLine());
        for(int i = 0; i < iNum; i++) {
            for(int j= iNum - i; j < iNum; j++) {
                  System.out.print(" ");     
            }
            for(int k = i; k < iNum; k++) {
                System.out.print("*");
            }            
            System.out.println();                 
        }  
    }    
}