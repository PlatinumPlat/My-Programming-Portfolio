import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Stack_2_Word_Processor {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("word.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("word.out");

        int N = in.nextInt();
        int K = in.nextInt();
        in.nextLine();
        String[] essay = in.nextLine().split(" ");
        StringBuilder current = new StringBuilder();
        int length = 0;
        in.close();

        for (int i=0; i<N; i++) {
            int l = essay[i].length();
            if (length + l <= K) {
                String next = " " + essay[i];
                current.append(next);
                length += essay[i].length();
            } else {
                out.println(String.valueOf(current).substring(1));
                current.delete(0, current.length());
                length = 0;
                i--;
            }
        }

        if (current.length()>0) {
            out.println(String.valueOf(current).substring(1));
        }

        out.close();
    }
}
