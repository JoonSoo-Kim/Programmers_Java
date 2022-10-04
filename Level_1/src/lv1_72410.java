import java.util.ArrayList;

public class lv1_72410 {
    public static void main(String[] args) {
        String new_id = "123_.def";
        ArrayList<Character> idList = new ArrayList<>();
        int charAscii = 0;
        String answer = "";

        // 1단계
        new_id = new_id.toLowerCase();

        for(int i=0; i<new_id.length(); i++){
            // 2단계
            charAscii = (int) new_id.charAt(i);
            if ((97 <= charAscii) && (charAscii <= 122)){
                idList.add(new_id.charAt(i));
            }
            else if((48 <= charAscii) && (charAscii <= 57)){
                idList.add(new_id.charAt(i));
            }
            else if((charAscii == 45 || charAscii == 46) || charAscii == 95){
                idList.add(new_id.charAt(i));
            }
            // 3단계
            // idList의 마지막 2개가 .인 경우 마지막 .을 제거해서 1개로 만듬
            if(idList.size() >= 2){
                if((idList.get(idList.size() - 1) == '.' ) && (idList.get(idList.size() - 2) == '.' )){
                    idList.remove(idList.size() - 1);
                }
            }
        }
        // 4단계
        if(idList.size() >= 1){
            if (idList.get(0) == '.'){
                idList.remove(0);
            }
        }
        if(idList.size() >= 1){
            if (idList.get(idList.size() - 1) == '.' ){
                idList.remove(idList.size() - 1);
            }
        }

        // 5단계
        if(idList.size() == 0){
            idList.add('a');
        }
        // 6단계
        while(idList.size() > 15){
            idList.remove(idList.size() - 1);
        }
        if (idList.get(idList.size() - 1) == '.' ){
            idList.remove(idList.size() - 1);
        }
        // 7단계
        while(idList.size() < 3){
            idList.add(idList.get(idList.size() - 1));
        }
        // 리스트에 저장된 id를 String 1개로 합침
        for(char ch : idList){
            answer = answer.concat(Character.toString(ch));
        }
        // 정답 반환
        System.out.println(answer);
    }
}

/*
프로그래머스 제출 코드
import java.util.ArrayList;

class Solution {
    public String solution(String new_id) {
        ArrayList<Character> idList = new ArrayList<>();
        int charAscii = 0;
        String answer = "";

        // 1단계
        new_id = new_id.toLowerCase();

        for(int i=0; i<new_id.length(); i++){
            // 2단계
            charAscii = (int) new_id.charAt(i);
            if ((97 <= charAscii) && (charAscii <= 122)){
                idList.add(new_id.charAt(i));
            }
            else if((48 <= charAscii) && (charAscii <= 57)){
                idList.add(new_id.charAt(i));
            }
            else if((charAscii == 45 || charAscii == 46) || charAscii == 95){
                idList.add(new_id.charAt(i));
            }
            // 3단계
            // idList의 마지막 2개가 .인 경우 마지막 .을 제거해서 1개로 만듬
            if(idList.size() >= 2){
                if((idList.get(idList.size() - 1) == '.' ) && (idList.get(idList.size() - 2) == '.' )){
                    idList.remove(idList.size() - 1);
                }
            }
        }
        // 4단계
        if(idList.size() >= 1){
            if (idList.get(0) == '.'){
                idList.remove(0);
            }
        }
        if(idList.size() >= 1){
            if (idList.get(idList.size() - 1) == '.' ){
                idList.remove(idList.size() - 1);
            }
        }

        // 5단계
        if(idList.size() == 0){
            idList.add('a');
        }
        // 6단계
        while(idList.size() > 15){
            idList.remove(idList.size() - 1);
        }
        if (idList.get(idList.size() - 1) == '.' ){
            idList.remove(idList.size() - 1);
        }
        // 7단계
        while(idList.size() < 3){
            idList.add(idList.get(idList.size() - 1));
        }
        // 리스트에 저장된 id를 String 1개로 합침
        for(char ch : idList){
            answer = answer.concat(Character.toString(ch));
        }
        // 정답 반환
        return answer;

    }
}*/
