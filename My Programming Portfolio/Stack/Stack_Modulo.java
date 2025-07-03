package Stack;
import java.util.HashSet;
import java.util.Scanner;

public class Stack_Modulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> mods = new HashSet<>();

        for (int i=0; i<10; i++) {
            mods.add(in.nextInt()%42);
        }

        System.out.println(mods.size());
    }
}
