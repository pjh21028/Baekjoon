import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int iInput = scanner.nextInt();
		int iResult = 0;
 
		for(int i = 0; i < iInput; i++) {
			int iNumber = i;
			int iSum = 0;	
			
			while(iNumber != 0) {
				iSum += iNumber % 10;	
				iNumber /= 10;
            }
			if(iSum + i == iInput) {
				iResult = i;
				break;
			}
			
		}
 
		System.out.println(iResult);
	}
}