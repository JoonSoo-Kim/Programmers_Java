public class lv1_42840 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        // 1번 2번 3번의 답안지
        int[] ary1 = {1,2,3,4,5};
        int[] ary2 = {2,1,2,3,2,4,2,5};
        int[] ary3 = {3,3,1,1,2,2,4,4,5,5,};
        // 답 개수
        int answer1 = 0, answer2 = 0, answer3 = 0;

        //
        for (int i=0; i<answers.length; i++){
            if (answers[i] == ary1[i % ary1.length])
                answer1 += 1;
            if (answers[i] == ary2[i % ary2.length])
                answer2 += 1;
            if (answers[i] == ary3[i % ary3.length])
                answer3 += 1;
        }

        if(answer1 > answer2 && answer1 > answer3){
            int[] answer = {1};
            System.out.println(answer);
        }
        else if(answer2 > answer1 && answer2 > answer3){
            int[] answer = {2};
            System.out.println(answer);
        }
        else if(answer3 > answer1 && answer3 > answer2){
            int[] answer = {3};
            System.out.println(answer);
        }
        else if(answer1 == answer2 && answer2 == answer3){
            int[] answer = {1,2,3};
            System.out.println(answer);
        }
        else if(answer1 == answer2 && answer1 > answer3){
            int[] answer = {1,2};
            System.out.println(answer);
        }
        else if(answer1 == answer3 && answer1 > answer2){
            int[] answer = {1,3};
            System.out.println(answer);
        }
        else if(answer2 == answer3 && answer2 > answer1){
            int[] answer = {2,3};
            System.out.println(answer);
        }
        else{
            int[] answer = {};
            System.out.println(answer);
        }
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int[] solution(int[] answers) {
        // 1번 2번 3번의 답안지
        int[] ary1 = {1,2,3,4,5};
        int[] ary2 = {2,1,2,3,2,4,2,5};
        int[] ary3 = {3,3,1,1,2,2,4,4,5,5,};
        // 답 개수
        int answer1 = 0, answer2 = 0, answer3 = 0;

        //
        for (int i=0; i<answers.length; i++){
            if (answers[i] == ary1[i % ary1.length])
                answer1 += 1;
            if (answers[i] == ary2[i % ary2.length])
                answer2 += 1;
            if (answers[i] == ary3[i % ary3.length])
                answer3 += 1;
        }

        if(answer1 > answer2 && answer1 > answer3){
            int[] answer = {1};
            return answer;
        }
        else if(answer2 > answer1 && answer2 > answer3){
            int[] answer = {2};
            return answer;
        }
        else if(answer3 > answer1 && answer3 > answer2){
            int[] answer = {3};
            return answer;
        }
        else if(answer1 == answer2 && answer2 == answer3){
            int[] answer = {1,2,3};
            return answer;
        }
        else if(answer1 == answer2 && answer1 > answer3){
            int[] answer = {1,2};
            return answer;
        }
        else if(answer1 == answer3 && answer1 > answer2){
            int[] answer = {1,3};
            return answer;
        }
        else if(answer2 == answer3 && answer2 > answer1){
            int[] answer = {2,3};
            return answer;
        }
        else{
            int[] answer = {};
            return answer;
        }
    }
}*/
