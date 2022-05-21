package SWEXPORT;

import java.io.FileInputStream;
import java.util.Scanner;

public class sw_2029 {
    public static void main(String args[]) throws Exception
    {

        System.setIn(new FileInputStream("./src/2029.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.printf("#%d %d %d\n", test_case, a / b, a % b);
        }
    }
}
