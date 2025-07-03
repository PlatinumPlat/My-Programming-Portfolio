package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Stack_All_Is_Balanced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] out = new String[5];

        for (int i=0; i<5; i++) {
            String next = in.nextLine().replaceAll("[a-z0-9]", "");
            Stack<Character> chars = new Stack<>();
            boolean balanced = true;
            for (int a=0; a<next.length(); a++) {
                if (next.charAt(a)=='('||next.charAt(a)=='['||next.charAt(a)=='{') {
                    chars.push(next.charAt(a));
                } else if (chars.size() != 0) {
                    if (next.charAt(a) == ')' && chars.peek() == '(') {
                        chars.pop();
                    } else if (next.charAt(a) =='}' && chars.peek() == '{') {
                        chars.pop();
                    } else if (next.charAt(a) ==']' && chars.peek() == '[') {
                        chars.pop();
                    } else {
                        out[i] = "not balanced";
                        balanced = false;
                        break;
                    }
                } else {
                    out[i] = "not balanced";
                    balanced = false;
                    break;
                }
            }

            if (balanced && chars.size() == 0) {
                out[i] = "balanced";
            } else {
                out[i] = "not balanced";
            }
        }

        for (int z=0; z<5; z++) {
            System.out.println(out[z]);
        }
    }
}
