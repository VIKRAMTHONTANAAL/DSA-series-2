package Searching;

public class firstAndLastOccurrence {

        public static void main(String[] args) {

            int arr[]={2};
            int n=arr.length;
            int k=2;

            int firstElement=Integer.MIN_VALUE;

            int left=0;
            int right=n-1;

            while(right>=left){
                int mid= left+ (right-left)/2;

                if(arr[mid]==k){
                    firstElement=mid;
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
            }
            else{
                int leftElement=firstElement;
                int rightElement=firstElement;

                while((leftElement-1)>=0){
                    if(arr[leftElement-1]==k){
                        leftElement--;
                    }
                    else{
                        break;
                    }

                }

                while((rightElement+1)<=(n-1)){
                    if(arr[rightElement+1]==k){
                        rightElement++;
                    }
                    else{
                        break;
                    }

                }
                System.out.println(leftElement+" "+rightElement);

            }




        }



        }
