import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum = Integer.parseInt(br.readLine());
        double iResult = Math.pow(2, iNum);
        System.out.println((int)iResult);
    }
}