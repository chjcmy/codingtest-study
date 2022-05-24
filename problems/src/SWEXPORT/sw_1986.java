package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적된 값을 구해보자
 *
 * 1. N 을 입력받는다.
 * 2. 값이 0이고 이름은 sum 이라는 변수를 선언한다.
 * 2. 0부터 N - 1 까지 반복하게 만든다.
 * 3. 반복중 i 가 홀수 일경우 sum 에 i를 빼주고 짝수일경우 더해준다.
 */

public class sw_1986 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1986.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 != 0) {
                    sum += i;
                } else {
                  sum -= i;
                }
            }
            System.out.format("#%d %d\n", tc, sum);
        }
    }
}
