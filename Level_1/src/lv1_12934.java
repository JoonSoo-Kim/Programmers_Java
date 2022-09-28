import java.util.Scanner;

public class lv1_12934 {
    public static void main(String[] args) {

        // 정답 저장용 변수 선언
        long answer = 0;

        // long 변수 n 입력
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        // temp를 n의 제곱근으로 선언함. 이때 n이 제곱수인 경우 소수점이 없고, 제곱수가 아닌 경우 소수점이 있다.
        double temp = Math.sqrt(n);
        if (temp % ((long) temp) == 0){            // 소수점이 없는 경우 (long) temp로 정수로 만들어서 mod 연산을 하면 0이 나온다.
            answer = (long) Math.pow(temp + 1, 2); // n의 제곱근에 1을 더해서 제곱한 후 double형 변수를 long형 변수로 변환한다.
        }
        else{
            answer = -1;
        }

        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public long solution(long n) {
        // 정답 저장용 변수 선언
        long answer = 0;

        // temp를 n의 제곱근으로 선언함. 이때 n이 제곱수인 경우 소수점이 없고, 제곱수가 아닌 경우 소수점이 있다.
        double temp = Math.sqrt(n);
        if (temp % ((long) temp) == 0){            // 소수점이 없는 경우 (long) temp로 정수로 만들어서 mod 연산을 하면 0이 나온다.
            answer = (long) Math.pow(temp + 1, 2); // n의 제곱근에 1을 더해서 제곱한 후 double형 변수를 long형 변수로 변환한다.
        }
        else{
            answer = -1;
        }

        return answer;
    }
}
*/
