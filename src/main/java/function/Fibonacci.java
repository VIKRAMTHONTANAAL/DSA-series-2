package function;

public class Fibonacci {

    public static int fibonacciNumber(int n) {

        if(n==1){
            return 0;
        }

        int previousSum=0;
        int sum=1;

for(int i=2;i<n;i++){
    int temp=previousSum;
    previousSum=sum;
   sum=temp+sum;
}
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(0));
    }
}
