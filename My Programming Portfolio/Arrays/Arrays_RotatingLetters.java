package Arrays;

import java.util.Scanner;

public class Arrays_RotatingLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        for (int i = 0; i< text.length(); i++) {
            if (String.valueOf(text.charAt(i)).matches("[IOSHZXN]")) {
                continue;
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
