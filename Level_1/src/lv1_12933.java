import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class lv1_12933 {
    public static void main(String[] args) {
        // 변수 선언
        long answer = 0;
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        ArrayList<Integer> list = new ArrayList<Integer>();

        // list에 n의 자리수를 넣은 후 정렬
        String nString = Long.toString(n);
        for (int i=0; i < nString.length(); i++){
            list.add(Character.getNumericValue(nString.charAt(i)));
        }
        list.sort(Comparator.reverseOrder());

        // list의 각 자리수에 10의 list.size - i -1제곱을 곱해서 정수로 만듬
        for (int i=0; i<list.size(); i++){
            answer += list.get(i) * Math.pow(10, list.size() - i -1);
        }

        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
        import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.Scanner;

class Solution {
    public long solution(long n) {
        // 변수 선언
        long answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        // list에 n의 자리수를 넣은 후 정렬
        String nString = Long.toString(n);
        for (int i=0; i < nString.length(); i++){
            list.add(Character.getNumericValue(nString.charAt(i)));
        }
        list.sort(Comparator.reverseOrder());

        // list의 각 자리수에 10의 list.size - i -1제곱을 곱해서 정수로 만듬
        for (int i=0; i<list.size(); i++){
            answer += list.get(i) * Math.pow(10, list.size() - i -1);
        }
        return answer;
    }
}*/
