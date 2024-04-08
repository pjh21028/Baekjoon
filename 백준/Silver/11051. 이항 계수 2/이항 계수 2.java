import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int iMember = Integer.parseInt(st.nextToken());
        int iNum = Integer.parseInt(st.nextToken());
        BigInteger iFactorialResult = factorial(BigInteger.valueOf(iMember))
                .divide(factorial(BigInteger.valueOf(iMember - iNum)).multiply(factorial(BigInteger.valueOf(iNum))));
        BigInteger iResult = iFactorialResult.mod(BigInteger.valueOf(10007));
        System.out.println(iResult);
    }

    static BigInteger factorial(BigInteger N) {
        if (N.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        }
        return N.multiply(factorial(N.subtract(BigInteger.ONE)));
    }
}