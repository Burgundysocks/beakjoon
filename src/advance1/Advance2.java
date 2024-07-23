package advance1;

import java.util.Scanner;

public class Advance2 {
    public static void main(String[] args) {
//        킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        Scanner sc = new Scanner(System.in);


        int [] basic = {1, 1, 2, 2, 2, 8};

        int [] qs = new int [6];
        int [] sol = new int[6];

        for (int i = 0; i < qs.length; i++) {
            qs[i] = sc.nextInt();
            if (basic[i] != qs[i] || basic[i] == qs[i]) {
                sol[i]= basic[i] - qs[i];
                System.out.print(sol[i]);
                System.out.print(" ");
            }
        }

    }
}
