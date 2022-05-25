package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * N x N 크기의 단어 퍼즐을 만들려고 한다. 입력으로 단어 퍼즐의 모양이 주어진다
 * 주어진 퍼즐 모양에서 특정 길이 K를 갖는 단어가 들어갈 수 있는 자리의 수를 출력하는 프로그램을 작성하라.
 * <p>
 * 1. N을 값을 입력받는다.
 * 2. N x N 크기의 단어 퍼즐을 만든다.
 * 3. 단어 퍼즐 안에 차례 대로 값을 받는다.
 * 4. row 와 col 배열을 만든다
 * 5. arr[i][j]의 값이 1일 경우 row[i]에 1을 더한다.
 * 6. arr[i][j]의 값이 1일 경우 col[j]에 1을 더한다.
 * 7. 만약 row[i]가 K 이고 j + 1 같고 N 일 경우 와 row[i]가 K 이고 j + 1 같고 N 이고 arr[i][j] 가 0 일 경우 count 를 추가 한다
 * 8. 만약 col[j]가 K 이고 i + 1 같고 N 일 경우 와 col[j]가 K 이고 i + 1 같고 N 일 경우 와 arr[i][j] 가 0 일 경우 count 를 추가 한다
 * 9. 마지막으로 count 를 출력한다.
 */

public class sw_1979 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1979.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] col = new int[N];
            int[] row = new int[N];
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1) {
                        row[i] += arr[i][j];
                        col[j] += arr[i][j];
                        if ((row[i] == K && j + 1 == N) || (row[i] == K && j + 1 < N && arr[i][j + 1] == 0)) {
                            count++;
                        }
                        if ((col[j] == K && i + 1 == N) || (col[j] == K && i + 1 < N && arr[i + 1][j] == 0)) {
                            count++;
                        }
                    } else {
                        row[i] = 0;
                        col[j] = 0;
                    }
                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }
}
