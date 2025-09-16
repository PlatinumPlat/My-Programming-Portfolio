package Data_Structures_1;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fujo_Neko {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer aT = new StringTokenizer(in.readLine());
        int R = Integer.parseInt(aT.nextToken());
        int C = Integer.parseInt(aT.nextToken());

        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        for (int r=0; r<R; r++) {
            StringTokenizer bT = new StringTokenizer(in.readLine());
            String input = bT.nextToken();
            for (int c=0; c<C; c++) {
                if (input.charAt(c) == 'X') {
                    rows.add(r);
                    columns.add(c);
                }
            }
        }

        StringTokenizer cT = new StringTokenizer(in.readLine());
        int D = Integer.parseInt(cT.nextToken());
        for (int d=0; d<D; d++) {
            StringTokenizer dT = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(dT.nextToken());
            int y = Integer.parseInt(dT.nextToken());

            if (columns.contains(x-1) || rows.contains(y-1)) {
                System.out.println('Y');
            } else {
                System.out.println('N');
            }
        }
    }
}
