package Strings_2;
import java.util.Scanner;

public class Strings_2_Home_Row {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();

        if (b.length() == 0) {
            System.out.print(a.length());
            System.exit(0);
        }

        if (a.length()==b.length()) {
            for (int i=0; i<a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    System.out.println(2*(a.length()-i));
                    System.exit(0);
                }
            }
            System.out.println(0);
        } else if (a.length()>b.length()) {
            for (int i=0; i<b.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    System.out.println(a.length()-i+b.length()-i);
                    System.exit(0);
                }
            }
            System.out.println(a.length()-b.length());
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    System.out.println(b.length() - i + a.length() - i);
                    System.exit(0);
                }
            }
            System.out.println(b.length()-a.length());
        }
    }
}
