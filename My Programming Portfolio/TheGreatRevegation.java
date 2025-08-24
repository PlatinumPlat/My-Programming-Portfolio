import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math;

public class TheGreatRevegation {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("revegetate.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("revegetate.out");

        int N = in.nextInt();
        int M = in.nextInt();
        Map<Integer, ArrayList<Integer>> prev = new HashMap<>();
        Map<Integer, ArrayList<Integer>> next = new HashMap<>();
        Map<Integer, ArrayList<Integer>> digits = new HashMap<>();

        for (int a = 1; a < N + 1; a++) {
            ArrayList<Integer> four = new ArrayList<>();
            four.add(1);
            four.add(2);
            four.add(3);
            four.add(4);
            digits.put(a, four);
        }

        for (int b = 0; b < M; b++) {
            int x1 = in.nextInt();
            int x2 = in.nextInt();
            if (x1 > x2) {
                ArrayList<Integer> favouritesx1 = prev.getOrDefault(x1, new ArrayList<Integer>());
                favouritesx1.add(x2);
                prev.put(x1, favouritesx1);
                ArrayList<Integer> favouritesx2 = next.getOrDefault(x2, new ArrayList<Integer>());
                favouritesx2.add(x1);
                next.put(x2, favouritesx2);
            } else {
                ArrayList<Integer> favouritesx2 = prev.getOrDefault(x2, new ArrayList<Integer>());
                favouritesx2.add(x1);
                prev.put(x2, favouritesx2);
                ArrayList<Integer> favouritesx1 = next.getOrDefault(x1, new ArrayList<Integer>());
                favouritesx1.add(x2);
                next.put(x1, favouritesx1);
            }
        }

        StringBuffer output = new StringBuffer();
        for (int i = 1; i < N + 1; i++) {
            if (digits.get(i).size() == 0) {
                i -= 2;
                ArrayList<Integer> current = digits.get(i + 1);
                current.remove(output.charAt(output.length() - 1));
                digits.put(i + 1, current);
                int wrongNum = output.charAt(output.length() - 1) - '0';
                output.delete(output.length() - 1, output.length());
                if (next.get(i + 1) != null) {
                    for (int a = 0; a < next.get(i + 1).size(); a++) {
                        ArrayList<Integer> currdigits = digits.get(next.get(i + 1).get(a));
                        currdigits.add(wrongNum);
                        digits.put(next.get(i + 1).get(a), currdigits);
                    }
                }
            } else {
                output.append(digits.get(i).get(0));
                if (next.get(i) != null) {
                    for (int a = 0; a < next.get(i).size(); a++) {
                        ArrayList<Integer> currdigits = digits.get(next.get(i).get(a));
                        currdigits.remove(digits.get(i).get(0));
                        digits.put(next.get(i).get(a), currdigits);
                    }
                }
            }
        }

        out.println(output);
        out.close();
    }
}
