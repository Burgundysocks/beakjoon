package math;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int copy = num; // 초기 숫자를 저장
        int count = 0;

        do {
            int n = num / 10; // 10의 자리 숫자
            int m = num % 10; // 1의 자리 숫자
            int sum = n + m;
            num = m * 10 + sum % 10; // 새로운 숫자
            count++;
        } while(num != copy); // 원래 숫자로 돌아올 때까지 반복

        System.out.println(count);
    }
}
