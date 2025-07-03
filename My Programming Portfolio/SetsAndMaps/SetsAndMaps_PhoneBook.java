import java.util.Scanner;
import java.util.ArrayList;

public class SetsAndMaps_PhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String[] names = new String[N];
        ArrayList<Long> nums = new ArrayList<>();
        for (int a=0; a<N; a++) {
            names[a] = in.next();
            long phone = in.nextInt();
            nums.add(phone);
        }

        int[] uses = new int[N];
        int K = in.nextInt();
        for (int b=0;  b<K; b++) {
            long phone = in.nextInt();
            if (nums.contains(phone)) {
                uses[nums.indexOf(phone)] ++;
            }
        }

        int max = 0;
        String name = "";
        long num = 0;
        for (int c=0; c<N; c++) {
            if (uses[c] > max) {
                max = uses[c];
                name = names[c];
                num = nums.get(c);
            } else if (uses[c] == max) {
                if (nums.get(c) < num) {
                    max = uses[c];
                    name = names[c];
                    num = nums.get(c);
                }
            }
        }

        System.out.println(name);
    }
}
