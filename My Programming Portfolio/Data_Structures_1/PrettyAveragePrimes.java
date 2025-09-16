package Data_Structures_1;
import java.util.*;
public class PrettyAveragePrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        boolean[] notprime = new boolean[2000005];
        notprime[0] = true;
        for (int a = 2; a <= 2000005; a++) {
            for (int b = 2; b * a <= 2000005; b++) {
                notprime[b * a - 1] = true;
            }
        }

        for (int a=0; a<T; a++) {
            int I = in.nextInt();
            for (int b=2; b<=I; b++) {
                if (!notprime[b-1]) {
                    if (!notprime[2* I-b-1]) {
                        System.out.println(b + " " + (2*I-b));
                        break;
                    }
                }
            }
        }
    }
}
