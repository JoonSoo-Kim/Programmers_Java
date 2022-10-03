import java.util.Arrays;

public class lv1_42576 {
    public static void main(String[] args) {
        // 변수 선언
        String[] participant = {"A"};
        String[] completion = {};
        String answer = "";
        boolean check = false;
        // 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        // 완주자가 없고 참가자 1명일때
        if (completion.length == 0){
            answer = participant[0];
            check = true;
        }
        // for문 돌려서 participant[i]와 completion[i]가 다르면 answer에 추가
        else{
            for (int i = 0; i < completion.length - 1; i++) {
                if (participant[i].equals(completion[i]) == false) {
                    answer = participant[i];
                    check = true;
                    break;
                }
            }
        }
        // 위 계산을 한 후에 check가 false인 경우(= answer에 값이 들어가지 않은 경우)
        if (check == false){
            answer = participant[completion.length];
        }
        // 정답 반환
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 변수 선언
        String answer = "";
        boolean check = false;
        // 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        // 완주자가 없고 참가자 1명일때
        if (completion.length == 0){
            answer = participant[0];
            check = true;
        }
        else{
            for (int i = 0; i < completion.length; i++) {
                if (participant[i].equals(completion[i]) == false) {
                    answer = participant[i];
                    check = true;
                    break;
                }
            }
        }
        if (check == false){
            answer = participant[completion.length];
        }
        // 정답 반환
        return answer;
    }
}*/
