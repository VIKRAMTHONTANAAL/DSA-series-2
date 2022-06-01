package Recursion;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(10));
    }

    public static int powerOfTwo(int n) {
        if(n==0){
            return 1;
        }

        return 2*powerOfTwo(n-1);
    }
}
