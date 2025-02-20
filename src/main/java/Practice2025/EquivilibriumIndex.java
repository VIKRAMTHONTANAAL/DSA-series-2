package Practice2025;

public class EquivilibriumIndex {

    public static void main(String[] args) {
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        boolean found=false;

        for(int i=1;i<arr.length-1;i++){

            int left = 0;
            int right = arr.length-1;
            int leftSum=0;
            int rightSum=0;
            while(left <i){
                leftSum=leftSum+arr[left];
                left++;
            }
            while(right>i){
                rightSum=rightSum+arr[right];
                right--;
            }
            if(leftSum==rightSum){
                System.out.println("Equivilbrium found "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("not found");
        }
    }
}
