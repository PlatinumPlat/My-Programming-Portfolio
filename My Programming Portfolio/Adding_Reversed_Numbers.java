import java.util.*;

public class Adding_Reversed_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            long x = in.nextLong();
            long y = in.nextLong();

            long x1 = 0;
            long y1 = 0;
            while (x > 0) {
                x1 *= 10;
                x1 += x % 10;
                x /= 10;
            }

            while (y > 0) {
                y1 *= 10;
                y1 += y % 10;
                y /= 10;
            }

            long sum = x1 + y1;
            long b = 0L;
            while (sum > 0) {
                b *= 10;
                b += sum % 10;
                sum /= 10;
            }

            System.out.println(b);
        }
    }
}
