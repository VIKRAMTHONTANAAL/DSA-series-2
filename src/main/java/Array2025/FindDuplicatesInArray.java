package Array2025;
import java.util.*;
public class FindDuplicatesInArray {

    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        List<Integer > ls=new ArrayList<>();
        HashMap <Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i], (hash.get(nums[i])+1));
            }else{
                hash.put(nums[i],1);
            }
        }

        for(Integer j:hash.keySet()){

            if(hash.get(j)!=null && hash.get(j)==2){
                ls.add(j);
            }
        }
//
//      for(Integer k: ls){
//          System.out.println(ls.get(k));
//      }

    }
}
