// 73. Set Matrix Zeroes --> https://leetcode.com/problems/set-matrix-zeroes/description/
public class Lc73 {
    public void setZeroes(int[][] matrix) {
        int [] ith = new int[matrix.length];
        int [] jth = new int[matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j =0 ;j<matrix[i].length;j++){
                if (matrix[i][j]==0){
                    ith[i]=1;
                    jth[j]=1;
                }
            }
        }
        for(int i =0;i<matrix.length;i++){
            for(int j =0 ;j<matrix[i].length;j++){
                if (ith[i]==1 || jth[j]==1){
                   matrix[i][j] = 0;
                }
            }
        }
    }
}