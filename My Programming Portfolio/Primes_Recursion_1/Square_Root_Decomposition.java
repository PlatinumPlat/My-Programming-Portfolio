package Primes_Recursion_1;

import java.util.Scanner;

public class Square_Root_Decomposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int i = in.nextInt();
        int j = in.nextInt();
        if (Math.abs(N-i*i) > Math.abs(N-j*j)) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }    
}
