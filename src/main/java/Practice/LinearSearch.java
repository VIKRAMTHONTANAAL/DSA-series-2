package main.java.Practice;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int find=10;
        boolean found=false;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==find){
                System.out.println("Element found");
                found=true;
            }
        }
        if(!found){
            System.out.println("naaaaa");
        }

    }
}
