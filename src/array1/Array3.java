package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];


        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }

        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[n-1];

        System.out.println(a + " " + b);
    }
}
