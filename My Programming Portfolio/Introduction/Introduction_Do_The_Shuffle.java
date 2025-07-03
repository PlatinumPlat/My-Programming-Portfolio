package Introduction;

import java.util.Scanner;

public class Introduction_Do_The_Shuffle {
    public static void main(String[] args) {
        String[] playlist = {"A", "B", "C", "D", "E"};

        Scanner in = new Scanner(System.in);
        boolean bool = true;

        while (bool) {
            int button = in.nextInt();
            int times = in.nextInt();
            if (button == 1) {
                for (int a =0; a<times; a++) {
                    String song = playlist[0];
                    for (int j=0; j<4; j++) {
                        playlist[j] = playlist[j+1];
                    }
                    playlist[4] = song;
                }
            } else if (button==2) {
                for (int b = 0; b<times; b++) {
                    String song = playlist[4];
                    for (int k=4; k>0; k--) {
                        playlist[k] = playlist[k-1];
                    }
                    playlist[0] = song;
                }
            } else if (button==3) {
                for (int c = 0; c<times; c++) {
                    String song = playlist[1];
                    playlist[1] = playlist[0];
                    playlist[0] = song;
                }
            } else if (button==4) {
                bool = false;
            }
        }

        System.out.print(playlist[0]);
        for (int d=1; d<5; d++) {
            System.out.print(" "+ playlist[d]);
        }
    }
}
