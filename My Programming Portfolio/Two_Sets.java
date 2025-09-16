import java.util.*;
import java.io.*;

public class Two_Sets {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        if (N % 4 == 0) {
            pw.println("YES");
            pw.println(N / 2);
            pw.print("1");
            for (int a = 4; a <= N; a += 4) {
                if (a <= N) {
                    pw.print(" " + a);
                } else {
                    break;
                }

                if (a + 1 <= N) {
                    pw.print(" " + (a + 1));
                } else {
                    break;
                }
            }
            pw.println();
            pw.println(N / 2);
            pw.print(2 + " " + 3);

            for (int a = 6; a <= N; a += 4) {
                if (a <= N) {
                    pw.print(" " + a);
                } else {
                    break;
                }

                if (a + 1 <= N) {
                    pw.print(" " + (a + 1));
                } else {
                    break;
                }
            }
            pw.println();
        } else if (N % 4 == 3) {
            pw.println("YES");
            pw.println((N + 1) / 2);
            pw.print("1 2");
            if (N >= 4) {
                pw.print(" 4");
            }
            for (int a = 7; a <= N; a += 4) {
                if (a <= N) {
                    pw.print(" " + a);
                } else {
                    break;
                }

                if (a + 1 <= N) {
                    pw.print(" " + (a + 1));
                } else {
                    break;
                }
            }
            pw.println();
            pw.println((N - 1) / 2);
            pw.print("3");
            for (int a = 5; a <= N; a += 4) {
                if (a <= N) {
                    pw.print(" " + a);
                } else {
                    break;
                }

                if (a + 1 <= N) {
                    pw.print(" " + (a + 1));
                } else {
                    break;
                }
            }
            pw.println();
        } else {
            pw.println("NO");
        }

        pw.close();

    }
}