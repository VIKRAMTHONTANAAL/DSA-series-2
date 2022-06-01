package TwoDArray;
import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        int largestSum=-1;
        int column=-1;
        Scanner scan=new Scanner(System.in);
        int arr[][]= {{1,2,3,4},{5,6,7,8},{10,11,12,13}};
       //arr={1,2,3,4,5,6,7,8,9,10,11,12};

        for(int i=0;i< 4;i++){
int sum=0;
            for(int j=0;j< arr.length;j++){
            sum=sum+ arr[j][i];
            }
            if(sum>largestSum){
                column=i;
                largestSum=sum;
            }


        }
        System.out.println(column);
        System.out.println(largestSum);
        for (int i=0;i< arr.length;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
