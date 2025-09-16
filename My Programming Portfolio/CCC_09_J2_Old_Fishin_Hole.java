import java.util.*;

public class CCC_09_J2_Old_Fishin_Hole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int trout = in.nextInt();
        int pike = in.nextInt();
        int pikerel = in.nextInt();
        int total = in.nextInt();
        int d=0;

        for (int a=0; a*trout<=total; a++) {
            for (int b=0; b*pike<=total; b++) {
                for (int c=0; c*pikerel<=total; c++) {
                    if ((!(a==0 && b==0 && c==0)) && (a*trout+b*pike+c*pikerel <= total)) {
                        System.out.println(a+" Brown Trout, " + b + " Northern Pike, " + c + " Yellow Pickerel");
                        d++;
                    }
                }
            }
        }
        System.out.println("Number of ways to catch fish: " + d);
    }
}
