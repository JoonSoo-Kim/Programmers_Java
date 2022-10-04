import java.util.ArrayList;

public class lv1_64061 {
    public static void main(String[] args) {
        // 변수 선언
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        ArrayList<Integer> basket = new ArrayList<Integer>();
        int basketSize = 0;
        int answer = 0;

        // moves의 아이템으로 반복
        for(int move : moves){
            // move 줄에 있는 인형을 바구니로 옮김
            for(int i=0; i<board.length; i++){
                if (board[i][move-1] != 0){
                    basket.add(board[i][move-1]);
                    basketSize++;
                    board[i][move-1] = 0;
                    break;
                }
            }
            // 바구니에 같은 인형이 2개 들어왔는지 확인
            if (basketSize < 2){
                continue;
            }
            else if((basket.get(basket.size() - 1) == basket.get(basket.size() - 2))){
                answer += 2;
                basket.remove(basket.size() - 1);
                basket.remove(basket.size() - 1);
                basketSize -= 2;
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
    public int solution(int[][] board, int[] moves) {
        // 변수 선언
        ArrayList<Integer> basket = new ArrayList<Integer>();
        int basketSize = 0;
        int answer = 0;

        // moves의 아이템으로 반복
        for(int move : moves){
            // move 줄에 있는 인형을 바구니로 옮김
            for(int i=0; i<board.length; i++){
                if (board[i][move-1] != 0){
                    basket.add(board[i][move-1]);
                    basketSize++;
                    board[i][move-1] = 0;
                    break;
                }
            }
            // 바구니에 같은 인형이 2개 들어왔는지 확인
            if (basketSize < 2){
                continue;
            }
            else if((basket.get(basket.size() - 1) == basket.get(basket.size() - 2))){
                answer += 2;
                basket.remove(basket.size() - 1);
                basket.remove(basket.size() - 1);
                basketSize -= 2;
            }
        }
        // 정답 반환
        return answer;
    }
}*/
