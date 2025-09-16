package Primes_Recursion_1;
import java.util.*;
public class A_New_Prime_Factorization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> primes = new ArrayList<>();
        boolean[] notprime = new boolean[100000];
        notprime[0] = true;
        for (int a=2; a<=100000; a++) {
            for (int m=2; m*a<=100000; m++) {
                notprime[a*m-1] = true;
            }
            if (!notprime[a-1]) {
                primes.add(a);
            }
        }

        int N = in.nextInt();
        int r = N;
        for (int i=0; i<primes.size(); i++) {
            if (r != 1) {
                if (r % primes.get(i) == 0) {
                    r /= primes.get(i);
                    System.out.println(primes.get(i));
                    i--;
                }
            } else {
                return;
            }
        }
    }
}
