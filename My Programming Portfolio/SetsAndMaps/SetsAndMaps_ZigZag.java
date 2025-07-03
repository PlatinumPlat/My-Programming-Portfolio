import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SetsAndMaps_ZigZag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N= in.nextInt();
        ArrayList<ArrayList<String>> words= new ArrayList<>();

        for (int a=0; a<K; a++) {
            String w = in.next();
            char lett = w.charAt(0);
            if (words.size() == 0) {
                words.add(new ArrayList<String>());
                words.get(a).add(w);
            } else {
                for (int b = 0; b < words.size()+1; b++) {
                    if (words.size() < b + 1) {
                        words.add(new ArrayList<String>());
                        words.get(b).add(w);
                        Collections.sort(words.get(b));
                        break;
                    } else if (words.get(b).get(0).charAt(0) == lett) {
                        words.get(b).add(w);
                        Collections.sort(words.get(b));
                        break;
                    }
                }
            }
        }

        int[] count = new int[K];
        String[] out = new String[N];
        for (int i=0; i<N; i++) {
            char letter = in.next().charAt(0);
            for (int j=0; j<words.size(); j++) {
                if (words.get(j).get(0).charAt(0) == letter) {
                    out[i] = words.get(j).get(count[j]);
                    count[j] = (count[j] + 1) % words.get(j).size();
                    break;
                }
            }
        }

        for (int z=0; z<N; z++) {
            System.out.println(out[z]);
        }
    }
}
