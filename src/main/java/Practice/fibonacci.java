package main.java.Practice;

public class fibonacci {
    public static void main(String[] args) {
      int n=10;
        System.out.println(fibonacci(n)) ;
    }

    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }
        int prev1=0;
        int prev2=1;

        for(int i=0;i<n;i++){
            int temp=prev2;
            prev2=prev1+prev2;
            System.out.println(prev1);
            prev1=temp;
        }


        return prev1;

    }
}
