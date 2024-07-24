package advance1;

import java.util.Scanner;

public class Advance7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = n;

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            int prev = 0;
            int[] test = new int[26];

            for (int j = 0; j < str.length(); j++) {
                int c = str.charAt(j);

                if(prev != c){
                    if (test[c - 97] == 0) {
                        test[c - 97]++;
                        prev = c;
                    } else {
                        count--;
                        break;
                    }
                }
            }

        }
        System.out.println(count);
    }
}
