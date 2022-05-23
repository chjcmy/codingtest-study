package thisiscodingtest;

/**
 * 00:00:00 시부터 N:59:59 시까지 N이 나오는 숫자를 출력하라
 * 1. 0시 부터 5시 까지 반복해서 실행 하서 만든다
 * 2. 0분 부터 59분 까지 반복해서 실행 하게 만든다
 * 3. 0초 부터 59초 까지 반복해서 실행 하게 만든다
 * 4. 시,분,초에 5가 있을시 각각 count를 1 증가 시킨다
 */


public class this4_2 {
    public static void main(String[] args) {
        int time = 5;
        int count = 0;
        for (int i = 0; i <= time; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String str = String.format("%02d:%02d:%02d", i, j, k);
                    if (str.contains("5")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
