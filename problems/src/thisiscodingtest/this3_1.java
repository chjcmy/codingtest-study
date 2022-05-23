package thisiscodingtest;

import java.util.Scanner;

public class this3_1 {
    public static void main(String[] args) {

        int coin_type[] = {500, 100, 50, 10};

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int count = 0;

        for (int i = 0; i < coin_type.length; i++) {

            int coin = coin_type[i];
            count += T /coin;
                    T %= coin;
        }
        System.out.println(count);
    }
}
