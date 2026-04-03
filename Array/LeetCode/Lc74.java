// 74. Search a 2d matrix 
public class Lc74 {
    public boolean searchFirstRow(int[]m,int target){
        System.out.println("Entered");
        for(int i = 0;i<m.length;i++){
            System.out.println(m[i]);
            if(target==m[i]){
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target>matrix[matrix.length-1][matrix[matrix.length-1].length-1] || target<matrix[0][0] ) return false;
        int mid = (matrix.length)/2;
        while(mid>0 && mid<matrix.length){
            if(target > matrix[mid-1][matrix[mid].length-1] && target < matrix[mid][0]){
                return false;
            } else if (target < matrix[mid-1][matrix[mid].length-1]){
                mid--;
                System.out.println("The mid after decrement "+mid);
                if(searchFirstRow(matrix[mid],target)) return true;
                continue;
            }else if (target > matrix[mid][0]){
                searchFirstRow(matrix[mid],target);
                mid++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Lc74 obj = new Lc74();
        int[][] matrix = {
            {1}
        };
        System.out.println(obj.searchMatrix(matrix, 1));
    }
}
