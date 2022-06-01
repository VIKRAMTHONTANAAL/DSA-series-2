package TwoDArray;
import java.util.Arrays;
class StringCompress {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
for(int i=0;i<matrix.length;i++){
        System.out.println(Arrays.toString(matrix[i]));
}
    }
    public static void rotate(int[][] matrix) {
        int count=0;
        int firstColumn=0;
        int firstRow=0;
        int lastColumn=matrix.length-1;
        int lastRow=matrix.length-1;
        int temp[]=new int[matrix.length];
        while (count<matrix.length*matrix.length){

            //firstColumn>>firstRow

            for(int i=firstColumn;i<=lastColumn && count<matrix.length*matrix.length ;i++){
                temp[i]=matrix[firstRow][i];
            }
int j=lastColumn;
            for(int i=firstRow;i<=lastRow;i++){

                matrix[firstRow][j--] =matrix[i][firstColumn];
                count++;
            }

            firstRow++;
            //firstRow>>lastColumn
            if(count<matrix.length*matrix.length){
                temp[firstColumn]=temp[lastColumn];
            }

            for(int i=firstRow;i<=lastRow && count<matrix.length*matrix.length;i++){
                int swap=temp[i];
                temp[i]=matrix[i][lastColumn];
                matrix[i][lastColumn]=swap;
                count++;
            }
            lastColumn--;

            //lastColumn>>lastRow
            if(count<matrix.length*matrix.length){
                temp[firstColumn]=temp[lastRow];
            }
            int k=firstRow;
            //int k=lastColumn
            for(int i=lastColumn;i>=firstColumn && count<matrix.length*matrix.length;i--){
                int swap=temp[k];
                temp[k++]=matrix[lastRow][i];
                matrix[lastRow][i]=swap;
                count++;
            }
            lastRow--;

            //lastRow>>FirstRow
int l=firstRow;
            for(int i=lastRow;i>=firstRow && count<matrix.length*matrix.length;i--){
                int swap=temp[l];
                temp[l++]=matrix[i][firstColumn];
                matrix[i][firstColumn]=swap;
                count++;

            }
            firstColumn++;

        }




    }
}