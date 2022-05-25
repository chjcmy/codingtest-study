package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 9 x 9 의 스도쿠 퍼즐이 있다. 퍼즐에서  겹치는 숫자가 있는 지 확신해야된다. 겹치는 경우 0을 출력, 겹치지 않는 경우 1을 출력하라.
 * <p>
 * 1. 9로 된 이차원 배열을 만든다.
 * 2. 행, 열 각각 45 가 아닌곳을 찾으시오 45가 아닌곳이 있으면  0을 출력한다
 * 3. 박스 별로 45가 아닐경우 0을 출력한다
 *
 * 3 x 3 박스 에 있는 값을 구하기
 * 행을 1, 2, 3씩 구한다
 * 3번을 반복하게 만든다
 * 그 후 다음의 박스를 구한다
 * 첫번째 줄 박스가 다 구해졌을 시 두번째 줄 첫번째 박스를 구한다
 **/

public class sw_1974 {
    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("./src/1974.txt"));

        int[] block = {1,4,7};

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            int[][] arr = new int[10][10];

            int ans = 1;

            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 1; i <= 9; i++) {
                int rowSum = 0;
                int colSum = 0;
                for (int j = 1; j <= 9; j++) {
                    rowSum += arr[i][j];
                    colSum += arr[j][i];
                }
                if(rowSum != 45 || colSum != 45) {
                    ans = 0;
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int blockSum = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            blockSum += arr[block[i] + k][block[j] + l];
                        }
                    }
                    if (blockSum != 45) {
                        ans = 0;
                    }
                }
            }
            System.out.printf("#%d %d\n", tc, ans);
        }
    }
}
