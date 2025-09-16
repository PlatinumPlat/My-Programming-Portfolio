import java.util.*;

public class J_2_Biking_and_Hiking {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Speed = in.nextInt();
        String S = in.next();
        int count = 0;
        for (int i=0; i<N; i++) {
            if (S.charAt(i)=='D') {
                Speed++;
            } else if (S.charAt(i)=='U' && Speed != 0) {
                Speed--;
            }

            if (Speed == 0) {
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}