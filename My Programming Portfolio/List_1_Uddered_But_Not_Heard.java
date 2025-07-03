import java.util.Scanner;

public class List_1_Uddered_But_Not_Heard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String alphabet = in.nextLine();
        String letts = in.nextLine();
        int indx = 26;
        int count = 0;
        for (int i=0; i<letts.length(); i++) {
            if (alphabet.indexOf(String.valueOf(letts.charAt(i))) <= indx) {
                count++;
            }
            indx = alphabet.indexOf(String.valueOf(letts.charAt(i)));
        }
        System.out.println(count);
    }
}
