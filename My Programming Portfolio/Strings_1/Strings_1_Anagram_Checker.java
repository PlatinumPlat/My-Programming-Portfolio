package Strings_1;

import java.util.Scanner;

public class Strings_1_Anagram_Checker {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         String a = in.nextLine();
         String b = in.nextLine();

         StringBuffer c = new StringBuffer(a);
         StringBuffer d = new StringBuffer(b);
         boolean e = true;

         for (int i = 0; i< c.length(); i++) {
             String letter = c.substring(i, i+1);
             if (letter.equals(" ")) {
                 continue;
             }
             int index = d.indexOf(letter);
             if (index != -1) {
                 d.deleteCharAt(index);
             } else {
                 e = false;
                 break;
             }
         }
        if (e) {
            if (d.toString().trim().length() > 0) {
                System.out.println("Is not an anagram.");
            } else {
                System.out.println("Is an anagram.");
            }
        } else {
            System.out.println("Is not an anagram.");
        }
    }
}
