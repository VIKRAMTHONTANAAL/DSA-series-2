package Maths;

public class maxGCDPair {
    public static void main(String[] args) {
        int arr[]={1, 5, 2, 3, 4};
           //System.out.println(findGCD(1,5));
           System.out.println(maxGCDPair(arr,arr.length));
    }
    public static int maxGCDPair(int[] arr, int n) {
        // Write your code here.
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int value=findGCD(arr[i],arr[j]);
           //   System.out.println(value);

                if(value>max){
                    max=value;
                }
            }
        }
        return max;

    }

    public static int findGCD(int a,int b){

        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }

        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;

            }

        }

        return a;
    }
}