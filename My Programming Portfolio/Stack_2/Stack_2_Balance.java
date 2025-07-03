package Stack_2;
import java.util.Scanner;
import java.util.Stack;

public class Stack_2_Balance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Force = in.nextLine();
        Stack<Character> brackets = new Stack<>();
        int count = 0;

        for (int i=0; i<Force.length(); i++) {
            if (Force.charAt(i) == '(') {
                brackets.push('(');
            } else {
                if (brackets.size() == 0) {
                    brackets.push('(');
                    count++;
                } else {
                    if (brackets.peek()=='(') {
                        brackets.pop();
                    }
                }
            }
        }

        if (brackets.size() == 2) {
            if (brackets.peek().equals('(')) {
                brackets.pop();
                if (brackets.peek().equals('(')) {
                    brackets.pop();
                    count++;
                }
            } else {
                if (brackets.peek().equals(')')) {
                    brackets.pop();
                    count++;
                }
            }
        }

        if (count > 1 || brackets.size() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
