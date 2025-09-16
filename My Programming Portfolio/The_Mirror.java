import java.util.*;
import java.util.Scanner;

public class The_Mirror {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i=0; i<N; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            int total = 0;
            for (int a=s; a<e; a++) {
                if (a%2==1 && a!=1) {
                    boolean found = false;
                    for (int b=3; b*b<=a; b++) {
                        if (a%b==0) {
                            found=true;
                            break;
                        }
                    }
                    if (!found) {
                        total++;
                    }
                } else if (a==2) {
                    total++;
                }
            }
            System.out.println(total);
        }
    }
}
