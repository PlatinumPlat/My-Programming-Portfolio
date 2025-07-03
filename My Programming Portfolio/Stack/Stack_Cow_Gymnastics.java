package Stack;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Stack_Cow_Gymnastics {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("gymnastics.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("gymnastics.out");

        int K = in.nextInt();
        int N = in.nextInt();
        int[][] cows = new int[K][N];
        for (int i=0; i<K; i++) {
            for (int a=0; a<N; a++) {
                cows[i][a] = in.nextInt();
            }
        }
        in.close();

        int count = 0;
        for (int b=1; b<N; b++) {
            for (int c=b+1; c<N+1; c++) {
                boolean yes = true;
                int larger;
                int pb =0;
                int pc = 0;

                for (int f=0; f<N; f++) {
                    if (cows[0][f] == b) {
                        pb = f;
                    } else if (cows[0][f] == c) {
                        pc = f;
                    }
                }

                if (pb > pc) {
                    larger = b;
                } else {
                    larger = c;
                }

                for (int d=1; d<K; d++) {
                    int posb =0;
                    int posc = 0;

                    for (int e=0; e<N; e++) {
                        if (cows[d][e] == b) {
                            posb = e;
                        } else if (cows[d][e] == c) {
                            posc = e;
                        }
                    }

                    if (posb > posc) {
                        if (larger != b) {
                            yes = false;
                            break;
                        }
                    } else {
                        if (larger != c) {
                            yes = false;
                            break;
                        }
                    }
                }

                if (yes) {
                    count++;
                }
            }
        }

        out.println(count);
        out.close();
    }
}
