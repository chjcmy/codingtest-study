package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class sw_2058 {
    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("./src/2058.txt"));

        Scanner sc = new Scanner(System.in);
        String T;
        T = sc.nextLine();

        char[] arr = T.toCharArray();
        int sum = 0;
        for (int i = 0; i < T.length(); i++) {
            sum += Character.getNumericValue(arr[i]);
        }
        System.out.printf("%d\n", sum);
    }
}
