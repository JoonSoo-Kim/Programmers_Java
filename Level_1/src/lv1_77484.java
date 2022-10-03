import java.util.ArrayList;
import java.util.Arrays;

public class lv1_77484 {
    public static void main(String[] args) {
        // 변수 선언
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};
        int numOfWin = 0, numOfZero = 0;
        ArrayList<Integer> aryWin = new ArrayList<Integer>();
        // indexOf를 쓰기 위해 ArrayList에 win_nums 값 복사
        for (int item : win_nums) {
            aryWin.add(item);
        }
        // lottos[i]가 aryWin 안에 있거나 0인 경우 변수 값 추가
        for(int i=0; i<6; i++){
            if(aryWin.indexOf(lottos[i]) != -1){
                numOfWin++;
            }
            else if(lottos[i] == 0){
                numOfZero++;
            }
        }
        // 등수 = 7 - 맞춘 개수이다.
        // 따라서 최대 등수는 7 - (정답 개수 + 0의 개수), 최소 등수는 7 - 정답 개수이다.
        int[] answer = {7 - (numOfWin + numOfZero), 7 - numOfWin};
        // 이때 정답개수 0개, 0의 개수 0개로 존재하지 않는 7등이 나올 수 있으므로 예외 처리 한다.
        if (answer[0] == 7){
            answer[0] = 6;
        }
        if (answer[1] == 7){
            answer[1] = 6;
        }
        // 정답 반환
        System.out.println(Arrays.toString(answer));
    }
}
/*
프로그래머스 제출 코드
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 변수 선언
        int numOfWin = 0, numOfZero = 0;
        ArrayList<Integer> aryWin = new ArrayList<Integer>();
        // indexOf를 쓰기 위해 ArrayList에 win_nums 값 복사
        for (int item : win_nums) {
            aryWin.add(item);
        }
        // lottos[i]가 aryWin 안에 있거나 0인 경우 변수 값 추가
        for(int i=0; i<6; i++){
            if(aryWin.indexOf(lottos[i]) != -1){
                numOfWin++;
            }
            else if(lottos[i] == 0){
                numOfZero++;
            }
        }
        // 등수 = 7 - 맞춘 개수이다.
        // 따라서 최대 등수는 7 - (정답 개수 + 0의 개수), 최소 등수는 7 - 정답 개수이다.
        int[] answer = {7 - (numOfWin + numOfZero), 7 - numOfWin};
        // 이때 정답개수 0개, 0의 개수 0개로 존재하지 않는 7등이 나올 수 있으므로 예외 처리 한다.
        if (answer[0] == 7){
            answer[0] = 6;
        }
        if (answer[1] == 7){
            answer[1] = 6;
        }
        // 정답 반환
        return answer;
    }
}*/
