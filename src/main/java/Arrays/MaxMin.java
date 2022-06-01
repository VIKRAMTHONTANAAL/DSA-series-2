package Arrays;

public class MaxMin {

    public static void main(String[] args) {

        int arr[]={10,-19, -20,22 ,5,8,2,10,1};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
              max=arr[i];
          }
            if(arr[i]<min){
                min=arr[i];
            }

        }

        System.out.println(max+"  "+min);
    }


}
