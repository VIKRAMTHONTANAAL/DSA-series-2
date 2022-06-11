package main.java.Practice;

public class EvenOrOddArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        for(int i:arr){

            if(i%2==0){
                System.out.println(i+" even");
            }
        }
        for(int i:arr){

            if(i%2!=0){
                System.out.println(i+" odd");
            }
        }
    }
}
