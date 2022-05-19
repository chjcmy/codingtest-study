package SWEXPORT;

import java.io.FileInputStream;
import java.util.Scanner;

public class sw_2070 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("./src/2070.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String sum;

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                sum = ">";
            } else if (a < b) {
                sum = "<";
            } else {
                sum = "=";
            }
            System.out.printf("#%d %s%n", test_case, sum);
        }
    }
}