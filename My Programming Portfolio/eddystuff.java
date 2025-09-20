import java.util.*;

public class eddystuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int i=1;
        long prev1=1;
        long prev2=0;
        while (i<=x) {
            long y = prev1+prev2;
            prev2=prev1;
            prev1=y;
            i++;
        }

        System.out.println(prev2);
    }
}