import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class SetsAndMaps_Unique_Elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<Integer> integers = new HashSet();
        int N= in.nextInt();

        for (int i=0; i<N; i++) {
            integers.add(in.nextInt());
        }

        System.out.println(integers.size());
    }
}
