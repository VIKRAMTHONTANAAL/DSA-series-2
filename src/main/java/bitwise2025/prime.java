package bitwise2025;

public class prime {

    public static void main(String[] args) {
        int n=14;
        boolean isPrime=true;

        if(n==1 || n==0){
            System.out.println("number is not prime");
        } else  {
            for(int i=2; i<n;i++  ){
                if(n%i==0){
                    System.out.println("Number is not prime");
                    isPrime=false;
                    break;
                }
            }

        }

        if(isPrime){
            System.out.println("Number is prime");
        }


    }
}
