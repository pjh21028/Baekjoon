import java.util.*;
import java.io.*;

 public class Main {
	public static void main(String[] args) throws IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int iNum = Integer.parseInt(br.readLine());
		
		int[] iArray = new int[iNum];
		int sum = 0;
		
		for(int i = 0; i < iNum; i++) {
			int value = Integer.parseInt(br.readLine());
			iArray[i] = value;
			sum += value;
		}
		
		Arrays.sort(iArray);
		
		boolean flag = false;
		int mode_max = 0;
		int mode = 10000;
		
		for(int i = 0; i < iNum; i++) {
			int jump = 0;	
			int count = 1;
			int i_value = iArray[i];
			
			for(int j = i + 1; j < iNum; j++){
				if(i_value != iArray[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			
			i += jump;
		}
		
		System.out.println((int)Math.round((double)sum / iNum));
		System.out.println(iArray[iNum / 2]);
		System.out.println(mode);		
		System.out.println(iArray[iNum - 1] - iArray[0]);
		
	}
}