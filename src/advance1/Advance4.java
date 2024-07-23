package advance1;

import java.util.Scanner;

public class Advance4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String a = new StringBuilder(str).reverse().toString();
        if(str.equals(a)) {
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
