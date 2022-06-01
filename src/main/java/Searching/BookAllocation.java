package Searching;

import java.util.*;

public class BookAllocation {
    public static boolean isPossible(ArrayList<Integer> arr, int mid , int numberOfStudents) {
        int numberOfPersons = 1;
        int pageSum = 0;
        for (int i = 0; i < arr.size(); i++) {

            if (pageSum + arr.get(i) <= mid) {
                pageSum = pageSum + arr.get(i);
            } else {
                numberOfPersons++;
                if (arr.get(i) > mid || numberOfPersons >= numberOfStudents) {

                    return false;
                }

                    pageSum=arr.get(i);
            }

        }
        return true;

    }

    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        int left=0;
        int right=0;
        int solution=-1;
        for(int i=0;i<arr.size();i++){
            right=right+arr.get(i);
        }
        while(right>left){
            int mid= left + (right -left )/2;

            if(isPossible(arr, mid, m)){
                right=mid-1;
                solution=mid;

            }else{
                left=mid+1;
            }
        }
        return solution;
    }




    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(4);
        list.add(25);
        list.add(46);
        list.add(28);
        list.add(49);
        list.add(24);
        System.out.println(allocateBooks(list, list.size(), 5));
}
}
//    }/*
//    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
//        // Write your code here.
//        int sum=0;
//        for(int i=0;i<arr.size();i++){
//            sum=sum+arr.get(i);
//        }
//
//        int left=0;
//        int right=sum;
//        int solution=-1;
//        int j=0;
//        int solsum=0;
//int mcopy=m;
//        while(right>left){
//
//            int mid= left + (right - left)/2;
//
//            while(mcopy>0){
//                int intersum=0;
//                while(j+1<arr.size() && intersum+arr.get(j)<=mid ){
//                    intersum=intersum+arr.get(j);
//                    solsum=solsum+intersum;
//                    j++;
//                }
//
//                if(intersum==0){
//                    break;
//                }
//                mcopy--;
//            }
//
//            if(j==arr.size()-1 && mcopy==0 && solsum==sum){
//                solution=mid;
//
//                right=mid-1;
//            }else{
//                left=mid+1;
//                solsum=0;
//            }
//            mcopy=m;
//            j=0;
//
//
//        }
//
//
//        return solution;
//    }
//*/




