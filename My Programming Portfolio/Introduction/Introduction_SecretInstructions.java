package Introduction;

import java.util.Scanner;

public class Introduction_SecretInstructions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String prevDirect = "";
        String[] out = new String[10001];
        int count = 0;

        boolean bool = true;
        while (bool) {
            String s = in.nextLine();
            if (s.equals("99999")) {
                bool = false;
            } else {
                int d1 = Integer.parseInt(s.substring(0, 1));
                int d2 = Integer.parseInt(s.substring(1, 2));
                String direction;

                if ((d1 + d2) % 2 == 1) {
                    direction = "left";
                    prevDirect = direction;
                } else if (d1 + d2 == 0) {
                    direction = prevDirect;
                } else {
                    direction = "right";
                    prevDirect = direction;
                }

                out[count] = direction + " " + s.substring(2);
                count++;
            }
        }

        for (int i =0; i < count; i++) {
            System.out.println(out[i]);
        }
    }

}
