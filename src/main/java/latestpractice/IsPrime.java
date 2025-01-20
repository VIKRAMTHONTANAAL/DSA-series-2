package latestpractice;

public class IsPrime {
    public static void main(String[] args) {
        int number=14;
        int count=0;

        for (int i=2; i<number; i++){
            if(number%i==0){
                count++;
            }
        }

        if(count==0){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }

    }
}
