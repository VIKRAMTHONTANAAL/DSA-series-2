package Recursion;

public class SayDigit {

    public static void sayDigit(int n) {

        if(n==0){
            return;
        }

        int digit=n%10;

        sayDigit(n/10);

        if(digit==0){
            System.out.println("ZERO ");
        }

        if(digit==1){
            System.out.println("ONE ");
        }

        if(digit==2){
            System.out.println("TWO ");
        }

        if(digit==3){
            System.out.println("THREE ");
        }

        if(digit==4){
            System.out.println("FOUR ");
        }

        if(digit==5){
            System.out.println("FIVE ");
        }

        if(digit==6){
            System.out.println("SIX ");
        }

        if(digit==7){
            System.out.println("SEVEN ");
        }

        if(digit==8){
            System.out.println("EIGHT ");
        }
        if(digit==9){
            System.out.println("NINE ");
        }


    }
    public static void main(String[] args) {
        sayDigit(420);
    }
}
