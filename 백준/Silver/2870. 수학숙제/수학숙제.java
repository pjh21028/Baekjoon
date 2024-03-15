import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<String> result = new ArrayList<>();
		
		Pattern pattern = Pattern.compile("\\d+");
		int M = Integer.parseInt(br.readLine());
		
		for(int i=0;i<M;i++) {
			String input = br.readLine();
			Matcher matcher = pattern.matcher(input);
			
			while(matcher.find()) {
				String num = matcher.group().replaceAll("^0+", "");
				result.add(num.length() == 0 ? "0" : num);
			}
		}
		
		result.sort((o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length());
		for(String s : result)
			sb.append(s).append('\n');
		
		System.out.println(sb);
		
		br.close();
	}

}