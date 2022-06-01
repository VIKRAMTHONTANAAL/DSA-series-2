package TwoDArray;
class Solution {
    public static void main(String[] args) {
        int matrix[][]= {{-5}};

        System.out.println(searchMatrix(matrix,-10));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        int row=matrix.length;
        int col=matrix[0].length;
        int rowIndex=0;
        int columnIndex=col-1;

        while(rowIndex<row && columnIndex<col && columnIndex>=0 && rowIndex>=0){
            int element=matrix[rowIndex][columnIndex];
            if(element==target){
                return true;
            }
            if(target>element){
                rowIndex++;
            }else{
                columnIndex--;
            }

        }

        return false;
    }
}