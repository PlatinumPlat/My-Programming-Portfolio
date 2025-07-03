package Arrays;

import java.util.Scanner;

public class Arrays_SnowCalls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String[] phoneNums = new String[n];

        for (int i=0; i<n; i++) {
            String pn = in.nextLine();
            StringBuffer num = new StringBuffer();
            for (int letter=0; letter<pn.length(); letter++) {
                if (num.length() != 10) {
                    if (String.valueOf(pn.charAt(letter)).matches("[0123456789]")) {
                        num.append(String.valueOf(pn.charAt(letter)));
                    } else if (String.valueOf(pn.charAt(letter)).matches("[ABC]")) {
                        num.append("2");
                    } else if (String.valueOf(pn.charAt(letter)).matches("[DEF]")) {
                        num.append("3");
                    } else if (String.valueOf(pn.charAt(letter)).matches("[GHI]")) {
                        num.append("4");
                    } else if (String.valueOf(pn.charAt(letter)).matches("[JKL]")) {
                        num.append("5");
                    } else if (String.valueOf(pn.charAt(letter)).matches("[MNO]")) {
                        num.append("6");
                    } else if (String.valueOf(pn.charAt(letter)).matches("[PQRS]")) {
                        num.append("7");
                    } else if (String.valueOf(pn.charAt(letter)).matches("[TUV]")) {
                        num.append("8");
                    } else if (String.valueOf(pn.charAt(letter)).matches("[WXYZ]")) {
                        num.append("9");
                    }
                } else {
                    break;
                }
            }
            phoneNums[i] = String.valueOf(num);
        }

        for (int j=0; j<n; j++) {
            String phone = phoneNums[j];
            System.out.println(phone.substring(0, 3) + "-" + phone.substring(3, 6) + "-" + phone.substring(6));
        }
    }
}
