package Strings_2;
import java.util.Scanner;

public class Strings_2_Simple_Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String keyword = in.nextLine();
        String before = in.nextLine().replaceAll("[^A-Z]", "");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;

        char l = keyword.charAt(0);
        char s = (char) ((before.charAt(0)+l-129)%26+64);
        if (s == '@') {
            s = 'Z';
        }
        System.out.print(s);

        for (int i=1; i<before.length(); i++) {
            int indx = i%(keyword.length());
            char letter = keyword.charAt(indx);
            char shift = (char) ((before.charAt(i)+letter-129)%26+64);
            if (shift == '@') {
                shift = 'Z';
            }
            System.out.print(shift);
        }
    }
}
