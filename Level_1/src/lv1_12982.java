import java.util.Arrays;
import java.util.Scanner;

public class lv1_12982 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        int[] d = {1,3,2,5,4};
        int result = 0;

        // 배열 d를 정렬
        Arrays.sort(d);

        // budget에서 가장 작은 d의 아이템부터 빼고 개수 1개 추가
        for (int i=0; i<d.length; i++){
            if(budget >= d[i]){
                budget -= d[i];
                result++;
            }
            else{
                break;
            }
        }

        // 정답 반환
        System.out.println(result);

     }
}

/*
프로그래머스 제출 코드
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        // 변수 선언
        int result = 0;

        // 배열 d를 정렬
        Arrays.sort(d);

        // budget에서 가장 작은 d의 아이템부터 빼고 개수 1개 추가
        for (int i=0; i<d.length; i++){
            if(budget >= d[i]){
                budget -= d[i];
                result++;
            }
            else{
                break;
            }
        }

        // 정답 반환
        return result;
    }
}*/
