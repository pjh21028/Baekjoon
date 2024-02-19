import java.io.*;

public class Main {
    static int iAnswer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum = Integer.parseInt(br.readLine());
        iAnswer = 0;
        
        for(int i=0; i < iNum; i++) {
            checkGroupWord(br.readLine());
        }
        
        System.out.println(iAnswer);
        br.close();
    }
    
    private static void checkGroupWord(String sWord) {
        int[] iArray = new int[26];
        char cBeforeWord = sWord.charAt(0);
        iArray[cBeforeWord-'a']++;
        for(int i=1; i<sWord.length(); i++) {
            char cChar = sWord.charAt(i);
            if(cBeforeWord!=cChar) {
                if(iArray[cChar-'a']>0) return;
                else {
                    iArray[cChar-'a']++;
                    cBeforeWord = cChar;
                }
            }else iArray[cBeforeWord-'a']++;
        }
        iAnswer++;
    }
}