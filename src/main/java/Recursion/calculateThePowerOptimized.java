package Recursion;

public class calculateThePowerOptimized {

    public static void main(String[] args) {

        System.out.println( calculate(3,11));
    }

    public static int calculate(int a,int b) {

        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }

        int ans=calculate(a,b/2);

        if(b%2==0){
            return ans*ans;
        }else{
            return a*ans*ans;

        }
    }
}
