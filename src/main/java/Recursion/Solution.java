package Recursion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<List<Integer>> answer= new ArrayList<List<Integer>>();

    public static void main(String[] args) {
         int arr[]={1,2,3};
        List<List<Integer>> output=subsets(arr);
        System.out.println(output.get(0));
    }

    public static List<List<Integer>> subsets(int[] nums) {


        List<Integer> output=new ArrayList<Integer>();
        solution(nums,output,0);

        return answer;

    }

    public static void solution(int[] nums,List<Integer> output,int index){
        if(index>=nums.length){
         //   answer.addAll(output);
            return;
        }
        //exclude
        solution(nums,output,index+1);

        //include
        int element=nums[index];
        output.add(element);
        solution(nums,output,index+1);



    }
}