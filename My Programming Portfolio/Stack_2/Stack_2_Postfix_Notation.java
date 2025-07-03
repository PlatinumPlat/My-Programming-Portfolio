package Stack_2;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math;

public class Stack_2_Postfix_Notation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] pstfix = in.nextLine().split(" ");
        Stack<Double> s = new Stack<>();
        for (int i =0; i<pstfix.length; i++) {
            if (pstfix[i].equals("+")) {
                double a = s.pop();
                double b = s.pop();

                s.push(a+b);
            } else if (pstfix[i].equals("-")) {
                double a = s.pop();
                double b = s.pop();

                s.push(b-a);
            } else if (pstfix[i].equals("*")) {
                double a = s.pop();
                double b = s.pop();

                s.push(a*b);
            } else if (pstfix[i].equals("/")) {
                double a = s.pop();
                double b = s.pop();

                s.push(b/a);
            } else if (pstfix[i].equals("%")) {
                double a = s.pop();
                double b = s.pop();

                s.push(b%a);
            } else if (pstfix[i].equals("^")) {
                double a = s.pop();
                double b = s.pop();

                s.push(Math.pow(b,a));
            } else {
                s.push(Double.parseDouble(pstfix[i]));
            }
        }

        double result = (double) Math.round(s.pop() * 10) / 10;

        System.out.print(result);
    }
}
