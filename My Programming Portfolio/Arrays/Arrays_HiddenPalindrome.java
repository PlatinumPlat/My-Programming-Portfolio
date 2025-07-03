package Arrays;

import java.util.Scanner;

public class Arrays_HiddenPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        int max = 1;

        for (int i=0; i<text.length(); i++) {
            for (int a=i+1; a<text.length()+1; a++) {
                String p = text.substring(i, a);
                String o = String.valueOf(new StringBuilder(p).reverse());
                if (p.equals(o)) {
                    if (p.length()>max) {
                        max = p.length();
                    }
                }
            }
        }

        System.out.println(max);
    }
}
