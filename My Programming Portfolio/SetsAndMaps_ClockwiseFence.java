import java.io.*;
import java.util.Scanner;

public class SetsAndMaps_ClockwiseFence {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String c = in.next();
            int rTurns = 0;
            int lTurns = 0;
            for (int a = 1; a < c.length()+1; a++) {
                char p = c.charAt(a - 1);
                char n = c.charAt(a%c.length());

                if (p == 'N') {
                    if (n == 'E') {
                        rTurns++;
                    } else if (n == 'W') {
                        lTurns++;
                    }
                } else if (p == 'S') {
                    if (n == 'E') {
                        lTurns++;
                    } else if (n == 'W') {
                        rTurns++;
                    }
                } else if (p == 'E') {
                    if (n == 'N') {
                        lTurns++;
                    } else if (n == 'S') {
                        rTurns++;
                    }
                } else {
                    if (n == 'N') {
                        rTurns++;
                    } else if (n == 'S') {
                        lTurns++;
                    }
                }
            }

            if (rTurns > lTurns) {
                System.out.println("CW");
            } else if (lTurns > rTurns) {
                System.out.println("CCW");
            }
        }
    }
}