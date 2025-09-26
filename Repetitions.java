import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String dna = in.next();
        int longest = 0;
        int curr = 1;
        for (int i=1; i<dna.length(); i++) {
            if (dna.charAt(i)==dna.charAt(i-1)) {
                curr++;
            } else {
                longest = Math.max(longest, curr);
                curr = 1;
            }
        }

        longest = Math.max(longest, curr);
        System.out.println(longest);
    }
}
