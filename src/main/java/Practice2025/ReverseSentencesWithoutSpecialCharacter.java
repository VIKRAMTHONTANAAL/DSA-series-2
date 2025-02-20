package Practice2025;

import java.util.StringTokenizer;

public class ReverseSentencesWithoutSpecialCharacter {

    public static void main(String[] args) {

        String s="I love abc$%d my country";
        s=reverse(s);
        System.out.println(s);

    }

    public static String reverse(String s) {
        StringTokenizer token = new StringTokenizer(s, " ");
        String rev="";
        while(token.hasMoreTokens()){
            rev=reverseRemovingCharacter(token.nextToken())+" "+rev;
           // System.out.println(rev);
        }

        return rev;

    }

    public static String reverseRemovingCharacter(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i)>= 'a' && s.charAt(i)<='z') || (s.charAt(i)>= 'A' && s.charAt(i)<='Z')){
                reverse=reverse+s.charAt(i);
            }
           // System.out.println(reverse);
        }

        return reverse;
    }
}
