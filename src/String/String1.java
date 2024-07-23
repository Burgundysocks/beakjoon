package String;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int c = sc.nextInt();
        char [] strArr = str.toCharArray();

        System.out.println(strArr[c-1]);

    }
}
