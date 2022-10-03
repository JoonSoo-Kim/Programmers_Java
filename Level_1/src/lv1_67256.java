import java.util.ArrayList;

public class lv1_67256 {
    public static void main(String[] args) {
        // 변수 선언
        int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
        String hand = "right";
        ArrayList<String> aryHand = new ArrayList<String>();
        int[] positionL = {0, 3}, positionR = {2, 3}, positionM = {1, 0}; // 왼손의 위치, 오른손의 위치, 중간에 쳐야할 숫자의 위치
        int lenL = 0, lenR = 0; // 중간에 쳐야할 숫자의 위치에서 떨어진 왼손과 오른손의 거리
        String answer = "";

        for(int i=0; i<numbers.length; i++){
            // 1 4 7일때
            if((numbers[i] == 1 || numbers[i] == 4) || numbers[i] == 7){
                answer = answer + "L";
                positionL[0] = 0; positionL[1] = (int) Math.floor(numbers[i] / 3);
            }
            // 3 6 9일때
            else if((numbers[i] == 3 || numbers[i] == 6) || numbers[i] == 9){
                answer = answer + "R";
                positionR[0] = 2; positionR[1] = (int) Math.floor(numbers[i] / 3) - 1;
            }
            // 2 5 8 0일때
            else if((numbers[i] == 2 || numbers[i] == 5) || (numbers[i] == 8 || numbers[i] == 0)){
                // positionM의 값 변경
                if (numbers[i] != 0)
                    positionM[1] = (int) Math.floor(numbers[i] / 3);
                else
                    positionM[1] = 3;
                // 왼손 거리와 오른손 거리 계산
                lenL = Math.abs(positionM[0] - positionL[0]) + Math.abs(positionM[1] - positionL[1]);
                lenR = Math.abs(positionM[0] - positionR[0]) + Math.abs(positionM[1] - positionR[1]);

                // 왼손이 오른손보다 가깝거나, 동일하지만 왼손잡이인 경우
                if (lenL < lenR || (hand.equals("left") && lenL == lenR)){
                    answer = answer + "L";
                    positionL[0] = positionM[0]; positionL[1] = positionM[1];
                }
                // 오른손이 왼손보다 가깝거나, 동일하지만 오른손잡이인 경우
                else if(lenL > lenR || (hand.equals("right") && lenL == lenR)){
                    answer = answer + "R";
                    positionR[0] = positionM[0]; positionR[1] = positionM[1];
                }
            }
        }
        // 결과 반환
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
import java.util.ArrayList;

class Solution {
    public String solution(int[] numbers, String hand) {
        ArrayList<String> aryHand = new ArrayList<String>();
        int[] positionL = {0, 3}, positionR = {2, 3}, positionM = {1, 0};
        int lenL = 0, lenR = 0;
        String answer = "";

        for(int i=0; i<numbers.length; i++){
            // 1 4 7일때
            if((numbers[i] == 1 || numbers[i] == 4) || numbers[i] == 7){
                answer = answer + "L";
                positionL[0] = 0; positionL[1] = (int) Math.floor(numbers[i] / 3);
            }
            // 3 6 9일때
            else if((numbers[i] == 3 || numbers[i] == 6) || numbers[i] == 9){
                answer = answer + "R";
                positionR[0] = 2; positionR[1] = (int) Math.floor(numbers[i] / 3) - 1;
            }
            // 2 5 8 0일때
            else if((numbers[i] == 2 || numbers[i] == 5) || (numbers[i] == 8 || numbers[i] == 0)){
                if (numbers[i] != 0)
                    positionM[1] = (int) Math.floor(numbers[i] / 3);
                else
                    positionM[1] = 3;

                lenL = Math.abs(positionM[0] - positionL[0]) + Math.abs(positionM[1] - positionL[1]);
                lenR = Math.abs(positionM[0] - positionR[0]) + Math.abs(positionM[1] - positionR[1]);

                if (lenL < lenR || (hand.equals("left") && lenL == lenR)){
                    answer = answer + "L";
                    positionL[0] = positionM[0]; positionL[1] = positionM[1];
                }
                else if(lenL > lenR || (hand.equals("right") && lenL == lenR)){
                    answer = answer + "R";
                    positionR[0] = positionM[0]; positionR[1] = positionM[1];
                }
            }
        }
        return answer;
    }
}*/
