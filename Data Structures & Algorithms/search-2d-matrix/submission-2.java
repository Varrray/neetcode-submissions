class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int top=0;
        int bot=matrix.length-1;
        int col=matrix[0].length-1;
        
        while(top<=bot){
            int row=(top+bot)/2;
            if(matrix[row][0]>target){
                bot=row-1;
            }
            else if (matrix[row][col]<target){
                top=row+1;
            }
            else {
                break;
            }
        }
        if(!(top<=bot)){
            return false;
        }
        int row=(top+bot)/2;
        int l=0;
        int r=col;
        while(l<=r){
            int m=(l+r)/2;
            if(matrix[row][m]<target){
                l=m+1;
            }
            else if(matrix[row][m]>target){
                r=m-1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
