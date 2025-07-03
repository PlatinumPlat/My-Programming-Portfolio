
import java.util.HashSet;
import java.util.Scanner;

public class Stack_2_Daisy_Chains {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String[] flowers = in.nextLine().split(" ");

        int co =0;
        for (int a=0; a<N; a++) {
            for (int b=a+1; b<N; b++) {
                HashSet<Integer> flows = new HashSet<>();
                int count = 0;
                for (int c=a; c<b+1; c++) {
                    flows.add(Integer.parseInt(flowers[c]));
                    count += Integer.parseInt(flowers[c]);
                }
                double avg = Double.valueOf(count) / Double.valueOf(b-a+1);
                if (avg %1 == 0) {
                    int l = flows.size();
                    int newInt = (int) avg;
                    flows.add(newInt);
                    if (flows.size() == l) {
                        co ++;
                    }
                }
            }
        }

        System.out.println(co+flowers.length);
        System.out.close();
    }
}
