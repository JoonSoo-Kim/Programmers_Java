// 다트 게임

public class lv1_17682 {
    public static void main(String[] args) {
        int answer = 0;
        String dartResult = "1D2S3T*";
        int point = 0;
        int point_ex = 0;

        for(int i=0; i<dartResult.length(); i++) {
            // 숫자인 경우
            try{
                if (0 <= Integer.parseInt(dartResult.substring(i, i+1)) && Integer.parseInt(dartResult.substring(i, i+1)) <= 9) {
                    // 이전 point 값을 answer에 추가하고 새로운 point값을 할당
                    answer += point_ex;
                    point_ex = point;
                    point = Integer.parseInt(dartResult.substring(i, i+1));
                    if (Integer.parseInt(dartResult.substring(i, i+1)) == 1 && Integer.parseInt(dartResult.substring(i+1, i+2)) == 0) {
                        point= 10;
                        i++;
                    }
                }
            } catch(NumberFormatException e){
                // 보너스인 경우
                if (dartResult.charAt(i) == 'S'){
                    continue;
                }
                else if (dartResult.charAt(i) == 'D'){
                    point *= point;
                }
                else if (dartResult.charAt(i) == 'T'){
                    point *= point * point;
                }
                // 옵션인 경우
                else if (dartResult.charAt(i) == '*'){
                    point_ex *= 2;
                    point *= 2;
                }
                else if (dartResult.charAt(i) == '#'){
                    point *= -1;
                }
            }

        }
        // 마지막 값을 더해준다
        answer += point + point_ex;

        // 정답 반환
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int point = 0;
        int point_ex = 0;

        for(int i=0; i<dartResult.length(); i++) {
            // 숫자인 경우
            try{
                if (0 <= Integer.parseInt(dartResult.substring(i, i+1)) && Integer.parseInt(dartResult.substring(i, i+1)) <= 9) {
                    // 이전 point 값을 answer에 추가하고 새로운 point값을 할당
                    answer += point_ex;
                    point_ex = point;
                    point = Integer.parseInt(dartResult.substring(i, i+1));
                    if (Integer.parseInt(dartResult.substring(i, i+1)) == 1 && Integer.parseInt(dartResult.substring(i+1, i+2)) == 0) {
                        point= 10;
                        i++;
                    }
                }
            } catch(NumberFormatException e){
                // 보너스인 경우
                if (dartResult.charAt(i) == 'S'){
                    continue;
                }
                else if (dartResult.charAt(i) == 'D'){
                    point *= point;
                }
                else if (dartResult.charAt(i) == 'T'){
                    point *= point * point;
                }
                // 옵션인 경우
                else if (dartResult.charAt(i) == '*'){
                    point_ex *= 2;
                    point *= 2;
                }
                else if (dartResult.charAt(i) == '#'){
                    point *= -1;
                }
            }

        }
        // 마지막 값을 더해준다
        answer += point + point_ex;

        // 정답 반환
        return answer;
    }
}*/
