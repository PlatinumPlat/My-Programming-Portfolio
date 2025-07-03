package Lists_2;
import java.util.Scanner;

public class Lists_2_Magic_Trick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] out = new String[5];

        for (int i=0; i<5; i++) {
            int N = in.nextInt();
            int[] cards = new int[N];

            for (int a=0; a<N; a++) {
                cards[a] = in.nextInt();
            }

            int[] order = new int[N];
            int count = N;
            for (int b=0; b<N; b++) {
                boolean done = false;
                for (int c=0; c<N; c++) {
                    if (cards[c] == 0) {
                        cards[c] = -1;
                        order[c] = count;
                        count--;
                        for (int d=0; d<c; d++) {
                            if (cards[d] != -1) {
                                cards[d] --;
                            }
                        }
                        done = true;
                        break;
                    }
                }
                if (!done) {
                    out[i] = "IMPOSSIBLE";
                    break;
                }
            }

            if (out[i] == null) {
                StringBuilder o = new StringBuilder();
                o.append(order[0]);
                for (int e=1; e<N; e++) {
                    o.append(" ");
                    o.append(order[e]);
                }
                out[i] = String.valueOf(o);
            }
        }

        for (int z=0; z<5; z++) {
            System.out.println(out[z]);
        }
    }
}
