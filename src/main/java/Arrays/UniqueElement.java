package Arrays;
import java.util.*;
public class UniqueElement {

    public static void main(String[] args) {

int arr[]={2 ,3 ,1 ,6 ,3 ,6 ,2};

        System.out.println(findUnique(arr));
        System.out.println(findUnique2(arr));

    }
    public static int findUnique2(int[] arr){

        int ans=0;
        for (int i=0;i<arr.length;i++){

            ans=ans^arr[i];
        }

        return ans;
    }

        public static int findUnique(int[] arr){
            //Your code goes here
            HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

            for(int i=0;i<arr.length;i++){

                if(map.containsKey(arr[i])){
                    map.remove(arr[i]);
                }else{
                    map.put(arr[i],i);
                }

            }

            Map.Entry<Integer,Integer> entry = map.entrySet().iterator().next();

            return entry.getKey();
        }

}
