import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int iNum = scanner.nextInt();
        int iOrder = scanner.nextInt();
        int iCount = 0;

        for(int i = 1; i <= iNum; i++) {
            if(iNum % i == 0) {
                iCount++;
            }
            if(iCount == iOrder) {
                System.out.print(i);
                break;
            }
        }
        if(iCount < iOrder) {
            System.out.print(0);
        }
	}
}