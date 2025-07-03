package Arrays;

import java.util.Scanner;

public class Arrays_EnglishOrFrench {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int s = 0;
        int t = 0;

        for (int i =0; i<n; i++) {
            String text = in.nextLine();
            for (int c=0; c<text.length(); c++) {
                if (text.charAt(c) == 's' || text.charAt(c) == 'S') {
                    s +=1;
                } else if (text.charAt(c) == 't' || text.charAt(c) == 'T') {
                    t += 1;
                }
            }
        }

        if (s>=t) {
            System.out.println("French");
        } else {
            System.out.println("English");
        }
    }
}
