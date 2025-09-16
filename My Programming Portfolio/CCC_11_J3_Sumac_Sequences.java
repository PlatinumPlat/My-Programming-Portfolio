import java.util.*;

public class CCC_11_J3_Sumac_Sequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t1 = in.nextInt();
        int t2 = in.nextInt();

        int f = t1;
        int s = t2;
        int count = 2;
        for (int a=0; a<t1+5; a++) {
            if (f-s < 0) {
                System.out.println(count);
                break;
            } else {
                int p = s;
                s = f - s;
                f = p;
                count++;
            }
        } 
    }
}
