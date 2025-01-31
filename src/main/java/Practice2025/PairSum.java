package Practice2025;

import java.util.HashMap;
import java.util.Map;

public class PairSum {

    public static void main(String[] args) {
        int arr[] = {1,2,5,6,-1,-3,4 ,1,2};
        Map<Integer, Integer>  hash= new HashMap<>();
        int sum=3;
        boolean sumFound=false;

        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1; j< arr.length; j++){

                if((hash.get(i))!= null && (hash.get(i)==j) ){

                if(i!=j && (arr[i]+arr[j]==sum) ){
                    hash.put(i, j);
                    System.out.println("These are the pairs "+ arr[i]+ " "+arr[j]);
                    sumFound=true;
                }
                }
            }
        }
        if(!sumFound){
            System.out.println("No pair of sum found");
        }
    }
}
