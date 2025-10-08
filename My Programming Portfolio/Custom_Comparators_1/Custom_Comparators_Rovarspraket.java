package Custom_Comparators_1;

import java.util.*;

public class Custom_Comparators_Rovarspraket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        String n = in.next();
        StringBuffer out = new StringBuffer(n);
        int curr = 0;

        for (int i = 0; i < n.length(); i++) {
            if (!vowels.contains(n.charAt(i))) {
                int indx = n.charAt(i) - 97;
                curr++;
                if (indx == 1 || indx == 2) {
                    out.insert(curr, 'a');
                } else if (indx == 3 || indx == 5 || indx == 6) {
                    out.insert(curr, 'e');
                } else if (indx >= 7 && indx <= 11) {
                    out.insert(curr, 'i');
                } else if (indx >= 12 && indx <= 17) {
                    out.insert(curr, 'o');
                } else {
                    out.insert(curr, 'u');
                }
                curr++;
                if (indx == 25) {
                    out.insert(curr, 'z');
                } else {
                    char let1 = (char) (indx + 98);
                    char let2 = (char) (indx + 99);

                    if (!vowels.contains(let1)) {
                        out.insert(curr, let1);
                    } else if (!vowels.contains(let2)) {
                        out.insert(curr, let2);
                    }
                }
            }
            curr++;
        }

        System.out.println(String.valueOf(out));
    }
}
