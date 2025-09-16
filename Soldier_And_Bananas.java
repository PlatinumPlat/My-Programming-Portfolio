import java.util.*;

public class Soldier_And_Bananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long k = in.nextLong();
        long n = in.nextLong();
        long w = in.nextLong();

        long a = ((w+1)*(w)*(k))/2;

        System.out.println(Math.max(0, a-n));
    }
}
