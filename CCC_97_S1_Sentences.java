import java.util.*;

public class CCC_97_S1_Sentences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int v = in.nextInt();
            int o = in.nextInt();
            String[] subjects = new String[s];
            String[] verbs = new String[v];
            String[] objects = new String[o];
            in.nextLine();
            for (int a = 0; a < s; a++) {
                subjects[a] = in.nextLine();
            }

            for (int b = 0; b < v; b++) {
                verbs[b] = in.nextLine();
            }

            for (int c = 0; c < o; c++) {
                objects[c] = in.nextLine();
            }

            for (int d = 0; d < s; d++) {
                for (int f = 0; f < v; f++) {
                    for (int e = 0; e < o; e++) {
                        System.out.println(subjects[d] + " " + verbs[f] + " " + objects[e] + ".");
                    }
                }
            }
        }
    }
}