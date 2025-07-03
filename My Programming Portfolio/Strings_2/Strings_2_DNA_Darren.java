package Strings_2;
import java.util.Scanner;

public class Strings_2_DNA_Darren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String dna = in.nextLine();

        System.out.print(dna.charAt(0));
        for (int i=1; i<dna.length(); i++) {
            if (dna.charAt(i-1) == 'A' && dna.charAt(i) == 'A') {
                System.out.print(" " + "A");
            } else if (String.valueOf(dna.charAt(i-1)).matches("[CTG]") && String.valueOf(dna.charAt(i)).matches("[CTG]")) {
                System.out.print(" " + dna.charAt(i));
            } else {
                System.out.print(dna.charAt(i));
            }
        }
    }
}
