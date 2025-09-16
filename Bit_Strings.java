import java.util.*;

public class Bit_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();

        long output = 1L;
        for (int a=0; a<N; a++) {
            output*=2;
            output%= 1000000007;
        }

        System.out.println(output);
    }
}
