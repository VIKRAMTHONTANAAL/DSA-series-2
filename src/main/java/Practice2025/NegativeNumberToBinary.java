package Practice2025;

public class NegativeNumberToBinary {
    public static void main(String[] args) {
        int n=-10, sum=0, power=1;

        int positive=n*-1;

        while(positive>0){
            int bit =positive & 1;
            if(bit==1) {
                sum = power* bit +sum;

            }
            power = power*10;

            positive=positive>>1;
        }

        System.out.println(sum);

        System.out.println(~sum);

        ///
        sum = 1+ (~sum);

        System.out.println(sum);


    }


}
