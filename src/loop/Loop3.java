package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
