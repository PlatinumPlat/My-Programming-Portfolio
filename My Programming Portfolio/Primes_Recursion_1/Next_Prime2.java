package Primes_Recursion_1;
import java.util.*;

public class Next_Prime2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        if (n==1) {
            System.out.println(2);
            return;
        }
        for (long z=0; n+z<= 2 * n; z++) {
            boolean found=false;
            for (long m=2; m<=Math.sqrt((double)(z+n)); m++) {
                if ((z+n)%m == 0) {
                    found=true;
                    break;
                }
            }

            if (!found) {
                System.out.println(n + z);
                return;
            }
        }
    }
}