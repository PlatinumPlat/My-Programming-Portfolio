import java.util.Scanner;

public class SetsAndMaps_Conspicuous_Cryptic_Checklist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        String[] items = new String[N];
        for (int a=0; a<N; a++) {
            items[a] = in.next();
        }
        int count = 0;
        for (int b=0; b<M; b++) {
            int numOfItems = in.nextInt();
            boolean good = true;
            for (int c=0; c<numOfItems; c++) {
                if (good) {
                    String it = in.next();
                    boolean contains = false;
                    for (int d = 0; d < N; d++) {
                        if (items[d].equals(it)) {
                            contains = true;
                            break;
                        }
                    }


                    if (!contains) {
                        good = false;
                    }
                } else {
                    String it = in.next();
                }
            }

            if (good) {
                count++;
            }
        }
        System.out.println(count);
    }
}
