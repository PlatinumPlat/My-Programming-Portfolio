import java.util.*;

public class CCC_05_J3_Returning_Home {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] instructions = new String[5];
        String[] places = new String[5];
        for (int i = 0; i < 5; i++) {
            char intr = in.next().charAt(0);
            if (intr == 'R') {
                instructions[i] = "LEFT";
            } else {
                instructions[i] = "RIGHT";
            }

            String p = in.next();
            if (p.equals("SCHOOL")) {
                break;
            } else {
                places[i] = p;
            }
        }

        for (int a = 4; a > 0; a--) {
            if (instructions[a] != null) {
                System.out.println("Turn " + instructions[a] + " onto " + places[a - 1] + " street.");
            }
        }
        System.out.println("Turn " + instructions[0] + " into your HOME.");
    }
}
