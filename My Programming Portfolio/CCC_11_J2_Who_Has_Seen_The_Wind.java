import java.util.*;

public class CCC_11_J2_Who_Has_Seen_The_Wind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        for (int i=1; i<= m; i++) {
            if (-6*i*i*i*i + h*i*i*i + 2*i*i+i <=0) {
                System.out.println("The balloon first touches ground at hour:");
                System.out.println(i);
                return;
            }
        }

        System.out.println("The balloon does not touch ground in the given time.");
    }
}
