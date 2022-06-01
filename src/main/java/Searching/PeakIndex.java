package Searching;

class PeakIndex {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray());
    }
    public static int peakIndexInMountainArray() {
int arr[]={3,4,5,1};

        int left=0;
        int right=arr.length-1;

        //left search
        while(right>=left){
            int mid= left + (right-left)/2;

            if((mid+1)<=arr.length-1 && (mid-1)>=0){
                if((arr[mid]>arr[mid-1]) && (arr[mid]>arr[mid+1])){
                    return mid;
                }
            }

            if(arr[mid+1]>arr[mid]){
                left=mid+1;

            }else{
                right=mid;
            }


        }
        return -1;
//
//        left=0;
//        right=arr.length-1;
//
//
//        while(right>=left){
//            int mid= left + (right-left)/2;
//            if((mid+1)<=arr.length-1 && (mid-1)>=0){
//                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
//                    return mid;
//                }}
//            left=mid+1;
//        }
//        return -1;
    }
}
