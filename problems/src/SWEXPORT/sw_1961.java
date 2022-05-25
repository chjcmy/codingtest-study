package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * N x N 행렬이 주어질때
 * <p>
 * 1. N에 대해 이차원 배열을 만든다
 * 2. N에 대한 나침반 배열을 만든다. (90도(0, N-1), 180도(N-1, N-1), 270도(N-1, 0))
 * 3. 0부터 N-1까지 나침반 배열이 반복되고 나침반 배열이 완성 될때마다 값을 출력하며 반복한다.
 * 4. 하나의 행이 완성 될때마다 한줄을 뛰어준다.
 */

public class sw_1961 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1961.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" + tc);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            for (int k = n-1; k >= 0; k--) {
                                System.out.print(arr[k][i]);
                            }
                            break;
                        case 1:
                            for (int k = n - 1; k >= 0; k--) {
                                System.out.print(arr[n - 1 - i][k]);
                            }
                            break;
                        case 2:
                            for (int k = 0; k < n; k++) {
                                System.out.print(arr[k][n - 1 - i]);
                            }
                            break;
                    }
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}

