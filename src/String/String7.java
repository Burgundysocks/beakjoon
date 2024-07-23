package String;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.next();

            for(int j = 0; j < b.length(); j++) {
                for(int k = 0; k < a; k++) {	// R 만큼 반복 출력
                    System.out.print(b.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
