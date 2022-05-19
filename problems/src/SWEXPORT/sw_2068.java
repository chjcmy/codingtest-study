package SWEXPORT;

import java.io.FileInputStream;
import java.util.Scanner;

public class sw_2068 {
    public static void main(String args[]) throws Exception
    {

        System.setIn(new FileInputStream("./src/2068.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for(int i=0;i <10; ++i) {
                int tmp = sc.nextInt();
                if (sum < tmp) {
                    sum = tmp;
                }
            }
            System.out.printf("#%d %d%n",test_case, sum);
        }
    }
}