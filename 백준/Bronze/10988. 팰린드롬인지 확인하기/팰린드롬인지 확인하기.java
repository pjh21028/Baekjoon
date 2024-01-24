import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sscanner = new Scanner(System.in);
		
		String sString = sscanner.next();
		sscanner.close();
		int iLength = sString.length();
		int iAnswer = 1;
		
		for(int i=0;i<iLength/2;i++) {
			if(sString.charAt(i)!=sString.charAt(iLength-1-i)) {
				iAnswer = 0;
			}
		}
		System.out.println(iAnswer);	
	}
}