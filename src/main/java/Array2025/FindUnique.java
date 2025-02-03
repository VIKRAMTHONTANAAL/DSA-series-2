package Array2025;

import java.util.HashMap;

public class FindUnique {
    public static void main(String[] args) {
        int arr[]={2, 3, 9, 6, 3, 6, 2};

        HashMap<Integer,Integer> hash=new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if(hash.containsKey(arr[i])){
                hash.remove(arr[i]);
            }else {
                hash.put(arr[i],1);
            }
        }


       for (Integer i: hash.keySet()){
           System.out.println(i);
       }



    }
}
