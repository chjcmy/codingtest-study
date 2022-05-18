package BOJ;

// 행결방법 : 9개의 배열을 만든뒤 배열만큼 9개의 인수를 배열에 저장뒤
// 제일큰수와 제일 큰수를 가지고 있는 위치를 저장한뒤 출력한다

import java.util.Scanner;

public class boj_2562 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0 ; i < 9 ; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int sortNum = 0;

        for(int j=0; j<arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
                sortNum = j+1;
            }
        }

        System.out.println(max);
        System.out.println(sortNum);

    }
}
