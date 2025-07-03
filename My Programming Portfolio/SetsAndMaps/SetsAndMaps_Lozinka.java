import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SetsAndMaps_Lozinka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        Set<String> pass = new HashSet<>(N);
        String out = "";
        for (int i=0; i<N; i++) {
            StringBuilder next = new StringBuilder(in.next());
            String reverse = next.reverse().toString();
            if (pass.contains(next.reverse().toString())) {
                String o = reverse.length() + " " + reverse.charAt((reverse.length()+1)/2-1);
                out = o;
                break;
            } else if (reverse.equals(next.toString())) {
                String o = reverse.length() + " " + reverse.charAt((reverse.length()+1)/2-1);
                out = o;
                break;
            } else {
                pass.add(next.reverse().toString());
            }
        }
        System.out.println(out);
    }
}
