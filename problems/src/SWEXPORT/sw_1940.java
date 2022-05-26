package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *  0 : 햔재 속도 유지
 *  1 : 가속
 *  2 : 감속
 *
 *  매초 마다 아래와 같은 command가 정수로 주어진다.
 *  command 중 , 가속 또는 감속 의 경우 가속도의 값이 추가로 주어진다.
 *  가속도의 단위는 미터 세컨드 제곱이며, 모두 양의 정수로 주어진다
 *  입력으로 주어진 n개의 command 를 모두 수행 했을 때, n초 동안 이동한 거리를 계산하는 프로그램을 작성 하시오
 *  0. 기본 속도 와 가속도를 얻은 속도를 저장 할수 있는 기존값이 0인 변수를 만든다.
 *  1. 가속도의 갯수를 받는다.
 *  2. 가속도의 갯수만큼 반복 한다.
 *  3. 가속이 1 일 경우 기존 가속이 붙은 값에 더하고 가속이 2 일 경우 기존 가속이 붙은 값에 마이너스를 한다
 *  4. 그 후 변경된 가속도에 기존 가속도를 더한다.
 *  5. 마지막으로 기존 가속도를 출력한다.
 */


public class sw_1940 {
    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("./src/1940.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int ex_speed = 0, speed = 0;
            for (int i = 0; i < N; i++) {
                int C = sc.nextInt();
                switch (C) {
                    case 1:
                        speed = speed + sc.nextInt();
                        break;
                    case 2:
                        int sub = sc.nextInt();
                        if (sub > speed) speed = 0;
                        else speed = speed - sub;
                        break;
                }
                ex_speed = ex_speed + speed;
            }
            System.out.printf("#%d %d\n", t, ex_speed);
        }
    }
}