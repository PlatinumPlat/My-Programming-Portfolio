package Lists_1;
import java.util.Scanner;
import java.lang.Math;

public class List_1_Trash_Push {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int[] out  = new int[T];

        for (int i = 0; i<T; i++) {
            int N = in.nextInt();
            int K = in.nextInt();

            out[i] = (N+K-1)/K;
        }

        for (int a=0; a<T; a++) {
            System.out.println(out[a]);
        }
    }
}
