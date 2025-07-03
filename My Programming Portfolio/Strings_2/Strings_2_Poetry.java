package Strings_2;
import java.util.Scanner;

public class Strings_2_Poetry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String[] rhymes = new String[n];

        for (int i=0; i<n; i++) {
            String[] lastSyllable = new String[4];
            for (int a=0; a<4; a++) {
                String[] words = in.nextLine().split(" ");
                String last = words[words.length-1].toLowerCase();
                boolean vowel = false;
                for (int b=last.length()-1; b>=0; b--) {
                    if (String.valueOf(last.charAt(b)).matches("[aeiou]")) {
                        lastSyllable[a] = last.substring(b);
                        if (b==last.length()-1) {
                            lastSyllable[a] = String.valueOf(last.charAt(b));
                        }
                        vowel = true;
                        break;
                    }
                }
                if (!vowel) {
                    lastSyllable[a] = last;
                }
            }
            if (lastSyllable[0].equals(lastSyllable[1]) && lastSyllable[0].equals(lastSyllable[2]) && lastSyllable[0].equals(lastSyllable[3])) {
                rhymes[i]="perfect";
            } else if (lastSyllable[0].equals(lastSyllable[1]) && lastSyllable[2].equals(lastSyllable[3])) {
                rhymes[i] = "even";
            } else if (lastSyllable[0].equals(lastSyllable[2]) && lastSyllable[1].equals(lastSyllable[3])) {
                rhymes[i] = "cross";
            } else if (lastSyllable[0].equals(lastSyllable[3]) && lastSyllable[1].equals(lastSyllable[2])) {
                rhymes[i] = "shell";
            } else {
                rhymes[i] = "free";
            }
        }

        for (int a=0; a<n; a++) {
            System.out.println(rhymes[a]);
        }
    }
}
