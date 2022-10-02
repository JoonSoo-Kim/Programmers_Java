import java.util.*;

public class lv1_42889 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        double[] clearRate = new double[N];
        int clears = 0;
        int[] answers = new int[N];
        int player = stages.length;
        double[][] fail = new double[N][2];

        for(int i=1; i<=N; i++){
            // 전체 플레이어 중 해당 스테이지 클리어 횟수 구하기
            for(int j=0; j<stages.length; j++){
                if(stages[j] > i) {
                    clears++;
                }
            }
            // player가 0인 경우 clears를 0으로 나눌 수 있으므로 이를 처리함
            if (player != 0)
                clearRate[i-1] = 1 - ((double) clears / (double) player);
            else
                clearRate[i-1] = 0;

            // fail에 스테이지 번호와 실패율 추가
            fail[i-1][0] = i;
            fail[i-1][1] = clearRate[i-1];

            // 다음 루프를 위해 변수 초기화
            player = clears;
            clears = 0;
        }
        // fail을 2번째 값을 기준으로 내림차순으로 정렬함
        Arrays.sort(fail, Comparator.comparingDouble((double[] o) -> o[1]).reversed());
        for(int i=0; i<N; i++){
            answers[i] = (int) fail[i][0];
        }
        // 정답 반환
        System.out.println(Arrays.toString(answers));
    }
}
