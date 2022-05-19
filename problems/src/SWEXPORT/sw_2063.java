package SWEXPORT;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class sw_2063 {
    public static void main(String args[]) throws Exception
    {

        System.setIn(new FileInputStream("./src/2063.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

            int[] arr = new int[T];
            for(int i=0;i <T; ++i) {
                int tmp = sc.nextInt();
                arr[i] = tmp;
            }
            Arrays.sort(arr);
        System.out.printf("%d\n", arr[arr.length / 2]);
    }
}