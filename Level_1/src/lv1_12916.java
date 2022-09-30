import java.util.Scanner;

public class lv1_12916 {
    public static void main(String[] args) {
        // 변수 선언
        boolean answer = true;
        int pNum = 0, yNum = 0;

        // String n 입력 받고 전부 소문자로 변환
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        // p와 y의 개수 세기
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'p'){
                pNum += 1;
            }
            if (s.charAt(i) == 'y'){
                yNum += 1;
            }
        }

        System.out.println(pNum);
        System.out.println(yNum);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    boolean solution(String s) {
        // 변수 선언
        boolean answer = true;
        int pNum = 0, yNum = 0;

        s = s.toLowerCase();

        // p와 y의 개수 세기
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'p'){
                pNum += 1;
            }
            if (s.charAt(i) == 'y'){
                yNum += 1;
            }
        }

        return pNum == yNum ? true : false;
    }
}*/
