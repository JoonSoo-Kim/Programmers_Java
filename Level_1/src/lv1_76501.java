public class lv1_76501 {
    public static void main(String[] args) {
        // 변수 선언
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int answer = 0;

        // signs값에 따라 answer에 solution 값 계산
        for (int i=0; i<absolutes.length; i++){
            if (signs[i] == true){
                answer += absolutes[i];
            }
            else{
                answer -= absolutes[i];
            }
        }
        // 결과 반환
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        // 변수 선언
        int answer = 0;

        // signs값에 따라 answer에 solution 값 계산
        for (int i=0; i<absolutes.length; i++){
            if (signs[i] == true){
                answer += absolutes[i];
            }
            else{
                answer -= absolutes[i];
            }
        }
        // 결과 반환
        return answer;
    }
}*/
