package SWEXPORT;

import java.util.Scanner;

public class sw_1936 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (a) {
            case 1:
                if (b == 2) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            case 2:
                if (b == 1) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            case 3:
                if (b == 2) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
        }
    }
}
