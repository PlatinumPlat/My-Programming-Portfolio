import java.util.Scanner;

public class SetsAndMaps_Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int prev = 0;
        int wildCard = 0;
        boolean prevWild = false;
        for (int i=0; i<N; i++) {
            int next = in.nextInt();
            if (next != 0) {
                if (next < prev) {
                    System.out.println("NO");
                    return;
                } else {
                    if (wildCard == 0 && prevWild) {
                        wildCard = next;
                    }
                    prevWild = false;
                    prev = next;
                }
            } else {
                if (wildCard != 0 && wildCard<prev) {
                    System.out.println("NO");
                    return;
                } else {
                    prevWild = true;
                }
            }
        }

        System.out.println("YES");
    }
}
