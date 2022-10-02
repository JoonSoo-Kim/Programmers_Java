import java.util.HashSet;

public class lv1_1845 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : nums){
           set.add(i);
        }

        System.out.println(set.size() > nums.length / 2 ? nums.length / 2 : set.size());
    }
}

/*
프로그래머스 제출 코드
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : nums){
            set.add(i);
        }

        return set.size() > nums.length / 2 ? nums.length / 2 : set.size();
    }
}*/
