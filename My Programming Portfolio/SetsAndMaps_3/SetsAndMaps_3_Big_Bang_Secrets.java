package SetsAndMaps_3;
import java.util.Scanner;

public class SetsAndMaps_3_Big_Bang_Secrets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int K = in.nextInt();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String msg = in.next();
        StringBuffer output = new StringBuffer();

        for (int i=1; i<=msg.length(); i++) {
            int shift = 3*i+K;

            int indx = alphabet.indexOf(msg.charAt(i-1));
            int decoded = (indx-shift);

            if (decoded<0) {
                decoded += 26;
            }
            output.append(alphabet.charAt(decoded));
            
        }

        System.out.println(String.valueOf(output));
    }
}
