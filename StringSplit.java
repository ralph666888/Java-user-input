import java.util.*;
public class StringSplit {
    public static String[] split(String s, String regex){
        String[] tokens = s.split(regex);
        String[] afterSplit = new String[2 * tokens.length-1];
        for(int i = 0; i < tokens.length; i++){
            afterSplit[2 * i] = tokens[i];
        }
        for(int i = 0; i < (afterSplit.length - 1) / 2; i++){
            afterSplit[2 * i + 1] = regex;
        }
        return afterSplit;

    }

    public static void main(String[]args){
        String s = "ab#12#453";

        for(String i:split(s,"#")){
            System.out.println(i);
       }
            System.out.Ptintln("hello");
    }
}
