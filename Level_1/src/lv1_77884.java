import java.util.Scanner;

public class lv1_77884 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int answer = 0;
        int divisorNum = 0;

        // left와 right 사이의 수에 대하여 반복
        for (int i=left; i<=right; i++){
            // i의 약수 개수 구하기
            for (int j=1; j<=i; j++){
                if (i % j == 0){
                    divisorNum++;
                }
            }

            // 약수 개수가 짝수면 더하고 홀수면 뺀다
            if (divisorNum % 2 == 0){
                answer += i;
            }
            else{
                answer -= i;
            }

            // 다음 i를 위해 약수 개수 0으로 초기화
            divisorNum = 0;
        }

        // 결과 반환
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int solution(int left, int right) {
        // 변수 선언
        int answer = 0;
        int divisorNum = 0;

        // left와 right 사이의 수에 대하여 반복
        for (int i=left; i<=right; i++){
            // i의 약수 개수 구하기
            for (int j=1; j<=i; j++){
                if (i % j == 0){
                    divisorNum++;
                }
            }

            // 약수 개수가 짝수면 더하고 홀수면 뺀다
            if (divisorNum % 2 == 0){
                answer += i;
            }
            else{
                answer -= i;
            }

            // 다음 i를 위해 약수 개수 0으로 초기화
            divisorNum = 0;
        }

        // 결과 반환
        return answer;
    }
}*/
