import java.util.*;

public class DMPG_19_S1_Candy_Shop_Tycoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int C = in.nextInt();

        for (int AC = 0; AC*a<=C && AC <= 100; AC++) {
            for (int BC = 0; BC*b<=C && BC <= 100; BC++) {
                for (int CC = 0; CC*c<=C && CC <= 100; CC++) {
                    if (AC*a+BC*b+CC*c == C) {
                        System.out.println("QUEST CLEARED");
                        return;
                    }
                }
            }
        }
        System.out.println("TRY AGAIN");
    }
}
