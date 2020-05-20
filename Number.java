import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Number {
    public static int getNumber(char ch ) {
        if (ch >= 'A' && ch <= 'C') {
            return 2;
        } else if ( ch>= 'D' && ch <= 'F') {
            return 3;
        } else if ( ch>= 'G' && ch <= 'I') {
            return 4;
        } else if (ch >= 'J' && ch <= 'L') {
            return 5;
        } else if (ch >= 'M' &&  ch<= 'O') {
            return 6;
        } else if ( ch>= 'P' && ch <= 'S') {
            return 7;
        } else if (ch >= 'T' && ch <= 'V') {
            return 8;
        } else if (ch >= 'W' && ch <= 'Z') {
            return 9;
        } else {
            return  - '0';
        }
    }

    public static void main(String[] args) {
       
        System.out.print("Enter a string:");
        Scanner input = new Scanner(System.in);
        String number = input.next();
        String result = "";
        for(int i=0;i<number.length();i++){
            if(Character.toUpperCase(number.charAt(i))>='A'&& Character.toUpperCase(number.charAt(i))<='Z') {
                result += getNumber(Character.toUpperCase(number.charAt(i)));
            }
            else{
                result +=number.charAt(i);

            }


        }

        System.out.println(result);


    }


}