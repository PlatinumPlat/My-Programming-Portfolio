import java.util.HashSet;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Stack_Where_Am_I {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("whereami.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("whereami.out");

        int N = Integer.parseInt(in.nextLine());
        String boxes = in.nextLine();
        in.close();

        String smallest = "";

        for (int i=1; i<N; i++) {
            HashSet<String> s = new HashSet<>();
            boolean fault = false;
            for (int a=0; a<N-i+1; a++) {
                int l = s.size();
                s.add(boxes.substring(a, a+i));
                if (s.size() == l) {
                    fault = true;
                    break;
                }
            }
            if (!fault) {
                smallest = String.valueOf(i);
                break;
            }
        }

        out.println(smallest);
        out.close();
    }
}
