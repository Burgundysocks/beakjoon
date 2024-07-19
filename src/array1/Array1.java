package array1;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] b = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            b[i] = a;
        }
        int c = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(b[i] == c){
                total += 1;
            }
        }
        System.out.println(total);
    }
}
