package Binary_Search_3;

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class James_Egirl_Status {
//     public static void main(String[] args) throws IOException{
//         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//         PrintWriter out = new PrintWriter(System.out);

//         StringTokenizer aT = new StringTokenizer(in.readLine());
//         int N = Integer.parseInt(aT.nextToken());
//         int K = Integer.parseInt(aT.nextToken());

//         long[] points = new long[N];
//         StringTokenizer bT = new StringTokenizer(in.readLine());
//         points[0] = Long.parseLong(bT.nextToken());
//         for (int a = 1; a < N; a++) {
//             points[a] = Long.parseLong(bT.nextToken()) + points[a - 1];
//         }

//         long max = 0;

//         if (K==N) {
//             if (points[N-1]>0) {
//                 System.out.println(points[N-1]);
//                 return;
//             }
//         }

//         for (int b = 0; b < K; b++) {
//             int start = b;
//             int end = b + K - 1;
//             while (end < N && start <= end) {
//                 if (start == 0) {
//                     if (points[end] > max) {
//                         max = points[end];
//                         end += K;
//                     } else {
//                         start += K;
//                     }
//                 } else {
//                     if (points[end] - points[start - 1] > max) {
//                         max = points[end] - points[start - 1];
//                         end += K;
//                     } else {
//                         start += K;
//                     }
//                 }
//             }
//         }

//         System.out.println(max);
//     }
// }

import java.util.*;

public class James_Egirl_Status {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        long[] points = new long[N];
        points[0] = in.nextLong();
        for (int a = 1; a < N; a++) {
            points[a] = in.nextLong() + points[a - 1];
        }

        long max = 0;
        for (int b = 1; b <= N / K; b++) {
            for (int c = 0; c <= N - b * K; c++) {
                if (c == 0) {
                    max = Math.max(max, points[b * K - 1]);
                } else {
                    max = Math.max(max, points[c + b * K - 1] - points[c - 1]);
                }
            }
        }
        System.out.println(max);
    }
}