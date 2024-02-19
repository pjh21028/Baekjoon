import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sString = br.readLine();        
        String[] sCroatiaAlphabetArray = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for(String sValue : sCroatiaAlphabetArray) {
        	sString = sString.replace(sValue, "A");
        }
		System.out.println(sString.length());
	}
}