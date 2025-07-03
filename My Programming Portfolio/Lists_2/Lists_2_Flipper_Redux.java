package Lists_2;
import java.util.Scanner;
import java.util.ArrayList;

public class Lists_2_Flipper_Redux {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] flipp = new int[N][N];
        ArrayList<String> instructions = new ArrayList<>();

        for (int a=0; a<N; a++) {
            for (int b=0; b<N; b++) {
                flipp[a][b] = in.nextInt();
            }
        }

        for (int c=0; c<N; c++) {
            if (flipp[c][0] == 1) {
                String instruct = "R" + " " + String.valueOf(c+1);
                instructions.add(instruct);
                for (int d=0; d<N; d++) {
                    if (flipp[c][d] == 1) {
                        flipp[c][d] = 0;
                    } else {
                        flipp[c][d] = 1;
                    }
                }
            }
        }

        for (int e=0; e<N; e++) {
            if (flipp[0][e] == 1) {
                String instruct = "C" + " " + String.valueOf(e+1);
                instructions.add(instruct);
                for (int f=0; f<N; f++) {
                    if (flipp[f][e] == 1) {
                        flipp[f][e] = 0;
                    } else {
                        flipp[f][e] = 1;
                    }
                }
            }
        }

        boolean good = true;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (flipp[i][j] == 1) {
                    good = false;
                    break;
                }
            }
            if (!good) {
                break;
            }
        }

        if (good) {
            System.out.println(instructions.size());
            for (int z=0; z<instructions.size(); z++) {
                System.out.println(instructions.get(z));
            }
        } else {
            System.out.println(-1);
        }

    }
}
