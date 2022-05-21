package SWEXPORT;

import java.util.Scanner;

public class sw_1933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T <= 1000) {
            for (int testCase = 1; testCase <= T; testCase++) {
                if (T % testCase == 0) {
                    System.out.print(testCase + " ");
                }
            }
        }
    }
}
