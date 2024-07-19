package array1;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];

        for (int i = 0; i < 9; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        int count = 0;
        int max = 0;
        int index = 0;

        for(int value : arr){
            count ++;
            if(value > max) {
                max = value;
                index = count;
            }
        }
        System.out.print(max + "\n" + index);




    }
}
