import java.util.*;

public class Pet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long largest = 0L;
        int p = 0;
        for (int i=0; i<5; i++) {
            long t = in.nextLong()+in.nextLong()+in.nextLong()+in.nextLong();
            if (t>largest) {
                largest=t;
                p=i+1;
            }
        }
        System.out.println(p+" " + largest);
    }
}
