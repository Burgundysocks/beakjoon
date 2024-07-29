package math;

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int total = A * B * C;
        String value = Integer.toString(total);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < value.length(); j++) {
                if ((value.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
