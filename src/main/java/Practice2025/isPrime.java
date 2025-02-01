package Practice2025;

public class isPrime {
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a=103;

        System.out.println(a+" is prime "+isPrime(a));
    }
}
