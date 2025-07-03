import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Sets_And_Maps_Jerseys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int J = in.nextInt();
        int A = in.nextInt();
        int Larges = 0;
        int Meds = 0;
        int Smalls = 0;
        Set<Integer> LAvail = new HashSet<>();
        Set<Integer> MAvail = new HashSet<>();
        Set<Integer> SAvail = new HashSet<>();
        for (int a = 0; a < J; a++) {
            String size = in.next();
            if (size.equals("L")) {
                Larges++;
                LAvail.add(a+1);
            } else if (size.equals("M")) {
                Meds++;
                MAvail.add(a + 1);
            } else {
                Smalls++;
                SAvail.add(a + 1);
            }
        }

        Set<Integer> LSizes = new HashSet<>();
        Set<Integer> MSizes = new HashSet<>();
        Set<Integer> SSizes = new HashSet<>();
        in.nextLine();
        for (int i = 0; i < A; i++) {
            String[] input = in.nextLine().split(" ");
            String size = input[0];
            if (size.equals("L")) {
                LSizes.add(Integer.parseInt(input[1]));
            } else if (size.equals("M")) {
                MSizes.add(Integer.parseInt(input[1]));
            } else {
                SSizes.add(Integer.parseInt(input[1]));
            }
        }

        int count = 0;
        for (int b : LSizes) {
            if (LAvail.contains(b) && Larges != 0) {
                LAvail.remove(b);
                Larges--;
                count++;
            }
        }

        for (int c : MSizes) {
            if (MAvail.contains(c) && Meds != 0) {
                MAvail.remove(c);
                Meds--;
                count++;
            } else if (LAvail.contains(c) && Larges != 0) {
                LAvail.remove(c);
                Larges--;
                count++;
            }
        }

        for (int d : SSizes) {
            if (SAvail.contains(d) && Smalls != 0) {
                SAvail.remove(d);
                Smalls--;
                count++;
            } else if (MAvail.contains(d) && Meds != 0) {
                MAvail.remove(d);
                Meds--;
                count++;
            } else if (LAvail.contains(d) && Larges != 0) {
                LAvail.remove(d);
                Larges--;
                count++;
            }
        }

        System.out.println(count);
    }
}