import java.util.*;
import java.io.*;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());

        if (N==1) {
            pw.println(1);
        } else if (N==2) {
            pw.println("NO SOLUTION");
        } else if (N==3) {
            pw.println("NO SOLUTION");
        } else {
            pw.print("2");
            for (int i=4; i<=N; i+=2) {
                pw.print(" " + i);
            }
            
            for (int i=1; i<=N; i+=2) {
                pw.print(" " + i);
            }

            pw.println();
        }
        pw.close();
    }
}