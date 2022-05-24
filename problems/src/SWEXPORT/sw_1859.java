package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 성현이가 사재기를 연속된 N일 동안 매매가를 예측 하고 사재기로 수익을 최대한 볼수있도록 도와줘야된다
 *
 * 1. 사재기 할 일수를 D 일로 정한다.
 * 2. 마지막 사재기 한 날 부터 맥스 를 저장한다
 * 3. 사재기 한 날과 맥스 배열 비교후 맥스 보다 사재기한 날 원료가 쌀 경우 맥스 수에 사재기한날의 원료를 빼준뒤 Sum 에 저장 한다
 * 4. sum 을 마지막에 프린트 해준다
 */

public class sw_1859 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1859.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
        for(int t=1; t<=T; t++) {
            int i, N = sc.nextInt();
            int nums[] = new int[N];
            int maxs[] = new int[N];
            for(i=0; i<N; i++) {
                nums[i] = sc.nextInt();
                System.out.format( "#%d %d\n", t, 0 );
                continue;
            }
            int max = 0;
            for(i=N-1; i>=0; i--) {
                if( nums[i] > max ) max = nums[i];
                maxs[i] = max;
            }
            long sum = 0;
            for(i=0; i<N; i++) sum += maxs[i] - nums[i];
            System.out.format( "#%d %d\n", t, sum );
        }
    }
}