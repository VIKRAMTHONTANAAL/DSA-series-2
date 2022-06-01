package Searching;

public class firstAndLastOccurrenceLeftMost {

        public static void main(String[] args) {

            int arr[]={1,2,3,3,5};
            int n=arr.length;
            int k=3;

            int firstElement=Integer.MIN_VALUE;
            int secondElement=Integer.MIN_VALUE;
            int left=0;
            int right=n-1;
//FIRST OCCURRENCE
            while(right>=left){
                int mid= left+ (right-left)/2;

                if(arr[mid]==k){
                    firstElement=mid;
                    right=mid-1;
                   continue;
                }
                if(k>arr[mid]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }

            }
            //Second part
            if(firstElement==Integer.MIN_VALUE){
                firstElement=-1;
                System.out.println(-1+" "+-1);
                System.exit(0);
            }

            left=0;
            right=n-1;

//LAST OCCURRENCE
            while(right>=left){
                int mid= left+ (right-left)/2;

                if(arr[mid]==k){
                    secondElement=mid;
                    left=mid+1;
                    continue;
                }
                if(k>arr[mid]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }

            }

            System.out.println(firstElement+" "+secondElement);

        }



        }
