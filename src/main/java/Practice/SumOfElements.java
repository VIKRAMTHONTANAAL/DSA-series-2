package main.java.Practice;

public class SumOfElements {
    public static void main(String[] args) {

        int arr[]={9,2,5,7,6};
        System.out.println(sumOfElements(arr));
        System.out.println(sumOfElements2(arr));
    }

   public static int sumOfElements(int arr[]){
        int sum=0;
for(int i=0;i< arr.length;i++){
    sum=sum+arr[i];
}

return sum;
    }
    public static int sumOfElements2(int a[]){
        int sum=0;
        for(int i: a){
            sum=sum+i;
        }

        return sum;
    }


}
