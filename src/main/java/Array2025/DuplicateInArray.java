package Array2025;

public class DuplicateInArray {
    public static void main(String[] args) {

        int arraysum=0,sum=0;
        int arr[]={6, 3, 1, 5, 4, 3, 2};
        sum=((arr.length-1)*arr.length)/2;
        for(int i=0;i<arr.length;i++){
            arraysum=arraysum+arr[i];
        }

        System.out.println("SUM "+sum);
        System.out.println("Array sum "+arraysum);



    }
}
