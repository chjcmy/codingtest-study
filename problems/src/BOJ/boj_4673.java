package BOJ;

public class boj_4673 {
    public static void main(String[] args) {
        int[] SelfNumber = new int[10001];
        int count = 1;
        int i ;

        while (count < 10000) {
            int Self = count;
            i = count;
            while (i != 0) {
                Self += i % 10; i /= 10; }
            if (Self < 10000) SelfNumber[Self]++;
            count++; }
        for (int j = 1; j <= 9999; j++) {
            if (SelfNumber[j] == 0) {
                System.out.println(j);
            }
        }
    }
}

