public class lv1_70128 {
    public static void main(String[] args) {
        // 변수 선언
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        int answer = 0;

        // i번째 a와 b를 곱해서 answer에 더함
        for (int i=0; i<a.length; i++){
            answer += a[i] * b[i];
        }

        // 정답 반환
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int solution(int[] a, int[] b) {
        // 변수 선언
        int answer = 0;

        // i번째 a와 b를 곱해서 answer에 더함
        for (int i=0; i<a.length; i++){
            answer += a[i] * b[i];
        }

        // 정답 반환
        return answer;
    }
}*/
