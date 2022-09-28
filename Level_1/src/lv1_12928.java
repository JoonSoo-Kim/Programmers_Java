import java.util.Scanner;

public class lv1_12928 {
    public static void main(String[] args) {

        // 정답 저장용 변수 선언
        int answer = 0;

        // 정수 n 입력
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // n에 대해 1부터 n까지 mod 연산해서 나머지가 0인 경우 약수로 판단
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                answer += i;
            }
        }

        // 결과 출력
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int solution(int n) {
        int answer = 0;

        // n에 대해 1부터 n까지 mod 연산해서 나머지가 0인 경우 약수로 판단
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                answer += i;
            }
        }

        // 결과 반환
        return answer;
    }
}
*/
