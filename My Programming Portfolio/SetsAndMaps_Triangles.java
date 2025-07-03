import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Math;


public class SetsAndMaps_Triangles {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("triangles.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("triangles.out");


        int N = in.nextInt();
        int[] Xs = new int[N];
        int[] Ys = new int[N];


        for(int a=0; a<N; a++) {
            Xs[a] = in.nextInt();
            Ys[a] = in.nextInt();
        }

        in.close();

        int largestArea = 0;
        for (int b=0; b<N; b++) {
            for (int c=0; c<N; c++) {
                for (int d=0; d<N; d++) {
                    if (Ys[b] == Ys[c] && Xs[b]==Xs[d]) {
                        int a = Math.abs(Xs[c]-Xs[b]) * Math.abs(Ys[d]-Ys[b]);
                        largestArea = Math.max(largestArea, a);
                    }
                }
            }
        }

        out.println(largestArea);
        out.close();
    }
}
