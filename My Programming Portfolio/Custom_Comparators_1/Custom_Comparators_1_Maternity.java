package Custom_Comparators_1;
import java.util.*;

public class Custom_Comparators_1_Maternity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] par1 = in.next().toCharArray();
        char[] par2 = in.next().toCharArray();

        int N = in.nextInt();
        StringBuffer pos = new StringBuffer();

        if (par1[0] == 'A' && par1[1] == 'A') {
            pos.append('A');
        } else if (par2[0] == 'A' && par2[1] == 'A') {
            pos.append('A');
        } else if (par1[0] == 'a' && par1[1] == 'a' && par2[0] == 'a' && par2[1] == 'a') {
            pos.append('a');
        } else {
            pos.append('*');
        }

        if (par1[2] == 'B' && par1[3] == 'B') {
            pos.append('B');
        } else if (par2[2] == 'B' && par2[3] == 'B') {
            pos.append('B');
        } else if (par1[2] == 'b' && par1[3] == 'b' && par2[2] == 'b' && par2[3] == 'b') {
            pos.append('b');
        } else {
            pos.append('*');
        }

        if (par1[4] == 'C' && par1[5] == 'C') {
            pos.append('C');
        } else if (par2[4] == 'C' && par2[5] == 'C') {
            pos.append('C');
        } else if (par1[4] == 'c' && par1[5] == 'c' && par2[4] == 'c' && par2[5] == 'c') {
            pos.append('c');
        } else {
            pos.append('*');
        }

        if (par1[6] == 'D' && par1[7] == 'D') {
            pos.append('D');
        } else if (par2[6] == 'D' && par2[7] == 'D') {
            pos.append('D');
        } else if (par1[6] == 'd' && par1[7] == 'd' && par2[6] == 'd' && par2[7] == 'd') {
            pos.append('d');
        } else {
            pos.append('*');
        }

        if (par1[8] == 'E' && par1[9] == 'E') {
            pos.append('E');
        } else if (par2[8] == 'E' && par2[9] == 'E') {
            pos.append('E');
        } else if (par1[8] == 'e' && par1[9] == 'e' && par2[8] == 'e' && par2[9] == 'e') {
            pos.append('e');
        } else {
            pos.append('*');
        }

        String corr = String.valueOf(pos);
        for (int i=0; i<N; i++) {
            String baby = in.next();
            boolean bad = false;
            for (int z=0; z<5; z++) {
                if (corr.charAt(z) != '*') {
                    if (corr.charAt(z)!=baby.charAt(z)) {
                        bad = true;
                        break;
                    }
                }
            }

            if (bad) {
                System.out.println("Not their baby!");
            } else {
                System.out.println("Possible baby.");
            }
        }
    }
}
