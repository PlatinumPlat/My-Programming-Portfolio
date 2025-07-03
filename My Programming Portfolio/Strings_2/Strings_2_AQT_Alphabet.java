package Strings_2;
import java.util.Scanner;
public class Strings_2_AQT_Alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String letters = in.nextLine();
        StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

        for (int i=0; i<5; i++) {
            int indx = alphabet.indexOf(String.valueOf(letters.charAt(i)));
            if (indx != -1) {
                alphabet.deleteCharAt(indx);
            }
        }

        System.out.println(alphabet.charAt(0));
    }
}
