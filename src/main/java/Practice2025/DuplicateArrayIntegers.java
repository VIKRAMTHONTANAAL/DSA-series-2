package Practice2025;


        import java.util.HashMap;
        import java.util.Map;

public class DuplicateArrayIntegers{
    public static void main(String []args){
        int arr[]={1,1,2,2,3,4,5,5};
        Integer count =1;
        Map<Integer, Integer> hash=new HashMap<>();
        for (int i: arr){
            if(hash.containsKey(i)){
                System.out.println("Duplicate element found "+i );
            }else{
                hash.put(i,count);
            }

        }
    }
}