package thisiscodingtest;

import java.util.Arrays;

/**
 * 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질때 성현이의 큰수의 법칙에 따른 결과를 출력하시오
 * 1. 배열의 제일 큰수를 저장한다.
 * 2. 배열을 재 정렬 하여 제일 끝에 있는 수를 저장한뒤 두번째로 큰 수를 저장한다.
 * 3. COUNT 만큼 제일 큰수를 더해지는 숫자만큼 더한뒤 TOTAL에 저장 후 다음으로 큰 숫자를 더 해준다
 * 3. 만약 COUNT가 0일시 끝낸다
 */


public class this3_2 {

    public static void main(String[] args) {
        int T[] = {2, 4, 5, 4, 6};
        int t_count = 8;
        int K = 3;
        int first, second, total = 0;
        Arrays.sort(T);
        first = T[T.length - 1];
        second = T[T.length - 2];
        while (t_count != 0) {
            for (int i = 0; i < K; i++) {
                if (t_count == 0) {
                    break;
                }
                total += first;
                t_count -= 1;
            }
            if (t_count == 0) {
                break;
            }
            total += second;
            t_count -= 1;
        }
        System.out.println(total);
    }
}
