package Practice2025;

public class BinaryToDecimal {

    public static void main(String[] args) {
        int n =1000000, sum=0;
        int power=1;
        while(n>0){
            int digit=n%10;
            if(digit==1){
                sum = sum +  power ;
                }
            power = power * 2;

            n=n/10;
        }

        System.out.println(sum);
        //7, 1009,476 , binary to decimal, decimal to binary, sqrt (x), power of a.b
    }
}
