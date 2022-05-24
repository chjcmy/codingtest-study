package SWEXPORT;

import java.util.Scanner;

/**
 * 첫 번째 줄은 항상 숫자 1 이다
 * 두 번째 줄 부터 각 숫자들은 자신의 왼쪽과 오른쪽 위의 숫자의 합으로 구성된다
 *          1
 *         1 1
 *        1 2 1
 *       1 3 3 1
 *  1. N 을 가지고 이차원 배열을 만든다
 *  2. 일차원 배열(i)과 이차원 배열(j) 반복문을 만든다
 *  3. i 와 j 가 같은 경우 i 가 1 경우 1 을 추가한다
 *  4. 아닐 경우 (i, j) 는 (i-1, j) + (i, j-1) 의 합이다
 *  5. 그 후 이차원 배열에 있는 수를 출력한다
 */

public class sw_2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
            for (int tc = T; tc >= 0; tc--) {
                int N = sc.nextInt();
                int[][] arr = new int[N][N];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i == j) {
                            arr[i][j] = 1;
                        } else if (i == 0) {
                            arr[i][j] = 1;
                        } else {
                            arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                        }
                    }
                }
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println(arr[N - 1][N - 1]);
            }
    }
}
