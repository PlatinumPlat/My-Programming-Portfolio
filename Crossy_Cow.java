import java.util.*;
import java.io.*;

public class Crossy_Cow {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("circlecross.in"));
        PrintWriter out = new PrintWriter("circlecross.out");

        String s = in.next();
        int[] start = new int[26];
        Arrays.fill(start, -1);
        int[] end = new int[26];
        Arrays.fill(end, -1);
        for (int i = 0; i < 52; i++) {
            char c = s.charAt(i);
            if (start[c - 'A'] == -1) {
                start[c - 'A'] = i;
            } else {
                end[c - 'A'] = i;
            }
        }
        int total = 0;
        for (int a = 0; a < 26; a++) {
            for (int b = a + 1; b < 26; b++) {
                if ((start[a] < start[b] && end[a] > start[b] && end[a] < end[b]) || (start[b] < start[a] && end[b] > start[a] && end[b] < end[a])) {
                    total += 1;
                }
            }
        }

        out.println(total);

        out.close();
        in.close();
    }
}