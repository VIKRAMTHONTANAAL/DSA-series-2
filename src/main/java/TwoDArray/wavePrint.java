package TwoDArray;


public class wavePrint {
    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
        // Write your code here.
        int arrr[]=new int[0];

        for(int i=0;i<mCols;i++){
            if(i%2==0){
                for(int j=0;j<nRows;j++){
                    System.out.print(arr[j][i]+" ");

                }}
            else{
                for(int j=nRows-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");

                }

            }
        }

        return arrr;
    }
}


