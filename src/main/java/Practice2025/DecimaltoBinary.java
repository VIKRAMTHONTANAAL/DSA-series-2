package Practice2025;
import java.lang.Math;

public class DecimaltoBinary {

    public static void main(String[] args) {
        int n = 15, number=0;
        int power=1;

        while(n>0){
            int digit=n&1;

            number = (power * digit)+ number;
            power = 10*power;
            n=n>>1;

        }

        System.out.println(number);

    }
}
