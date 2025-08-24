package Binary_Search_3;
import java.util.*;
public class Cyclic_Shifts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String T = in.next();
        String S = in.next();

        boolean found = false;
        for (int a=0; a<= T.length()-S.length(); a++) {
            String M = T.substring(a, a+S.length());
            for (int b=0; b<S.length(); b++) {
                String shift = S.substring(b, S.length()) + S.substring(0, b);
                if (M.equals(shift)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}
