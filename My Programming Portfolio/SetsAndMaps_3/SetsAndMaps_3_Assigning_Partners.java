package SetsAndMaps_3;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SetsAndMaps_3_Assigning_Partners {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String[] row1 = new String[N];
        String[] row2 = new String[N];

        for (int a = 0; a < N; a++) {
            row1[a] = in.next();
        }

        for (int b = 0; b < N; b++) {
            row2[b] = in.next();
        }

        Map<String, String> c = new HashMap<>();
        boolean bad = false;
        for (int i = 0; i < N; i++) {
            String name1 = row1[i];
            String name2 = row2[i];

            if (!name1.equals(name2)) {
                if (c.get(name1) == null) {
                    c.put(name2, name1);
                } else {
                    if (!c.get(name1).equals(name2)) {
                        bad = true;
                        break;
                    }
                }
            } else {
                bad=true;
                break;
            }
        }

        if (bad) {
            System.out.println("bad");
        } else {
            System.out.println("good");
        }
    }
}