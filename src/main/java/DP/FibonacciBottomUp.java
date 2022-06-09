package DP;

public class FibonacciBottomUp {

    public static void main(String[]args){

        int n=8;

        int prev1=0;
        int prev2=1;

        if(n==0){
            System.out.println(prev1);
        }

        for(int i=2;i<=n;i++){
            int temp=prev2;
            prev2=prev1+temp;
            prev1=temp;
        }

        System.out.println(prev2);

    }
}
