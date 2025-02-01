package Practice2025;

public class Fibonacci {
    //0,1,1,2,3
    public static int fibonacci(int n){
        int a=0, b=1;
        for (int i=1;i<n; i++){
            int move=a;
            a=b;
            b=move+b;

        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(4));

    }
}
