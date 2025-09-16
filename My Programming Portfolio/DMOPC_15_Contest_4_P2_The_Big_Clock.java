import java.util.*;

public class DMOPC_15_Contest_4_P2_The_Big_Clock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        long N = in.nextLong();
        M += N;
        H += M / 60;
        M %= 60;
        H %= 24;
        System.out.println(H + " " + M);
    }
}
