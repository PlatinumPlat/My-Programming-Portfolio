import java.io.*;
import java.util.*;
import java.lang.Math;

public class SetsAndMaps_SocialDistancing2 {
    static int[] stalls = new int[1000001];

    static int smallestGap() {
        int min = 2000000;
        int count = 0;
        boolean first = true;
        for (int i = 0; i < 1000001; i++) {
            if (stalls[i] != 0) {
                if (!first && stalls[i] != stalls[i-count-1]) {
                    if (count != 0) {
                        min = Math.min(min, count);
                        count = 0;
                    }
                } else {
                    count = 0;
                }
                first = false;
            } else {
                if (!first) {
                    count++;
                }
            }
        }

        return min;
    }

    
    static int numOfGroups(int g) {
        int total = 1;
        int count = 0;
        boolean first = true;
        for (int i = 0; i < 1000001; i++) {
            if (stalls[i] == -1) {
                if (!first && count >= g) {
                    total += 1;       
                }
                first = false;
                count = 0;
            } else {
                if (!first) {
                    count++;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        File inputFile = new File("socdist2.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("socdist2.out");

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int p = in.nextInt();
            int stat = in.nextInt();
            if (stat == 1) {
                stalls[p] = -1;
            }
            if (stat == 0) {
                stalls[p] = 1;
            }
        }

        int r = smallestGap();
        out.print(numOfGroups(r));
        out.println();
        in.close();
        out.close();
    }
}

