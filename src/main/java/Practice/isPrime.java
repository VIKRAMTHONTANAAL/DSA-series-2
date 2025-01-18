package Practice;

public class isPrime {

    public static void main(String[] args) {
        //int n=10;

        for(int n=0;n<100;n++) {
            if (isPrime(n)) {
                System.out.println(n + "is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
    }

    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
