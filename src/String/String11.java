package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String11 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;


        while((str=br.readLine())!=null) {
            System.out.println(str);
        }
        br.close();
    }
}