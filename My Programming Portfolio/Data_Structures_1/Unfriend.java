package Data_Structures_1;

import java.util.*;

public class Unfriend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] friend = new int[N - 1];

        for (int a = 0; a < N - 1; a++) {
            friend[a] = in.nextInt() - 1;
        }
        // switch

        int count = 0;
        if (N == 1) {
            System.out.println(2);
            return;
        } else if (N == 2) {
            System.out.println(3);
            return;
        } else if (N == 3) {
            for (int b = 0; b < 2; b++) {
                boolean[] remove = new boolean[3];
                if (b == 1) {
                    remove[0] = true;
                } else {
                    remove[0] = false;
                }
                for (int c = 0; c < 2; c++) {
                    if (c == 1) {
                        remove[1] = true;
                    } else {
                        remove[1] = false;
                    }
                    List<Integer> r = new ArrayList<>();
                    for (int z = 0; z < 2; z++) {
                        if (remove[z]) {
                            r.add(z);
                        }
                    }
                    if (r.size() == 0) {
                        count++;
                    } else {
                        boolean not = false;
                        for (int i = 0; i < N - 1 && !not; i++) {
                            if (r.contains(i)) {
                                continue;
                            }
                            int index = i;
                            while (true) {
                                if (r.contains(friend[index])) {
                                    not = true;
                                    break;
                                } else {
                                    index = friend[index];
                                    if (index == 2) {
                                        if (r.contains(2)) {
                                            not = true;
                                        }
                                        break;
                                    }
                                }
                            }
                        }

                        if (!not) {
                            count++;
                        }
                    }
                }
            }
        } else if (N == 4) {
            for (int b = 0; b < 2; b++) {
                boolean[] remove = new boolean[4];
                if (b == 1) {
                    remove[0] = true;
                } else {
                    remove[0] = false;
                }
                for (int c = 0; c < 2; c++) {
                    if (c == 1) {
                        remove[1] = true;
                    } else {
                        remove[1] = false;
                    }
                    for (int d = 0; d < 2; d++) {
                        if (d == 1) {
                            remove[2] = true;
                        } else {
                            remove[2] = false;
                        }
                        List<Integer> r = new ArrayList<>();
                        for (int z = 0; z < 3; z++) {
                            if (remove[z]) {
                                r.add(z);
                            }
                        }
                        if (r.size() == 0) {
                            count++;
                        } else {
                            boolean not = false;
                            for (int i = 0; i < N - 1 && !not; i++) {
                                if (r.contains(i)) {
                                    continue;
                                }
                                int index = i;
                                while (true) {
                                    if (r.contains(friend[index])) {
                                        not = true;
                                        break;
                                    } else {
                                        index = friend[index];
                                        if (index == 3) {
                                            if (r.contains(3)) {
                                                not = true;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }

                            if (!not) {
                                count++;
                            }

                        }
                    }
                }
            }
        } else if (N == 5) {
            for (int b = 0; b < 2; b++) {
                boolean[] remove = new boolean[5];
                if (b == 1) {
                    remove[0] = true;
                } else {
                    remove[0] = false;
                }
                for (int c = 0; c < 2; c++) {
                    if (c == 1) {
                        remove[1] = true;
                    } else {
                        remove[1] = false;
                    }
                    for (int d = 0; d < 2; d++) {
                        if (d == 1) {
                            remove[2] = true;
                        } else {
                            remove[2] = false;
                        }
                        for (int e = 0; e < 2; e++) {
                            if (e == 1) {
                                remove[3] = true;
                            } else {
                                remove[3] = false;
                            }
                            List<Integer> r = new ArrayList<>();
                            for (int z = 0; z < 4; z++) {
                                if (remove[z]) {
                                    r.add(z);
                                }
                            }
                            if (r.size() == 0) {
                                count++;
                            } else {
                                boolean not = false;
                                for (int i = 0; i < N - 1 && !not; i++) {
                                    if (r.contains(i)) {
                                        continue;
                                    }
                                    int index = i;
                                    while (true) {
                                        if (r.contains(friend[index])) {
                                            not = true;
                                            break;
                                        } else {
                                            index = friend[index];
                                            if (index == 4) {
                                                if (r.contains(4)) {
                                                    not = true;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }

                                if (!not) {
                                    count++;
                                }
                            }

                        }
                    }
                }
            }
        } else if (N == 6) {
            for (int b = 0; b < 2; b++) {
                boolean[] remove = new boolean[6];
                if (b == 1) {
                    remove[0] = true;
                } else {
                    remove[0] = false;
                }
                for (int c = 0; c < 2; c++) {
                    if (c == 1) {
                        remove[1] = true;
                    } else {
                        remove[1] = false;
                    }
                    for (int d = 0; d < 2; d++) {
                        if (d == 1) {
                            remove[2] = true;
                        } else {
                            remove[2] = false;
                        }
                        for (int e = 0; e < 2; e++) {
                            if (e == 1) {
                                remove[3] = true;
                            } else {
                                remove[3] = false;
                            }
                            for (int f = 0; f < 2; f++) {
                                if (f == 1) {
                                    remove[4] = true;
                                } else {
                                    remove[4] = false;
                                }

                                List<Integer> r = new ArrayList<>();
                                for (int z = 0; z < 5; z++) {
                                    if (remove[z]) {
                                        r.add(z);
                                    }
                                }
                                if (r.size() == 0) {
                                    count++;
                                } else {
                                    boolean not = false;
                                    for (int i = 0; i < N - 1 && !not; i++) {
                                        if (r.contains(i)) {
                                            continue;
                                        }
                                        int index = i;
                                        while (true) {
                                            if (r.contains(friend[index])) {
                                                not = true;
                                                break;
                                            } else {
                                                index = friend[index];
                                                if (index == 5) {
                                                    if (r.contains(5)) {
                                                        not = true;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    if (!not) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}