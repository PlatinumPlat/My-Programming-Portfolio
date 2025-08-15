import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

public class SetsAndMaps_2_Scrambling_Swaps {
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int Q = in.nextInt();
        ArrayList<String> out = new ArrayList<>();
        int[] a = new int[N];
        int[] b = new int[N];

        for (int s =1; s<=N; s++) {
            a[s-1] = s;
        }
        for (int s = 1; s <= N; s++) {
            b[s - 1] = s;
        }
        for (int i=0; i<Q; i++) {
            String c = in.next();
            if (c.equals("B")) {
                int X = in.nextInt();
                int Y = in.nextInt();
                int n1 = a[X-1];

                a[X-1] = a[Y-1];
                a[Y-1] = n1;

                b[a[X-1]-1] = X;
                b[a[Y-1]-1] = Y;

            } else if (c.equals("E")) {
                int X = in.nextInt();
                int Y = in.nextInt();

                int indx1 = b[X-1];
                int indx2 = b[Y-1];

                a[indx1-1] = Y;
                a[indx2 -1] = X;
                b[X-1] = indx2;
                b[Y-1] = indx1;
            } else {
                int[] nums = new int[N];
                for (int g=0; g<N; g++) {
                    nums[g] = in.nextInt();
                }
                StringBuffer comp = new StringBuffer();
                comp.append(nums[a[0]-1]);
                for (int f=1; f<N; f++) {
                    comp.append(" ");
                    comp.append(nums[a[f]-1]);
                }
                out.add(String.valueOf(comp));
            }
        }

        for (int z=0; z<out.size(); z++) {
            System.out.println(out.get(z));
        }
    }
}