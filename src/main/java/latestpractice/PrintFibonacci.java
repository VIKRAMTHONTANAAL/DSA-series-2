package latestpractice2025;

public class PrintFibonacci {
    public static void main(String []args){
        int count=13;
        printFibonacci(count);
    }

    public static void printFibonacci(int n){
        int a=0,b=1,sum=0;

        for(int i=0; i<n;i++){
            System.out.println(sum);
            sum=a+b;
            a=b;
            b=sum;
        }

    }
}
