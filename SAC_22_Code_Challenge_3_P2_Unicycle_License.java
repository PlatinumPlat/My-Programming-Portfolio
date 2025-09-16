import java.util.*;

public class SAC_22_Code_Challenge_3_P2_Unicycle_License {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double N = 1-in.nextDouble();
        System.out.println((5+(Math.sqrt(25-4*12*N)))/24);
    }
}
