package String;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) { // 배열의 모든 요소를 -1로 초기화
            arr[i] = -1;  // 각 배열 요소를 -1로 설정, 이는 아직 등장하지 않았음을 의미
        }

        String S = sc.nextLine();

        for(int i = 0; i < S.length(); i++) { // 문자열의 각 문자를 순회
            char ch = S.charAt(i); // 현재 문자를 가져옴

            if(arr[ch - 'a'] == -1) { // 해당 문자가 처음 등장하는 경우에만 위치를 저장
                arr[ch - 'a'] = i; // 문자의 첫 번째 등장 위치를 배열에 저장
            }
        }

        for(int val : arr) { // 배열의 각 요소를 출력
            System.out.print(val + " "); // 배열 요소를 공백으로 구분하여 출력
        }
    }

}
