package thisiscodingtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 8 x 8의 체스판에서 L자 형태로 움직일수 있는 나이트가 있다 몇 가지 형태로 이동할수 있는가????
 * 1. 행을 맵으로 알파벳을 숫자로 정리 한다.
 * 2. 말이 맵 안에서 움직일 수 있다면 count 변수에 1을 더해준다.
 * 3. 말이 움직일수 있는 방식 두개의 배열에 정리 한댜.
 * 4. 말의 위치를 알파벳에 맞게 N, M에 값을 추가 한다.
 * 5. 말이 움직이는 방식 만큼 말의 위치가 체스판 안에서 움직일수 있다면 count에 1을 더한다.
 */

public class this4_2_2 {

    public static void main(String[] args) {
        int maps = 8;
        int move_x[] = { 1, 2, 1, 2, -1, -2, -1, -2 };
        int move_y[] = { 2, 1, -2, -1, 2, 1, -2, -1 };

        String T = "a1";
        int count = 0;
        int N = T.charAt(1) - '1';
        int M = T.charAt(0) - 'a';

        for (int i = 0; i < move_x.length; i++) {
          int n = N + move_x[i];
          int m = M + move_y[i];
          if (n >= 0 && n < maps && m >= 0 && m < maps) {
            count++;
          }
        }
        System.out.println(count);
    }
}
