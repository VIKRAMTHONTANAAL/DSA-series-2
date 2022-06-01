package Recursion;

public class isPalindrome {

    public static boolean checkPalindrome(long N) {
        // Write your code here.
        String str=Long.toString(N);
        return isPalindrome(str,0,str.length()-1);
    }
    public static boolean isPalindrome(String str,int i,int j){
        if(i>j || j<0 || i>str.length() ){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }

        return isPalindrome(str,i+1,j-1);


    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(7777));
    }

}