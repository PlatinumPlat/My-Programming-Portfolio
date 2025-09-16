package Data_Structures_1;
import java.util.*;
public class AromanticNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        long out = 0L;

        for (int a=0; a<s.length(); a+=2) {
            int amount = s.charAt(a) - '0';
            int base;

            if (s.charAt(a+1)=='I') {
                base = 1;
            } else if (s.charAt(a + 1) == 'V') {
                base = 5;
            } else if (s.charAt(a + 1) == 'X') {
                base = 10;
            } else if (s.charAt(a + 1) == 'L') {
                base = 50;
            } else if (s.charAt(a + 1) == 'C') {
                base = 100;
            } else if (s.charAt(a + 1) == 'D') {
                base = 500;
            } else {
                base = 1000;
            }

            if (a+3 < s.length()) {
                int base2;

                if (s.charAt(a + 3) == 'I') {
                    base2 = 1;
                } else if (s.charAt(a + 3) == 'V') {
                    base2 = 5;
                } else if (s.charAt(a + 3) == 'X') {
                    base2 = 10;
                } else if (s.charAt(a + 3) == 'L') {
                    base2 = 50;
                } else if (s.charAt(a + 3) == 'C') {
                    base2 = 100;
                } else if (s.charAt(a + 3) == 'D') {
                    base2 = 500;
                } else {
                    base2 = 1000;
                }

                if (base2 > base) {
                    out -= amount * base;
                } else {
                    out += amount * base;
                }
            } else {
                out += amount * base;
            }
        }

        System.out.println(out);
    }
}
