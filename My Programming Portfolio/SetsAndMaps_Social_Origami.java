import java.util.Scanner;
import java.lang.Math;

public class SetsAndMaps_Social_Origami {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        long K = in.nextLong();
        long curr = 1;
        long count = 0;
        in.close();

        while (curr <= K) {
            curr = curr *2;
            count ++;
            if (curr >= N) {
                System.out.println(count);
                return;
            }
        }

        if ((N-curr)%K == 0) {
            count += (N-curr)/K;
        } else {
            count += (N-curr)/K +1;
        }
        System.out.println(count);
    }
}