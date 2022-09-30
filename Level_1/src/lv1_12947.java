import java.util.Scanner;

public class lv1_12947 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;

        // x의 자릿수를 구해서 sum에 더함
        String xString = Integer.toString(x);
        for(int i=0; i<xString.length(); i++){
            sum += Character.getNumericValue(xString.charAt(i));
        }

        // 정답 출력
        System.out.println(x % sum == 0 ? true : false);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public boolean solution(int x) {
        // 변수 선언
        int sum = 0;

        // x의 자릿수를 구해서 sum에 더함
        String xString = Integer.toString(x);
        for(int i=0; i<xString.length(); i++){
            sum += Character.getNumericValue(xString.charAt(i));
        }

        // 정답 출력
        return x % sum == 0 ? true : false;
    }
}
*/
