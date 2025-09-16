import java.util.*;

public class THICC_17_P2_Molly_and_Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        long A0 = in.nextLong();
        long B = in.nextLong();
        long M = in.nextLong();


        long totalSum = A0 %1000000007;
        long squareSum = (A0*A0) % 1000000007;
        long prev = A0;
        for (int i=1; i<N; i++) {
            long curr = (prev*B)%M;
            totalSum += curr;
            totalSum %=1000000007;
            prev = curr;
            squareSum += (curr *curr)%1000000007;
        }

        System.out.println((totalSum*totalSum - squareSum)%1000000007);
    }
}
