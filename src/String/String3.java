package String;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char [] strArr = str.toCharArray();

            System.out.println(strArr[0] + "" + strArr[strArr.length - 1]);
        }
    }
}
