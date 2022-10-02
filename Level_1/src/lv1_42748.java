import java.util.Arrays;

public class lv1_42748 {
    public static void main(String[] args) {
        // 변수 선언
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];
        int[] tempArray = new int[array.length];
        int zeroLength = 0;

        // commands 개수만큼 반복
        for (int i=0; i<commands.length; i++){
            // array를 슬라이싱해서 tempArray에 복사하고 tempArray 정렬
            System.arraycopy(array,commands[i][0] - 1 , tempArray, 0, commands[i][1] - commands[i][0] + 1);
            Arrays.sort(tempArray);
            // tempArray가 int 배열이라 동적 배열이 안돼서 0이 섞여있을 수 있으므로 이를 제외하여 answer에 찾는 값 추가
            zeroLength = array.length - (commands[i][1] - commands[i][0] + 1);
            answer[i] = tempArray[zeroLength + commands[i][2] - 1];
            // tempArray 초기화
            tempArray = new int[array.length];
        }
        // 정답 반환
        System.out.println(Arrays.toString(answer));
    }
}

/*
프로그래머스 제출 코드
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 변수 선언
        int[] answer = new int[commands.length];ㅍ
        int[] tempArray = new int[array.length];
        int zeroLength = 0;

        // commands 개수만큼 반복
        for (int i=0; i<commands.length; i++){
            // array를 슬라이싱해서 tempArray에 복사하고 tempArray 정렬
            System.arraycopy(array,commands[i][0] - 1 , tempArray, 0, commands[i][1] - commands[i][0] + 1);
            Arrays.sort(tempArray);
            // tempArray가 int 배열이라 동적 배열이 안돼서 0이 섞여있을 수 있으므로 이를 제외하여 answer에 찾는 값 추가
            zeroLength = array.length - (commands[i][1] - commands[i][0] + 1);
            answer[i] = tempArray[zeroLength + commands[i][2] - 1];
            // tempArray 초기화
            tempArray = new int[array.length];
        }
        // 정답 반환
        return answer;
    }
}*/
