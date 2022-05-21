package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw_2043 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/2043.txt"));

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;
         while (a != b) {
            count += 1;
            b += 1;
        }
        System.out.println(count);
    }
}
