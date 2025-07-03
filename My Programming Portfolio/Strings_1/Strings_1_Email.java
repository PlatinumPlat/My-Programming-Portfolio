package Strings_1;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;



public class Strings_1_Email {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] len = new int[10];

        for (int i=0; i<10; i++) {
            int n = Integer.parseInt(in.nextLine());
            Set<String> emails = new HashSet<>();

            for (int j=0; j<n; j++) {
                String email = in.nextLine().toLowerCase();
                int at = email.indexOf("@");
                boolean bool = false;

                String e = email.substring(0, at).replaceAll("[.]", "");
                String f = e+email.substring(at);
                StringBuffer email2 = new StringBuffer(f);

                int plus = email2.indexOf("+");

                if (plus != -1) {
                    email2.delete(plus, email2.indexOf("@"));
                }

                emails.add(String.valueOf(email2));
            }

            len[i]= emails.size();
        }

        for (int a=0; a<10; a++) {
            System.out.println(len[a]);
        }
    }
}