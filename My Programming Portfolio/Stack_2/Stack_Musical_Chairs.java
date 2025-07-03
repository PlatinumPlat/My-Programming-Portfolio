package Stack_2;
import java.util.HashSet;
import java.util.Scanner;

public class Stack_Musical_Chairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        HashSet<Integer> chairs = new HashSet<>();

        for (int i=0; i< K; i++) {
            chairs.add(in.nextInt());
        }

        int[] indexes = new int[K+1];
        for (int a=0; a<K+1; a++) {
            indexes[a] = in.nextInt();
        }

        for (int z=0; z<K+1; z++) {
            if (chairs.contains(indexes[z])) {
                chairs.remove(indexes[z]);
                indexes[z] = 0;
            }
        }

        while (true) {
            for (int b=0; b<K+1; b++) {
                if (chairs.size() == 0) {
                    if (indexes[b] != 0) {
                        System.out.println(b+1);
                        System.exit(0);
                    }
                } else if (indexes[b] != 0) {
                    indexes[b] = (indexes[b]%N)+1;

                    if (chairs.contains(indexes[b])) {
                        chairs.remove(indexes[b]);
                        indexes[b] = 0;
                    }
                }
            }
        }
    }
}
