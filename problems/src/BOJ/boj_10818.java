package BOJ;

import java.util.Scanner;

//********************************
//해결 방법 : 먼저 들어온 N 이라는 정수를 이용하여 N에 맞게 배열을 만든 뒤
//           N의 수 만큼 배열에 값을 채워준 뒤 하나씩 비교하여 제일 큰 값을 저장한다
//           이 후 저장한 값을 출력한다
//********************************
public class boj_10818 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int j=0; j<a; j++){
            if(arr[j] > max){
                max = arr[j];
            }
            if(arr[j] < min){
                min = arr[j];
            }
        }

        System.out.print(min+" "+max);

    }
}
