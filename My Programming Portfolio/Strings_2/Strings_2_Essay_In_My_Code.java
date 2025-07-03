package Strings_2;
import java.util.Scanner;

public class Strings_2_Essay_In_My_Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] out = new String[5];

        for (int i=0; i<5; i++) {
            String line = in.nextLine();
            StringBuilder current = new StringBuilder();
            //if char is at the end
            for (int a=0; a<line.length(); a++) {
                if (line.charAt(a) == '\"'||line.charAt(a) == '\'') {
                    int next= line.substring(a+1).indexOf(line.charAt(a))+a+1;
                    current.append(" " + line.substring(a+1, next));
                    a=next;
                } else if (line.charAt(a) == '/') {
                    if (line.charAt(a+1)=='/') {
                        current.append(" " +line.substring(a+2));
                        break;
                    } else if (line.charAt(a+1)=='*') {
                        int next= line.substring(a+2).indexOf("*/")+a+2;
                        current.append(" " +line.substring(a+2, next));
                        a=next+1;
                    }
                }
            }

            out[i] = String.valueOf(current);
        }

        for (int b=0; b<5; b++) {
            System.out.println(out[b].substring(1));
        }
    }
}
