import java.util.Scanner;

public class lv1_12932 {
    public static void main(String[] args) {

        // long형 정수 n 입력
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        // n을 long에서 String으로 변환한 nString 선언
        String nString = Long.toString(n);

        // 정답 저장용 변수를 nString의 length만큼 크기를 갖게 선언
        int[] answer = new int[nString.length()];

        // nString[i-1]의 값을 answer[nString.length - i]에 할당
        // 값을 거꾸로 할당하는 것
        for (int i = nString.length(); i >= 1; i--){
            System.out.println(i);
            answer[nString.length()-i] = Character.getNumericValue(nString.charAt(i - 1));
        }

        // 정답 반환
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int[] solution(long n) {
        // n을 long에서 String으로 변환한 nString 선언
        String nString = Long.toString(n);

        // 정답 저장용 변수를 nString의 length만큼 크기를 갖게 선언
        int[] answer = new int[nString.length()];

        // nString[i-1]의 값을 answer[nString.length - i]에 할당
        // 값을 거꾸로 할당하는 것
        for (int i = nString.length(); i >= 1; i--){
            System.out.println(i);
            answer[nString.length()-i] = Character.getNumericValue(nString.charAt(i - 1));
        }

        // 정답 반환
        return answer;
    }
}
*/
