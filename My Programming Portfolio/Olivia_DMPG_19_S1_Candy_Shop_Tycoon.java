import java.util.Scanner;

public class Olivia_DMPG_19_S1_Candy_Shop_Tycoon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int C = in.nextInt();
        in.close();
        int tot = C;
        int A = tot / a;
        for (int i = 0; i <= Math.min(A,100); i++) {
            tot = C - i * a;
            int B = tot / b;
            for (int j = 0; j <= Math.min(B, 100); j++) {
                tot = C - i * a - j * b;
                if (tot % c == 0 && tot/c <= 100) {
                    System.out.println("QUEST CLEARED");
                    System.exit(0);
                }
            }
        }
        System.out.println("TRY AGAIN");
    }
}