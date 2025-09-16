import java.util.*;

public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int done = 0;
        if (N>=1) {
            System.out.println(2);
            done ++;
        }

        for (int i=3; i< 542; i+=2) {
            boolean found = false;
            
            if (4 <= i) {
                if (i%2==0) {
                    found = true;
                }
            }

            for (int a = 3; a * a <= i && found != true; a += 2) {
                if (i % a == 0) {
                    found = true;
                }
            }

            if (!found && done < N) {
                System.out.println(i);
                done++;
            } else if (done == N) {
                return;
            }
        }
    }
}
