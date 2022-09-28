import java.util.Scanner;

public class lv1_12931 {
    public static void main(String[] args) {

        // 정답 저장용 변수 선언
        int answer = 0;

        // 정수 n 입력
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 정수 n을 String으로 변환한 후, String의 각 인덱스의 char를 int로 다시 변환해서 answer에 더함
        String nString = Integer.toString(n);
        for (int i = 0; i < nString.length(); i++){
            System.out.println(Character.getNumericValue(nString.charAt(i)));
            answer += Character.getNumericValue(nString.charAt(i));
        }

        // 결과 출력
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
import java.util.*;

public class Solution {
    public int solution(int n) {
        // 정답 저장용 변수 선언
        int answer = 0;

        // 정수 n을 String으로 변환한 후, String의 각 인덱스의 char를 int로 다시 변환해서 answer에 더함
        String nString = Integer.toString(n);
        for (int i = 0; i < nString.length(); i++){
            System.out.println(Character.getNumericValue(nString.charAt(i)));
            answer += Character.getNumericValue(nString.charAt(i));
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
*/
