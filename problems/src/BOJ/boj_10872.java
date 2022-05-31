package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 0보다 크거나 같은 정수 n이 주어진다. 이때, n!을 출력하는 프로그램을 작성하시오
 *
 * 1. n의 값을 받는다.
 * 2. 0일경우 1을 반환한다.
 */

public class boj_10872 {

    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        m = Integer.parseInt(br.readLine());

        factory(1,m);


        System.out.println(m);
        br.close();

    }

    public static void factory(int n, int cnt) {

        if(n != cnt ) {
            m *= n;
            n++;
            factory(n,cnt);
        }

        return;
    }
}
