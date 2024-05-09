import java.io.*;
import java.util.*;

public class Main {
    static int iCount1, iCount2;
    static int[] iArray;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iNum =  Integer.parseInt(br.readLine());
        iArray = new int[iNum];

        br.close();

        iCount1 = 0;
        iCount2 = 0;

        fib(iNum);
        fibonacci(iNum);

        System.out.println(iCount1 + " " + iCount2);

    }

    static int fib(int n){
        if(n == 1 || n == 2){
            iCount1++; 
            return 1;
        }
        else return (fib(n-1) + fib(n-2));
    }

    static int fibonacci(int n){
        iArray[0] = 1;
        iArray[1] = 1;

        for(int i = 2; i < n; i++){
            iCount2++;
            iArray[i] = iArray[i-1] + iArray[i-2];
        }
        return iArray[n-1];
    }

}