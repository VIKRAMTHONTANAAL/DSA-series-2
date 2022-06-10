package main.java.Practice;


public class ReverseAString {


    public static void main(String[] args) {

        String s="ABCD";

        System.out.println(reverseAString(s));
        System.out.println(reverseAStringInPlace(s));
        System.out.println(reverseUsingRecursion(s));
        System.out.println(reverseStringUsingCharArray(s));
        System.out.println(reverseStringUsingStringBuffer(s));

    }

    public static String reverseAString(String s){
        String temp="";

        for(int i=s.length()-1;i>=0;i--){
            temp=temp+s.charAt(i);
        }

        return temp;
    }

    public static String reverseAStringInPlace(String s){

        for(int i=0;i<=s.length()/2;i++){
        s=  s.charAt(s.length()-i-1) +s.substring(i+1,s.length()-i-1)+s.charAt(i);
        }

        return s;
    }

    public static String reverseUsingRecursion(String s){

        if(s.isEmpty()){
            return "";
        }

        return reverseUsingRecursion(s.substring(1))+s.charAt(0);

    }

    public static String reverseStringUsingCharArray(String s){
        String rev="";
        char a[]=s.toCharArray();
        for(int i =s.length()-1;i>=0;i--){
            rev=rev+a[i];
        }
return rev;

    }

    public static String reverseStringUsingStringBuffer(String s){
        String rev="";
       StringBuffer stringBuffer=new StringBuffer(s);
       rev= String.valueOf(stringBuffer.reverse());
        return rev;

    }
}
