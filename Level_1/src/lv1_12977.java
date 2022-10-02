import java.util.ArrayList;

public class lv1_12977 {
    public static void main(String[] args) {
        // 변수 선언
        int[] nums = {1,2,7,6,4};
        ArrayList array = new ArrayList();
        int sum, divisor;
        int answer = 0;

        // 숫자 3개 조합
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    // i j k가 서로 같을때만 수행
                    if(((i == j || i == k) || j == k) == false){
                        sum = nums[i] + nums[j] + nums[k];
                        divisor = 0;
                        // sum의 약수 개수 구하기
                        for (int l=3; l<=sum; l++){
                            if (sum % l == 0){
                                divisor++;
                            }
                        }
                        if (divisor == 1){
                            answer++;
                        }
                    }
                }
            }
        }
        // 정답 반환
        System.out.println(answer);
    }
}
