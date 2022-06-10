package main.java.Practice;

public class NumberOfDigitsInNumber {

    public static void main(String[] args) {
        int a=1234567654;
        int count=0;
        while(a!=0){
            a=a/10;
            count++;
        }
        System.out.println(count);
    }
}
