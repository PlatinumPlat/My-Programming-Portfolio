import java.io.*;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class SetsAndMaps_MadScientist {
	public static void main(String[] args) throws IOException {
        File inputFile = new File("breedflip.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("breedflip.out");

        int N = in.nextInt();
        String f = in.next();
        String s = in.next();
        int total = 0;
        boolean diff = false;

        for (int i=0; i<N; i++) {
            if (f.charAt(i)!=s.charAt(i)) {
                diff = true;
            } else {
                if (diff) {
                    total ++;
                }
                diff = false;
            }
        }
        if (diff) {
            total ++;
        }

        out.println(total);
        out.close();
	}
}
