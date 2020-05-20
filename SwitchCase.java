import java.sql.SQLOutput;

import java.util.Scanner;
public class SwitchCase {
    public static String swapCase(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                s = s.replace(c, Character.toUpperCase(c));
            } else {
                s=s.replace(c, Character.toLowerCase(c));

            }

        }
            return s;
    }
    public static void main(String[]args){

        System.out.println("welocme".replace("e","E"));
        System.out.print("Enter a String:");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        System.out.println(swapCase(line));
    }
}

