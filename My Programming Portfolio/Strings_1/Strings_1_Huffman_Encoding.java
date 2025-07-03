package Strings_1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Strings_1_Huffman_Encoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String[] codes = new String[n];
        String[] letters = new String[n];

        for (int i=0; i<n; i++) {
            String[] input = in.nextLine().split(" ");
            codes[i] = input[1];
            letters[i] = input[0];
        }

        StringBuffer decipher = new StringBuffer(in.nextLine());
        StringBuffer ex = new StringBuffer();
        ArrayList<String> codeList = new ArrayList<>(Arrays.asList(codes));


        for (int j = 1; j < decipher.length()+1; j++) {
            if (codeList.contains(String.valueOf(decipher).substring(0, j))) {
                ex.append(letters[codeList.indexOf(String.valueOf(decipher).substring(0, j))]);
                decipher.delete(0, j);
                j = 0;
            }
        }


        System.out.println(ex);
    }

}
