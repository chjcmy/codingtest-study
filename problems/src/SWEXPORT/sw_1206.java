package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 가로길이가 1000이하인 길이가 있다. 길이 안에 1000개 이하인 건물들이 있다. 건물에서 조망권이 확보된 세대수를 구하려 한다
 * 조망권이 확보된 세대 수는 좌우 2칸 이 건물보다 높아서는 안된다.
 * <p>
 * 1. N을 저장한다.
 * 2. N만큼 수를 받아 일차원 배열에 저장한다.
 * 3. N 만큼 반복문을 실행한다.
 * 4. 왼쪽이나 오른쪽이 2 미만일 경우 왼쪽이 2 미만 이면 오른쪽 두 건물을 비교 하여 계산해 조망권 을 가지는 층을 sum 에 더한다.
 * 5. 좌우가 2 이상일 경우는 좌우를 비교 하여 건물과 두번째로 큰 건물을 비교하여 조망권이 확보도니 층을 sum 에 더한다.
 * 6. 다 끝난 이후에 sum을 출력한다
 *
 * 후기 : 쫌더 간단하게 만들고 싶다.
 */

public class sw_1206 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1206.txt"));

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int N = sc.nextInt();

            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }

            int sum = 0;

            for (int j = 0; j < N; j++) {

                if (j == 0) {
                    boolean a = arr[j] > arr[j + 1];
                    boolean b = arr[j] > arr[j + 2];
                    if (a && b) {

                        int max = Math.max(arr[j + 1], arr[j + 2]);

                        sum += arr[j] - max;
                    }
                }
                else if (j == 1) {
                    boolean a = arr[j] > arr[j + 1];
                    boolean a1 = arr[j] > arr[j - 1];
                    boolean b = arr[j] > arr[j + 2];
                    if (a && b && a1) {
                        int[] arr1 = {arr[j + 1], arr[j + 2], arr[j - 1]};

                        Arrays.sort(arr1);

                        sum += arr[j] - arr1[2];
                    }
                }
                else if (j == N - 2) {
                    boolean a = arr[j] > arr[j + 1];
                    boolean a1 = arr[j] > arr[j - 1];
                    boolean b1 = arr[j] > arr[j - 2];
                    if (a1 && b1 && a) {
                        int[] arr1 = {arr[j - 1], arr[j - 2], arr[j + 1]};

                        Arrays.sort(arr1);

                        sum += arr[j] - arr1[2];
                    }
                }
                else if (j == N - 1) {
                    boolean a1 = arr[j] > arr[j - 1];
                    boolean b1 = arr[j] > arr[j - 2];
                    if (a1 && b1) {
                        int max = Math.max(arr[j - 1], arr[j - 2]);

                        sum += arr[j] + max;
                    }
                }
                else {
                    boolean a = arr[j] > arr[j + 1];
                    boolean a1 = arr[j] > arr[j - 1];
                    boolean b = arr[j] > arr[j + 2];
                    boolean b1 = arr[j] > arr[j - 2];
                    if(a && a1 && b && b1) {
                        int[] arr1 = {arr[j - 1], arr[j - 2], arr[j + 1], arr[j + 2]};

                        Arrays.sort(arr1);

                        sum += arr[j] - arr1[3];
                    }
                }
            }
            System.out.printf("#%d %d\n",i, sum);
        }
    }
}
