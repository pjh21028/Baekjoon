import java.io.*;
import java.util.ArrayDeque;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		ArrayDeque<Integer> ArrDq = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
 
		int iInstructionNum = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < iInstructionNum; i++) {
 
			String[] s = br.readLine().split(" ");
 
			switch (s[0]) {
 
				case "push_front": {
					ArrDq.addFirst(Integer.parseInt(s[1]));
					break;
				}
				
				case "push_back": {
					ArrDq.addLast(Integer.parseInt(s[1]));
					break;
				}
 
				case "pop_front": {
					if (ArrDq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(ArrDq.pollFirst()).append('\n');
					}
					break;
				}
 
				case "pop_back": {
					if (ArrDq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(ArrDq.pollLast()).append('\n');
					}
					break;
				}
 
				case "size": {
					sb.append(ArrDq.size()).append('\n');
					break;
				}
 
				case "empty": {
					if (ArrDq.isEmpty()) {
						sb.append(1).append('\n');
					} 
					else {
						sb.append(0).append('\n');
					}
					break;
				}
 
				case "front": {
					if (ArrDq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(ArrDq.peekFirst()).append('\n');
					}
					break;
				}
 
				case "back": {
					if (ArrDq.isEmpty()) {
						sb.append(-1).append('\n');
					} 
					else {
						sb.append(ArrDq.peekLast()).append('\n');
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}