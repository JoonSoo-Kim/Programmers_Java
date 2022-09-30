// n - 1의 약수 중 1을 제외하고 가장 작은 수가 x이다.
// 홀수인 경우 무조건 x = 2
import java.util.Scanner;

public class lv1_87389 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // n이 홀수인 경우 2를 리턴
        if (n % 2 == 1){
            System.out.println(2);

        }
        // n이 짝수인 경우
        else {
            for (int i = 3; i <= n - 1; i++) { // 가장 작은 값인 3부터 i를 시작(1은 안되고 2는 홀수에서만 가능)
                if ((n - 1) % i == 0) {        // (n - 1) % i == 0인 경우 i를 리턴
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

/*

class Solution {
    public int solution(int n) {
        if (n % 2 == 1){
            return 2;

        }
        else {
            for (int i = 3; i <= n - 1; i++) {
                if ((n - 1) % i == 0) {
                    return i;
                }
            }
        }
        return 0;
    }
}*/
