package main.java.Practice;

public class StringPalindrome {
    public static void main(String[] args) {

        String org="MADAA";
        String rev="";
        for (int i=org.length()-1;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        if(rev.equalsIgnoreCase(org)){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }
    }
}
