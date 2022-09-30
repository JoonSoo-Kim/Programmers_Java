import java.util.Scanner;

public class lv1_82612 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int money = scanner.nextInt();
        int count = scanner.nextInt();
        long answer = 0;

        // 이용 금액 계산
        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }

        // 현재 금액이 이용금액보다 큰 경우와 작은 경우 나눠서 정답 반환
        System.out.println(money > answer ? 0 : answer - money);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public long solution(int price, int money, int count) {
        // 변수 선언
        long answer = 0;

        // 이용 금액 계산
        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }

        // 현재 금액이 이용금액보다 큰 경우와 작은 경우 람다로 나눠서 정답 반환
        return money > answer ? 0 : answer - money;
    }
}*/
