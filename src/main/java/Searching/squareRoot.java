package Searching;

import java.math.BigInteger;
public class squareRoot {

    public static int sqrtN(long N) {

        BigInteger square;
        long left=0;
        long right=N;
        long mid=-1;
        int ans=0;
        while(right>=left){
            mid= left + (right-left)/2;
            square=BigInteger.valueOf(mid).multiply(BigInteger.valueOf(mid));
            if(BigInteger.valueOf(N).compareTo(square) == 0){
                return (int)mid;
            }

            if (BigInteger.valueOf(N).compareTo(square) < 0){//
                right=mid-1;

            } else{
                left=mid+1;
                ans=(int)mid;
            }

        }

        return (int)ans;


    }
}
