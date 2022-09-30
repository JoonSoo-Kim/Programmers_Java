// 둘중 큰 값을 w로 하고 작은 값을 h로 했을 때 w의 최대값과 h의 최대값을 곱한 넓이가 최소값이다.
public class lv1_86491 {
    public static void main(String[] args) {
        // 변수 선언
        int[][] sizes ={{60,50}, {30,70}, {60,30}, {80,40}};
        int temp;
        int wMax = 0, hMax = 0;


        for (int i=0; i<sizes.length; i++){
            // 긴 쪽의 길이를 w로 통일함
            if (sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            // wMax값과 hMax값 업데이트
            if (wMax < sizes[i][0])
                wMax = sizes[i][0];
            if (hMax < sizes[i][1])
                hMax = sizes[i][1];
        }

        // 결과 반환
        System.out.println(wMax * hMax);
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public int solution(int[][] sizes) {
        // 변수 선언
        int temp;
        int wMax = 0, hMax = 0;

        for (int i=0; i<sizes.length; i++){
            // 긴 쪽의 길이를 w로 통일함
            if (sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            // wMax값과 hMax값 업데이트
            if (wMax < sizes[i][0])
                wMax = sizes[i][0];
            if (hMax < sizes[i][1])
                hMax = sizes[i][1];
        }

        // 결과 반환
        return wMax * hMax;

    }
}*/
