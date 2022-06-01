package Searching;

import java.util.*;
public class PainterPartition {

    public static void main(String[] args) {
        //4
        //1 1 10
        //1
        //1 100 1
        //10
        //5 100 1000000000
        //100000 100000 100000 100000 100000
        //5 1 1000000000
        //100000 100000 100000 100000 100000


        //YOUR OUTPUT
//        10
//        10
//                -1
//                -1
//        Incorrect Output

        //expected

//        10
//        10
//        100000000000000
//        500000000000000

    }
    public static boolean isPossible(ArrayList<Integer> arr,long mid, long numberOfPainters,long time){

        long people=1;
        long sum=0;

        for(int i=0;i<arr.size();i++){
            if(sum+ (arr.get(i)*time) <=mid){
                sum=sum+ (arr.get(i)*time);
            }else{
                people++;
                if(arr.get(i)*time>mid || people>numberOfPainters){
                    return false;
                }
                sum=arr.get(i)*time;
            }



        }
        return true;

    }

    public static long minTime(ArrayList<Integer> board, int N, int A, int B) {
        long left=0;
        long right=0;
        long solution=-1;
        for(int i=0;i<board.size();i++){
            right= right + (B*board.get(i));
        }
        while(right>=left){
            long mid= left +( right - left)/2;

            if(isPossible(board, mid,A,B)){
                solution= mid;
                right=mid-1;
            }else{
                left=mid+1;
            }


        }

        return solution;




    }

}
