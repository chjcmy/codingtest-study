package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 민석이는 1 부터 양의 숫자를 세는 것이 재미 없어 N 을 두고 2N, 3N, .... , k 번째 에는 kN번 양을 센다.
 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 모두 찾을 때까지 N에 0 부터 시작해서 다 찾을 때 까지 구하라
 *
 * 0. 0 부터 9까지 값이 있는지 없는지 구별 할수 있게 배열을 만든다.
 * 1. 초반값을 받기 위해 N 이라는 문자열 변수를 생성하고 입력 값을 받는다.
 * 2. N 문자열 크기만큼 반복하여 문자열에 있는 값을 숫자로 변경하여 bool 배열 숫자위치에 값이 있다면 그냥 넘긴다.
 * 3. 만약 값이 없다면 배열위치에 N값을 넣어 true로 만들고 cnt에 1을 추가한다.
 * 4. 만약 cnt 가  10일 경우 끝낸뒤 A 값을 출력한다
 *
 */

public class sw_1288 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1288.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            String A = sc.next();
            int N = Integer.parseInt(A);
            boolean[] truth = new boolean[10];
            int cnt = 0;
            int add = 1;

            while (true) {
                for (int j = 0; j < A.length(); j++) {
                    int someThink = Integer.parseInt(A.substring(j, j+1));
                    if(!truth[someThink]) {
                        truth[someThink] = true;
                        cnt++;
                    }
                }

                if(cnt==10) break;

                else {
                    add++;
                    A = Integer.toString(add*N);
                }
            }
            System.out.printf("#%d %s\n", i, A);
        }
    }
}
