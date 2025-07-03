package Lists_2;
import java.util.Scanner;

public class Lists_2_Sematori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int L = in.nextInt();

        int time = 0;
        int dis = 0;
        for (int i=0; i<N; i++) {
            int D = in.nextInt();
            int R = in.nextInt();
            int G = in.nextInt();

            time += D-dis;
            dis = D;
            int mod = time % (R+G);
            if (mod <= R) {
                time += R-mod;
            }
        }

        if (dis != L) {
            time += L-dis;
        }

        System.out.println(time);
    }
}
