package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class sw_1204 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1204.txt"));

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            int N = sc.nextInt();

            int[] count = new int[101];

            int result = 0;

            int maxPeople = 0;

            for (int j = 0; j < 1000; j++) {
                int a = sc.nextInt();
                count[a]++;
            }

            for (int j = 0; j < count.length; j++) {
                if(maxPeople <= count[j]) {
                    maxPeople = count[j];
                    result = j;
                }
            }
            System.out.printf("#%d %d\n", N, result);
        }
    }
}
