public class lv1_81301 {
    public static void main(String[] args) {
        // 변수 선언
        String s = "zerozero0threefoureight";
        String[] numString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 1부터 9까지 문자를 숫자로 치환
        for (int i=0; i<10; i++){
            s = s.replaceAll(numString[i], Integer.toString(i));
        }

        // 정답 반환
        System.out.println(Integer.parseInt(s));
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int solution(String s) {
        // 변수 선언
        String[] numString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 1부터 9까지 문자를 숫자로 치환
        for (int i=0; i<10; i++){
            s = s.replaceAll(numString[i], Integer.toString(i));
        }

        // 정답 반환
        return Integer.parseInt(s);
    }
}*/
