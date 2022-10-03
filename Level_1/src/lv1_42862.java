import java.util.ArrayList;

public class lv1_42862 {
    public static void main(String[] args) {
        // 변수 선언
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
        int answer = n - lost.length;
        ArrayList<Integer> aryLost = new ArrayList<Integer>();
        ArrayList<Integer> aryRes = new ArrayList<Integer>();
        // ArrayList에 배열 복사
        for (int item : lost) {
            aryLost.add(item);
        }
        for (int item : reserve) {
            // aryLost와 aryRes에 같이 존재하는 경우 제거하고 answer 1 추가
            if(aryLost.indexOf(item) != -1){
                aryLost.remove(aryLost.indexOf(item));
                answer++;
            }
            else{
                aryRes.add(item);
            }
        }


        //1부터 n까지 돌렸을 때 aryLost에 i가 있으면
        for(int i=1; i<=n; i++) {
            if(aryLost.indexOf(i) != -1) {
                // aryRes에 i-1 또는 i+1이 있을 때 이를 제거하고 answer에 1 추가
                if(aryRes.indexOf(i-1) != -1){
                    answer++;
                    aryRes.remove(aryRes.indexOf(i-1));
                }
                else if(aryRes.indexOf(i+1) != -1){
                    answer++;
                    aryRes.remove(aryRes.indexOf(i+1));
                }
            }
        }
        // 정답 반환
        System.out.println(answer);
    }
}
/*
프로그래머스 제출 코드
import java.util.ArrayList;


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 변수 선언
        int answer = n - lost.length;
        ArrayList<Integer> aryLost = new ArrayList<Integer>();
        ArrayList<Integer> aryRes = new ArrayList<Integer>();
        // ArrayList에 배열 복사
        for (int item : lost) {
            aryLost.add(item);
        }
        for (int item : reserve) {
            // aryLost와 aryRes에 같이 존재하는 경우 제거하고 answer 1 추가
            if(aryLost.indexOf(item) != -1){
                aryLost.remove(aryLost.indexOf(item));
                answer++;
            }
            else{
                aryRes.add(item);
            }
        }


        //1부터 n까지 돌렸을 때 aryLost에 i가 있으면
        for(int i=1; i<=n; i++) {
            if(aryLost.indexOf(i) != -1) {
                // aryRes에 i-1 또는 i+1이 있을 때 이를 제거하고 answer에 1 추가
                if(aryRes.indexOf(i-1) != -1){
                    answer++;
                    aryRes.remove(aryRes.indexOf(i-1));
                }
                else if(aryRes.indexOf(i+1) != -1){
                    answer++;
                    aryRes.remove(aryRes.indexOf(i+1));
                }
            }
        }
        // 정답 반환
        return answer;
    }
}*/
