package Lists_1;
import java.util.Scanner;
import java.lang.Math;

public class Lists_1_Microwave_Buttons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] hMS = in.nextLine().split(":");
        String nums = in.nextLine();
        int[] fin = {0, 0, 0, 0, 0, 0};
        int[] vals = {0, 0, 0, 0, 0, 0};
        int total = Integer.parseInt(hMS[0])*3600 +Integer.parseInt(hMS[1])*60+Integer.parseInt(hMS[2]);
        int diff = 10000000;
        if (nums.indexOf(hMS[0].charAt(0)) != -1) {
            vals[0] = Integer.parseInt(hMS[0].substring(0, 1));
            if (nums.indexOf(hMS[0].charAt(1)) != -1) {
                vals[1] = Integer.parseInt(hMS[0].substring(1));
                if (nums.indexOf(hMS[1].charAt(0)) != -1) {
                    vals[2] = Integer.parseInt(hMS[1].substring(0, 1));
                    if (nums.indexOf(hMS[1].charAt(1)) != -1) {
                        vals[3] = Integer.parseInt(hMS[1].substring(1));
                        if (nums.indexOf(hMS[2].charAt(0)) != -1) {
                            vals[4] = Integer.parseInt(hMS[2].substring(0, 1));
                            if (nums.indexOf(hMS[2].charAt(1)) != -1) {
                                System.out.print(hMS[0]);
                                System.out.print(":");
                                System.out.print(hMS[1]);
                                System.out.print(":");
                                System.out.print(hMS[2]);
                                return;
                            }
                        }
                    }
                }
            }
        }

        for (int z = 0; z < nums.length(); z++) {
            vals[0] = Integer.parseInt(nums.substring(z, z + 1));
            for (int o = 0; o < nums.length(); o++) {
                vals[1] = Integer.parseInt(nums.substring(o, o + 1));
                for (int t = 0; t < nums.length(); t++) {
                    vals[2] = Integer.parseInt(nums.substring(t, t + 1));
                    for (int th = 0; th < nums.length(); th++) {
                        vals[3] = Integer.parseInt(nums.substring(th, th + 1));
                        for (int f = 0; f < nums.length(); f++) {
                            vals[4] = Integer.parseInt(nums.substring(f, f + 1));
                            for (int fv = 0; fv < nums.length(); fv++) {
                                vals[5] = Integer.parseInt(nums.substring(fv, fv + 1));
                                int curr = (vals[0] * 10 + vals[1]) * 3600 + (vals[2] * 10 + vals[3]) * 60 + vals[4] * 10 + vals[5];
                                if (Math.abs(total - curr) < diff) {
                                    fin[0] = vals[0];
                                    fin[1] = vals[1];
                                    fin[2] = vals[2];
                                    fin[3] = vals[3];
                                    fin[4] = vals[4];
                                    fin[5] = vals[5];
                                    diff = Math.abs(total-curr);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        System.out.print(fin[0]);
        System.out.print(fin[1]);
        System.out.print(":");
        System.out.print(fin[2]);
        System.out.print(fin[3]);
        System.out.print(":");
        System.out.print(fin[4]);
        System.out.print(fin[5]);
        return;

    }
}
