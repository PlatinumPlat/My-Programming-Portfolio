import java.util.*;

public class Chocolate_Bar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i=0; i<N; i++) {
            System.out.println(in.nextInt()*in.nextInt()-1);
        }
    }
}
