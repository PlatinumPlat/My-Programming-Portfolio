package Binary_Search_1;
import java.util.*;
public class CellPhoneMessaging {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<Character, Integer> num = new HashMap();
        
        num.put('a', 2);
        num.put('b', 2);
        num.put('c', 2);
        num.put('d', 3);
        num.put('e', 3);
        num.put('f', 3);
        num.put('g', 4);
        num.put('h', 4);
        num.put('i', 4);
        num.put('j', 5);
        num.put('k', 5);
        num.put('l', 5);
        num.put('m', 6);
        num.put('n', 6);
        num.put('o', 6);
        num.put('p', 7);
        num.put('q', 7);
        num.put('r', 7);
        num.put('s', 7);
        num.put('t', 8);
        num.put('u', 8);
        num.put('v', 8);
        num.put('w', 9);
        num.put('x', 9);
        num.put('y', 9);
        num.put('z', 9);

        Map<Character, Integer> times = new HashMap<>();

        times.put('a', 1);
        times.put('b', 2);
        times.put('c', 3);
        times.put('d', 1);
        times.put('e', 2);
        times.put('f', 3);
        times.put('g', 1);
        times.put('h', 2);
        times.put('i', 3);
        times.put('j', 1);
        times.put('k', 2);
        times.put('l', 3);
        times.put('m', 1);
        times.put('n', 2);
        times.put('o', 3);
        times.put('p', 1);
        times.put('q', 2);
        times.put('r', 3);
        times.put('s', 4);
        times.put('t', 1);
        times.put('u', 2);
        times.put('v', 3);
        times.put('w', 1);
        times.put('x', 2);
        times.put('y', 3);
        times.put('z', 4);

        while (true) {
            String word = in.next();
            if (word.equals("halt")) {
                return;
            }
            int total = times.get(word.charAt(0));
            int prevNum = num.get(word.charAt(0));
            for (int i=1; i<word.length(); i++) {
                if (num.get(word.charAt(i))==prevNum) {
                    total+=2;
                }
                total += times.get(word.charAt(i));
                prevNum = num.get(word.charAt(i));
            }
            System.out.println(total);
        }
    }   
}
