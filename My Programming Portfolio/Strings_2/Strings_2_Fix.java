package Strings_2;
import java.util.Scanner;

public class Strings_2_Fix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String[] fixes = new String[n];

        for (int i=0; i<n; i++) {
            String a = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();

            if (a.startsWith(b)||a.startsWith(c)||a.endsWith(b)||a.endsWith(c)||b.startsWith(a)||b.startsWith(c)||b.endsWith(a)||b.endsWith(c)||c.startsWith(a)||c.startsWith(b)||c.endsWith(a)||c.endsWith(b)) {
                fixes[i]="No";
            } else {
                fixes[i] = "Yes";
            }
        }

        for (int a=0; a<n; a++) {
            System.out.println(fixes[a]);
        }
    }
}
