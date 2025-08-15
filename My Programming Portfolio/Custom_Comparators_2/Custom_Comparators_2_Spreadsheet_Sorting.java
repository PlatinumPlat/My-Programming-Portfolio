package Custom_Comparators_2;

import java.util.*;

public class Custom_Comparators_2_Spreadsheet_Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        triplet[] sheet = new triplet[N];
        Map<triplet, Integer> indexes = new HashMap<>();

        for (int a = 0; a < N; a++) {
            sheet[a].a = in.nextInt();
            sheet[a].b = in.nextInt();
            sheet[a].c = in.nextInt();
        }

        // for (int i = 0; i < M; i++) {
        //     Arrays.sort(sheet, new Comparator<triplet>() {
        //         // public int compare(triplet o1, triplet o2) {
                    
        //         // }
        //     });
        // }

    }

    public static class triplet {
        int a;
        int b;
        int c;

        triplet(int d, int e, int f) {
            a = d;
            b = e;
            c = f;
        }
    }
}
