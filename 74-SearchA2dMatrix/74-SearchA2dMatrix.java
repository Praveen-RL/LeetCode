// Last updated: 9/3/2025, 10:51:30 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int row=0,col=n-1;
        while(row<m && col>=0){
            if(matrix[row][col]==target) return true;
            else if(target<matrix[row][col]) col--;
            else row++;
        }
        return false;
    }
}