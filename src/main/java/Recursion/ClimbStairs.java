package Recursion;

public class ClimbStairs {
    public static int countDistinctWayToClimbStair(long nStairs) {
        // Write your code here.

        if(nStairs<0){
            return 0;
        }
        if(nStairs==0){
            return 1;
        }

        return countDistinctWayToClimbStair(nStairs-1)+countDistinctWayToClimbStair(nStairs-2);
    }

    public static void main(String[] args) {
        System.out.println(countDistinctWayToClimbStair(5));
    }
}