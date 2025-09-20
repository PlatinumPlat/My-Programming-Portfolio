import java.util.*;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (a + b + c >= 2) {
                t++;
            }
        }

        System.out.println(t);
    }
}
