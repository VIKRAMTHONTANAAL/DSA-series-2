package main.java.Practice;

public class largestOfThreeNumbers {
    public static void main(String[] args) {
        int a=500,b=300,c=100;

        if(a>b){
            if(a>c){
                System.out.println(a+" is the greatest number");
            }else{
                System.out.println(c+" is the greatest number");
            }
        }else{
            if(b>c){
                System.out.println(b+" is the greatest number");
            }else {
                System.out.println(c+" is the greatest number");
            }}

            if(a>b && a>c){
                System.out.println("a is big number");
            }
            else if (b>a && b>c){
                System.out.println("b is a big number");
            }else{
                System.out.println("c  is a big number");
            }


//a>b?true:false

        int largest1=a>b?a:b;
            int largest2=largest1>c?largest1:c;
        System.out.println(largest2);



    }
}
