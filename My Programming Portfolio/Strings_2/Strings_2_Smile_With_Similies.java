package Strings_2;
import java.util.Scanner;

public class Strings_2_Smile_With_Similies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int adj = Integer.parseInt(in.nextLine());
        int ns = Integer.parseInt(in.nextLine());
        String[] adjectives = new String[adj];
        String[] nouns = new String[ns];

        for (int i=0; i<adj; i++) {
            adjectives[i] = in.nextLine();
        }

        for (int j=0; j<ns; j++) {
            nouns[j] = in.nextLine();
        }

        for (int a=0; a<adj; a++) {
            for (int b=0; b<ns; b++) {
                System.out.println(adjectives[a] + " as " + nouns[b]);
            }
        }
    }
}
