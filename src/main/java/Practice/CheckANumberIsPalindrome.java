package main.java.Practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CheckANumberIsPalindrome {

    public static void main(String[] args) {
        int a=16461;


        int reverse=reverseInt(a);
        if(reverse==a){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }


        String s=String.valueOf(a);

        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        if(s.equals(rev)){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }


    }

   static int  reverseInt(int a){
        int sum=0;
      while(a!=0){
         int dig=a%10;
         sum=sum*10+dig;
         a=a/10;
      }

return sum;
   }
}
