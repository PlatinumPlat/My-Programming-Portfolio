import java.util.*;

public class CCC_09_S1_Cool_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long s = in.nextLong();
        long e = in.nextLong();

        long eC = 0;
        long sC = 0;
        for (long i = 1; i*i*i*i*i*i <= e; i++) {
            if (i * i * i * i * i * i <= s-1) {
                eC++;
                sC++;
            } else if (i * i * i * i * i * i <= e) {
                eC++;
            }
        }
        System.out.println(eC - sC);
    }
}