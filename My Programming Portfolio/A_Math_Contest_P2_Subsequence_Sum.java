import java.math.BigInteger;
import java.util.*;

public class A_Math_Contest_P2_Subsequence_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();

        long total = 0L;
        for (long a=0; a<N; a++) {
            total += in.nextLong();
            total %= 1000000007;
        }

        long p = 1;
        for (int b=0; b< N-1; b++) {
            p *= 2;
            p %= 1000000007;
        }
        
        System.out.println((p*total)%1000000007);
    }
}
