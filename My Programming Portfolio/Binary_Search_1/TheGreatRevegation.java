package Binary_Search_1;

import java.util.*;

public class TheGreatRevegation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
            if (x1>x2) {
                ArrayList<Integer> favouritesx1 = prev.getOrDefault(digits, new ArrayList<Integer>());
                favouritesx1.add(x2);
                prev.put(x1, favouritesx1);
                ArrayList<Integer> favouritesx2 = next.getOrDefault(digits, new ArrayList<Integer>());
                favouritesx2.add(x1);
                next.put(x2, favouritesx2);
            } else {
                ArrayList<Integer> favouritesx2 = prev.getOrDefault(digits, new ArrayList<Integer>());
                favouritesx2.add(x1);
                prev.put(x2, favouritesx2);
                ArrayList<Integer> favouritesx1 = next.getOrDefault(digits, new ArrayList<Integer>());
                favouritesx1.add(x2);
                next.put(x1, favouritesx1);
            }
        }
        StringBuffer output = new StringBuffer();
        for (int i=1; i<N+1; i++) {
            if (digits.get(i).size()==0) {
                i-=2;
                ArrayList<Integer> current = digits.get(i+1);
                current.remove(output.charAt(output.length()-1));
                digits.put(i+1, current);
                output.delete(output.length()-1, output.length());
                continue;
                //didn't reset them yet
            }
            output.append(digits.get(i).get(0));


        }
    }
}
