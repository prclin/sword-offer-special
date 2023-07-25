package moderate;

public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int i=matrix.length,j=matrix[0].length;
        int x=0,y=j-1;
        while (x<i&&y>=0){
            if (matrix[x][y]==target) return true;
            else if(matrix[x][y]<target) x++;
            else y--;
        }
        return false;
    }

}
