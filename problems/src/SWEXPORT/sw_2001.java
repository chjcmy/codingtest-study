package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 파리를 최대한 많이 잡아라
 * <p>
 * 1. N, M 을 입력 받는다
 * 2. N만큼의 2차원 배열을 생성한다.
 * 3. N-M을 stick에 저장 한다.
 * 3. 값을 입력 받아 0 부터 N-1 배열에 차례대로 저장한다.
 * 4. 이차원 배열을 x 와 y 로 나누어서 x - stick 축에 대해서 반복하면서 y - stick 축에 대해서 반복 시킨다.
 * 5. 그안에 i 부터 i+stick 반복문을 삽입 한뒤 반복문에서 max 값을 구한다.
 * 6. 전의 max 값 현재 stick 으로 잡은 값이 작으면 max 값으로 만든다
 * 7. 마지막으로 max 값을 출력한다.
 */

public class sw_2001 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/2001.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int stick = N - M + 1;
            
            int[][] maps = new int[N][N];
            for (int i = 0; i < N ; i++) {
                for (int j = 0; j < N; j++) {
                    maps[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            for (int i = 0; i < stick; i++) {
                for (int j = 0; j < stick; j++) {
                    int sum = 0;
                    for (int l = 0; l < M; l++) {
                        for (int k = 0; k < M; k++) {
                            sum += maps[i + k][j + l];
                        }
                    }

                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}

