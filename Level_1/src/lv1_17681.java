import java.util.Arrays;
import java.util.Scanner;

public class lv1_17681 {
    public static void main(String[] args) {
        // 변수 선언
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String[] arr1Str = new String[n];
        String[] arr2Str = new String[n];
        String[] answer = new String[n];
        String temp;

        // arr1과 arr2를 2진수로 변환해서 arr1Str과 arr2Str에 저장
        for (int i=0; i<n; i++){
            arr1Str[i] = Integer.toBinaryString(arr1[i]);
            arr2Str[i] = Integer.toBinaryString(arr2[i]);
            // 5자리 이하로 값이 나온 경우 앞에 0 추가해서 5자리로 맞춰줌
            while(arr1Str[i].length() < n){
                arr1Str[i] = "0" + arr1Str[i];
            }
            while(arr2Str[i].length() < n){
                arr2Str[i] = "0" + arr2Str[i];
            }
        }

        // arr1Str과 arr2Str을 확인해서 둘 중 하나라도 1이면 #, 아니면 공백
        for (int i=0; i<n; i++){
            temp = "";
            for(int j=0; j<n; j++){
                if (arr1Str[i].charAt(j) == '1' || arr2Str[i].charAt(j) == '1'){
                    temp = temp + "#";
                }
                else{
                    temp = temp + " ";
                }
            }
            System.out.println(temp);
            answer[i] = temp;
        }

        // 정답 반환
        System.out.println(Arrays.toString(answer));
    }
}

/*
프로그래머스 제출 코드
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 변수 선언
        String[] arr1Str = new String[n];
        String[] arr2Str = new String[n];
        String[] answer = new String[n];
        String temp;

        // arr1과 arr2를 2진수로 변환해서 arr1Str과 arr2Str에 저장
        for (int i=0; i<n; i++){
            arr1Str[i] = Integer.toBinaryString(arr1[i]);
            arr2Str[i] = Integer.toBinaryString(arr2[i]);
            // 5자리 이하로 값이 나온 경우 앞에 0 추가해서 5자리로 맞춰줌
            while(arr1Str[i].length() < n){
                arr1Str[i] = "0" + arr1Str[i];
            }
            while(arr2Str[i].length() < n){
                arr2Str[i] = "0" + arr2Str[i];
            }
        }

        // arr1Str과 arr2Str을 확인해서 둘 중 하나라도 1이면 #, 아니면 공백
        for (int i=0; i<n; i++){
            temp = "";
            for(int j=0; j<n; j++){
                if (arr1Str[i].charAt(j) == '1' || arr2Str[i].charAt(j) == '1'){
                    temp = temp + "#";
                }
                else{
                    temp = temp + " ";
                }
            }
            System.out.println(temp);
            answer[i] = temp;
        }

        // 정답 반환
        return answer;
    }
}*/
