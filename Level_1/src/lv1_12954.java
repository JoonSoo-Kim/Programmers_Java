import java.util.Scanner;

public class lv1_12954 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        long[] answer = new long[n];

        // answer[i]에 x를 i + 1번 곱한 값을 할당
        // x를 long으로 해주어야 x가 큰 값이 되어 int의 범위에서 넘을 때도 대비 가능
        for(int i=0; i<n; i++){
            answer[i] = (long) x * (i + 1);
        }

        System.out.println(answer);
    }
}

/*

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++){
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }
}*/
