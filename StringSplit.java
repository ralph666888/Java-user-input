import java.util.*;
public class StringSplit {
    public static String[] split(String s, String regex){
        String[]tokens = s.split(regex);
        String[]aftersplit = new String[2 * tokens.length-1];
        for(int i = 0;i<tokens.length;i++){
            aftersplit[2 * i] = tokens[i];
        }
        for(int i = 0;i < (aftersplit.length-1)/2;i++){
            aftersplit[2 * i + 1] = regex;

        }
        return aftersplit;

    }

    public static void main(String[]args){
        String s = "ab#12#453";

        for(String i:split(s,"#")){
            System.out.println(i);
        }
    }
}
