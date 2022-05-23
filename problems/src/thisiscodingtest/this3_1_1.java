package thisiscodingtest;

/**
 * 거스름돈으로 줄 수 있는 동전이 500원과 100원, 50, 10 이 있다 소님에게 거슬러줘야 할돈이 n 일 경우 최소 개수를 구하라
 * 1. 거스름돈으로 줄 수 있는 동전을 배열을 만든다
 * 2. 거스름돈으로 줄 수 있는 동전의 제일 큰수 부터 거스름돈을 나눈 뒤 몫을 동전 량 만큼 추가한다
 * 3. 거스름 돈을 거스름돈오로 줄 수 있는 동전으로 나눈 나머지 값으로 만든다.
 * 4. 그 뒤 배열 수 만큼 반복 하게 만든다.
 */

public class this3_1_1 {
    public static void main(String[] args) {
        int test = 1260;
        int coin_arr[] = {500, 100, 50, 10};
        int count = 0;
        for (int i = 0; i < coin_arr.length; i++) {
            int coin = coin_arr[i];
            count += test / coin;
            test = test % coin;
        }
        System.out.println(count);
    }
}
