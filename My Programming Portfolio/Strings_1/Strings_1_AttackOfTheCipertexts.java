package Strings_1;

import java.util.Scanner;

public class Strings_1_AttackOfTheCipertexts {
    public static void main(String[] args) {

        StringBuffer alphabet = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ ");
        StringBuffer alphabet2 = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ ");

        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();

        StringBuffer output = new StringBuffer();

        for (int i =0; i < c.length(); i++) {
            int index = b.indexOf(c.substring(i, i+1));
            if (index != -1) {
                output.append(a.charAt(index));
            } else {
                output.append(".");
            }
        }

        for (int j =0; j < b.length(); j++) {
            String aLetter = String.valueOf(a.charAt(j));
            String bLetter = String.valueOf(b.charAt(j));

            int alphaindex = alphabet.indexOf(aLetter);
            if (alphaindex != -1) {
                alphabet.deleteCharAt(alphaindex);
            }

            int alphaindex2 = alphabet2.indexOf(bLetter);
            if (alphaindex2 != -1) {
                alphabet2.deleteCharAt(alphaindex2);
            }
        }

        if (alphabet.length() == 1) {
            String let2 = alphabet.substring(0);
            String let = alphabet2.substring(0);

            for (int j = 0; j < c.length(); j++) {
                if ((String.valueOf(c.charAt(j)).equals(let))) {
                    output.replace(j, j+1, let2);
                }
            }
        }

        System.out.println(output);
    }
}
