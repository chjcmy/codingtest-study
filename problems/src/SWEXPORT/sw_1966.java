package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 받은 숫자열을 정열하라
 * 1. 숫자열을 받는다.
 * 2. 숫자열을 정열시킨다
 */


public class sw_1966 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1966.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            System.out.printf("#%d ", tc);
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
