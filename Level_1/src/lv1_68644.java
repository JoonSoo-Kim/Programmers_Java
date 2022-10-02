import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lv1_68644 {
    public static void main(String[] args) {
        // 변수 선언
        int[] numbers = {2,1,3,4,1};
        ArrayList<Integer> ary = new ArrayList<>();
        int sum;

        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length; j++){
                // 같은 수를 2번 더하지 않게 함
                if (i == j){
                    sum = -1;
                    continue;
                }
                // i번째와 j번째를 더해서 sum에 넣음
                else{
                    sum = numbers[i] + numbers[j];
                }
                // i와 j가 같은수가 아니면서, ary에 sum이 없어야 함
                if (sum != -1 && ary.contains(sum) == false){
                    ary.add(sum);
                }
            }
        }
        // ArrayList ary 정렬
        Collections.sort(ary);

        // Integer를 담고 있는 ary의 element을 int형 배열 answer에 옮김
        int[] answer = new int[ary.size()];
        for (int i=0; i<ary.size(); i++){
            answer[i] = (int) ary.get(i);
        }

        // 결과 반환
        System.out.println(Arrays.toString(answer));
    }
}
/*
프로그래머스 제출 코드
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        // 변수 선언
        ArrayList<Integer> ary = new ArrayList<>();
        int sum;

        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length; j++){
                // 같은 수를 2번 더하지 않게 함
                if (i == j){
                    sum = -1;
                    continue;
                }
                // i번째와 j번째를 더해서 sum에 넣음
                else{
                    sum = numbers[i] + numbers[j];
                }
                // i와 j가 같은수가 아니면서, ary에 sum이 없어야 함
                if (sum != -1 && ary.contains(sum) == false){
                    ary.add(sum);
                }
            }
        }
        // ArrayList ary 정렬
        Collections.sort(ary);

        // Integer를 담고 있는 ary의 element을 int형 배열 answer에 옮김
        int[] answer = new int[ary.size()];
        for (int i=0; i<ary.size(); i++){
            answer[i] = (int) ary.get(i);
        }

        // 결과 반환
        return answer;
    }
}*/
