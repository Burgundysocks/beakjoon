package math;

import java.util.Scanner;

public class Math5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int result = 1;

        for(int i = 2; i <= N; i++)
        {
            result = result * i;
        }
        System.out.println(result);

    }
}
