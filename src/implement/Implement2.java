package implement;

import java.util.Scanner;

public class Implement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            System.out.println(count);
        }
    }
}
