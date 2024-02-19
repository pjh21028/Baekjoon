import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sString = br.readLine();
        int iCount = 0;
        
		for(int i = 0 ; i < sString.length(); i++) {
            switch(sString.charAt(i)) {
			case 'A' : case 'B': case 'C' : 
				iCount += 3; 
				break;
                
			case 'D' : case 'E': case 'F' : 
				iCount += 4; 
				break;
                
			case 'G' : case 'H': case 'I' : 
				iCount += 5; 
				break;
                
			case 'J' : case 'K': case 'L' : 
				iCount += 6; 
				break;
                
			case 'M' : case 'N': case 'O' : 
				iCount += 7; 
				break;
                
			case 'P' : case 'Q': case 'R' : case 'S' :
				iCount += 8; 
				break;
                
			case 'T' : case 'U': case 'V' : 
				iCount += 9; 
				break;
                
			case 'W' : case 'X': case 'Y' : case 'Z' : 
				iCount += 10; 
				break;
			}
		}		
		System.out.print(iCount);
	}
}