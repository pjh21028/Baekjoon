import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] iArray = new int[26]; 
        String sAlphabet = br.readLine(); 
        for (int i = 0; i < sAlphabet.length(); i++) {
            char cChar = sAlphabet.charAt(i);
            iArray[cChar - 97]++;  
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(iArray[i] + " ");
        }
    }
}