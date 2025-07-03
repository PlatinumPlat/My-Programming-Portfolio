package Strings_2;
import java.util.Scanner;
import java.lang.Math;

public class Strings_2_AQT_Fractions {
    static long gcd(long n1, long n2) {
        if (n2 == 0) {
            return n1;
        }

        return gcd(n2, n1 % n2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        long[] out = new long[n];

        for (int i=0; i<n; i++) {
            long t = in.nextLong();
            long b = in.nextLong();
            long gcd = gcd(b, t);
            b = b/gcd;
            boolean even = true;
            int e = 0;
            int f = 0;
            boolean five = true;

            if (b%2 ==0) {
                while (even) {
                    if (b%2 == 0) {
                        b = b / 2;
                        e++;
                    } else {
                        even = false;
                    }
                }
            } if (b%5 ==0) {
                while (five) {
                    if (b%5 == 0) {
                        b = b / 5;
                        f++;
                    } else {
                        five = false;
                    }
                }
            }

            if (b==1) {
                out[i] = Math.max(e, f);
            } else {
                out[i] = -1;
            }
        }

        for (int a=0; a< n; a++) {
            System.out.println(out[a]);
        }
    }
}
