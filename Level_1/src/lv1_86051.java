import java.util.Arrays;

public class lv1_86051 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};

        // 0부터 9까지 없는 값을 더하는 것은 45에서 있는 값을 뺴는 것과 같다.
        System.out.println(45 - Arrays.stream(numbers).sum());
    }
}

/*
프로그래머스 제출 코드
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 0부터 9까지 없는 값을 더하는 것은 45에서 있는 값을 뺴는 것과 같다.
        return 45 - Arrays.stream(numbers).sum();
    }
}*/
