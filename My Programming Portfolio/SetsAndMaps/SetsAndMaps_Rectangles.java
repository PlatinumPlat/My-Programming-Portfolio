import java.util.Set;

import java.lang.Math;
import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class SetsAndMaps_Rectangles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<Long> coords = new TreeSet<>();

        for(int a=0; a<N; a++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long xtry = Integer.parseInt(st.nextToken());
            long x = xtry * 10000000;
            long ytry = Integer.parseInt(st.nextToken());
            long y = ytry * 100;
            if (x<0) {
                if (y<0) {
                    coords.add(x*-1+y*-1+11);
                } else {
                    coords.add(x*-1+y+10);
                }
            } else {
                if (y < 0) {
                    coords.add(x+y*-1+1);
                } else {
                    coords.add(x+y);
                }
            }
        }

        long largestArea = 0;
        for (long b : coords) {
            for (long c : coords) {
                if (b == c) {
                    continue;
                }
                long x1 = b / 10000000;
                long y1 = (b - x1* 10000000)/ 100;
                long x2 = c / 10000000;
                long y2 = (c - x2* 10000000) / 100;
                int x1a = 0;
                int y1a = 0;
                int x2a = 0;
                int y2a = 0;
                int x1m = 1;
                int y1m = 1;
                int x2m = 1;
                int y2m = 1;

                if (b%10 == 1) {
                    y1 *= -1;
                    y1a = 1;
                    y1m = -1;
                } if (b%100 - b%10 == 10) {
                    x1 *= -1;
                    x1a = 10;
                    x1m = -1;
                }

                if (c % 10 == 1) {
                    y2 *= -1;
                    y2a = 1;
                    y2m = -1;
                }
                if (c % 100 - c % 10 == 10) {
                    x2 *= -1;
                    x2a = 10;
                    x2m = -1;
                }
                
                if (x1 != x2 && y1 != y2) {
                    long c1 = x1*10000000*x1m + y2*100*y2m+x1a+y2a;
                    long c2 = x2*x2m*10000000 + y1*100*y1m+x2a+y1a;
                    
                    if (coords.contains(c1) && coords.contains(c2)) {
                        long a = Math.abs(x1 - x2) * Math.abs(y1 - y2);
                        largestArea = Math.max(largestArea, a);
                    }
                }
            }
        }

        System.out.println(largestArea);
        if (largestArea == 0) {
            System.out.println(coords);
        }
    }
}