package Practice2025;

public class Ncr {

    public static int factorial(int a){
        int factorial=1;

        while(a>=1){
            factorial=factorial*a;
            a--;
        }

        return factorial;
    }
    public static void main(String[] args) {

        //n!/r!* (n-r)!


        int n=8;
        int r=2;

        System.out.println( factorial(n)/ (factorial(r) * factorial( n-r)));


    }
}
