package Stack_2;
import java.util.Scanner;

public class Stack_2_Harambe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String essay = in.nextLine();
        int lower = 0;
        int upper = 0;

        for (int i=0; i<essay.length(); i++) {
            if (String.valueOf(essay.charAt(i)).matches("[a-z]")) {
                lower++;
            } else if (String.valueOf(essay.charAt(i)).matches("[A-Z]")) {
                upper++;
            }
        }

        if (upper<lower) {
            System.out.println(essay.toLowerCase());
        } else if (lower<upper) {
            System.out.println(essay.toUpperCase());
        } else {
            System.out.println(essay);
        }
    }
}
