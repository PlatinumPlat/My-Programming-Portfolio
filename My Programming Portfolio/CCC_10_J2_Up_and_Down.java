import java.util.*;

public class CCC_10_J2_Up_and_Down {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int s = in.nextInt();

        int total1 = (s/(a+b))*(a-b);
        int left = s%(a+b);
        if (left>=0 && left<= a) {
            total1 += left;
        } else {
            total1 += a-(left-a);
        }

        int total2 = (s / (c+d)) * (c-d);
        int left2 = s % (c+d);
        if (left2 >= 0 && left2 <= c) {
            total2 += left2;
        } else {
            total2 += a - (left2 - a);
        }
        if (total1>total2) {
            System.out.println("Nikky");
        } else if (total1<total2) {
            System.out.println("Byron");
        } else {
            System.out.println("Tied");
        }
    }
}
