package Recursion;

public class reverseTheString {

    public static void main(String[] args) {
        String str="BANAGAGA";
        System.out.println(reverseTheString(str));
    }

    public static String reverseTheString(String str) {

        if(str.isEmpty()){
            return "";
        }else{
            return reverseTheString(str.substring(1))+str.charAt(0);
        }
    }
}
