package Binary_Search_1;

import java.util.*;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.nextLine();
        int Q = in.nextInt();

        int[][] letterPSA = new int[26][S.length()];
        Map<Character, Integer> inside = new HashMap<>();
        int nextRow = 0;
        boolean[] PSAd = new boolean[S.length()];

        for (int i = 0; i < S.length(); i++) {
            char letter = S.charAt(i);
            if (letter==' ') {
                continue;
            }
            if (!inside.keySet().contains(letter)) {
                letterPSA[nextRow][i] = 1;
                inside.put(letter, nextRow);
                nextRow++;
            } else {
                letterPSA[inside.get(letter)][i] = 1;
            }
        }

        for (int a = 0; a < Q; a++) {
            int j = in.nextInt()-1;
            int p = in.nextInt()-1;
            char c = in.next().charAt(0);
            if (inside.containsKey(c)) {
                if (!PSAd[inside.get(c)]) {
                    for (int k = 1; k < S.length(); k++) {
                        letterPSA[inside.get(c)][k] += letterPSA[inside.get(c)][k - 1];
                    }
                    PSAd[inside.get(c)] = true;
                }
                if (j==0) {
                    System.out.println(letterPSA[inside.get(c)][p]);
                } else {
                    System.out.println(letterPSA[inside.get(c)][p] - letterPSA[inside.get(c)][j - 1]);
                }
            } else {
                System.out.println(0);
            }
            
        }   
    }
}
