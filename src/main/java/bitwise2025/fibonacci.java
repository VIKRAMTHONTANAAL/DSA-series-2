package bitwise2025;

public class fibonacci {

    public static void main(String[] args) {
        int a=0, b=1,n=10, sum=0;
        System.out.print(a+" "+b+" ");
        for (int i =1;i<=n;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;


        }
    }
}
