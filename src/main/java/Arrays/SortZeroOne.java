package Arrays;

public class SortZeroOne {

    public static void main(String[] args) {

        int arr[]={0,1,1,0,0,1};
        int zeros=0;
        int ones=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                zeros++;
            }else{
                ones++;
            }

        }
        while(zeros!=0){
            System.out.print("0 ");
            zeros--;
        }
        while(ones!=0){
            System.out.print("1 ");
            ones--;
        }

    }
}
