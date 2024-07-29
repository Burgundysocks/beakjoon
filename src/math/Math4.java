package math;

import java.util.Scanner;

public class Math4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr;
        int num = in.nextInt();

        for(int i = 0 ; i < num ; i++) {

            int N = in.nextInt();
            arr = new int[N];

            double sum = 0;

            for(int j = 0 ; j < N ; j++) {
                int val = in.nextInt();
                arr[j] = val;
                sum += val;
            }

            double avr = (sum / N) ;
            double count = 0;

            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > avr) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }

}