import java.util.Scanner;

public class lv1_68935 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 10진수를 3진수로 바꿔서 String으로 변환
        String nString = Integer.toString(n, 3);

        // StringBuffer 변수를 선언해서 reverse() 메서드로 뒤집음
        StringBuffer sb = new StringBuffer(nString);
        nString = sb.reverse().toString();

        // 3진수 숫자 String을 int로 변환
        int result = Integer.parseInt(nString, 3);

        // 결과 반환
        System.out.println(result);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int solution(int n) {
        // 10진수를 3진수로 바꿔서 String으로 변환
        String nString = Integer.toString(n, 3);

        // StringBuffer 변수를 선언해서 reverse() 메서드로 뒤집음
        StringBuffer sb = new StringBuffer(nString);
        nString = sb.reverse().toString();

        // 3진수 숫자 String을 int로 변환
        int result = Integer.parseInt(nString, 3);

        // 결과 반환
        return result;
    }
}*/
