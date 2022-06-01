package Recursion;

public class calculatePowerUsingRecursion {
    public static int calculateThePower(int a,int b) {

        if(b==0){
            return 1;
        }
         return a*calculateThePower(a,b-1);
    }

    public static void main(String[] args) {
        System.out.println(calculateThePower(3,2));
    }
}
