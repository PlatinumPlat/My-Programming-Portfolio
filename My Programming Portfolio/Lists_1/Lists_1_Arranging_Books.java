package Lists_1;
import java.util.Scanner;
import java.lang.Math;

public class Lists_1_Arranging_Books {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String seq = in.nextLine();
        int currLength = seq.length();
        int L = currLength - seq.replaceAll("L", "").length();
        int M = currLength - seq.replaceAll("M", "").length();
        int S = currLength - seq.replaceAll("S", "").length();

        int[] Ls = {0, 0, 0};
        int[] Ms = {0, 0, 0};
        int[] Ss = {0, 0, 0};

        for (int i= 0; i<seq.length(); i++) {
            if (i < L) {
                if (seq.charAt(i) == 'L') {
                    Ls[0] ++;
                } else if (seq.charAt(i) == 'M') {
                    Ls[1] ++;
                } else {
                    Ls[2] ++;
                }
            } else if (i < L+M) {
                if (seq.charAt(i) == 'L') {
                    Ms[0] ++;
                } else if (seq.charAt(i) == 'M') {
                    Ms[1] ++;
                } else {
                    Ms[2] ++;
                }
            } else {
                if (seq.charAt(i) == 'L') {
                    Ss[0] ++;
                } else if (seq.charAt(i) == 'M') {
                    Ss[1] ++;
                } else {
                    Ss[2] ++;
                }
            }
        }
        int s = 0;

        if (Ls[0] == L && Ms[1] == M && Ss[2] == S) {
            System.out.println(0);
            System.exit(0);
        }

        int LM = Math.min(Ls[1], Ms[0]);
        Ls[0] += LM;
        Ls[1] -= LM;
        Ms[0] -= LM;
        Ms[1] += LM;
        s += LM;

        int LS = Math.min(Ls[2], Ss[0]);
        Ls[0] += LS;
        Ls[2] -= LS;
        Ss[0] -= LS;
        Ss[2] += LS;
        s += LS;

        int MS = Math.min(Ms[2], Ss[1]);
        Ms[1] += MS;
        Ms[2] -= MS;
        Ss[1] -= MS;
        Ss[2] += MS;
        s += MS;

        s += 2*(L-Ls[0]);

        System.out.print(s);
    }
}
