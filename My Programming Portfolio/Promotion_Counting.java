import java.util.*;
import java.io.*;

public class Promotion_Counting {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("promote.in"));
        PrintWriter pw = new PrintWriter("promote.out");

        int r1b = in.nextInt();
        int r1a = in.nextInt();
        int r2b = in.nextInt();
        int r2a = in.nextInt();
        int r3b= in.nextInt();
        int r3a = in.nextInt();
        int r4b = in.nextInt();
        int r4a = in.nextInt();

        r1b+=(r1a+r2a+r3a+r4a)-(r1b+r2b+r3b+r4b);
        pw.println(r1b-r1a);
        r2b+=r1b-r1a;
        pw.println(r2b - r2a);
        r3b += r2b - r2a;
        pw.println(r3b - r3a);
        in.close();
        pw.close();
    }
}
