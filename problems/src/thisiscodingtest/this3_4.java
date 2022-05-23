package thisiscodingtest;

/**
 * N에서 1 을 뺀 후 N이 1이 될때까지 K로 나눈면서 Count 에 1을 더해준다.
 * 
 */

public class this3_4 {
    public static void main(String[] args) {
        int N = 25;
        int K = 5;
        int count = 0;

        N -= 1;

        if (N > K) {
               N = N / K;
               count++;
        }
        System.out.println(count+1);
    }
}
