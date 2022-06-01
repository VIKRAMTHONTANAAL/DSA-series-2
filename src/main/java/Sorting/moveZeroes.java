package Sorting;
import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

        public static void moveZeroes(int[] nums) {
            int count=0;


            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    count++;
                }
            }
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[j]=nums[i];
                    j++;

                }
            }
            if(nums.length!=1) {
                for (int i = nums.length - count ; i < nums.length; i++) {
                    nums[i] = 0;
                }
            }

    }
}
