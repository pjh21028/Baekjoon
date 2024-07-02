import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger k = new BigInteger(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        
        boolean[] primes = new boolean[l + 1];
        primes[1] = true;
              
        for(int i = 2 ; i < l ; i++){
            if(primes[i]) continue; // 소수가 아닌(true) 수는 넘어가기
            BigInteger now = new BigInteger(Integer.toString(i));
            if(k.mod(now).compareTo(BigInteger.ZERO) == 0) {    // p를 now로 나눈 나머지가 0이면 
                System.out.println("BAD " + now);
                return;
            }
            for(int j = i + i ; j <= l ; j += i){ // i를 제외한 i의 배수 모두 체크하기
                primes[j] = true;
            }
        }
        System.out.println("GOOD");
        
 
    }
 
}