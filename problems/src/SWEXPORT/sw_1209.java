package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 각 100 x 100 으로 만들어진 이차원 행렬로 만들고, 한줄로 제일 큰 값을 만들고 비교해서 제일 큰 값을 받아라
 *
 * 1. 100 x 100 으로 만들고 값을 받는다.
 * 2. x y 에서 제일 큰 값을 구한다.
 * 3. 대각선 두개 중에 제일 큰 값을 구한다.
 * 4. 네개 중 제일 큰 값을 프린트 해준다.
 */

public class sw_1209 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1209.txt"));

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {

            int xMax = 0, yMax = 0, ob1Max = 0, ob2Max = 0;

            int[][] arr = new int[100][100];

            int N = sc.nextInt();

            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = sc.nextInt();
                }

            }

            for (int j = 0; j < 100; j++) {

                int temp = 0;

                for (int k = 0; k < 100; k++) {
                    temp += arr[j][k];
                }
                if (xMax < temp) {
                    xMax = temp;
                }

            }

            for (int j = 0; j < 100; j++) {

                int temp = 0;

                for (int k = 0; k < 100; k++) {
                    temp += arr[k][j];
                }
                if (yMax < temp) {
                    yMax = temp;
                }
            }

            for (int j = 0; j < 100; j++) {
                ob1Max += arr[j][j];
            }

            for (int j = 0; j < 100; j++) {
                ob2Max += arr[99-j][j];
            }

            int[] arr2 = {xMax, yMax, ob1Max, ob2Max};

            Arrays.sort(arr2);

            System.out.printf("#%d %d\n", N, arr2[3]);
        }
    }
}
