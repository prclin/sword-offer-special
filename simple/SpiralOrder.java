package simple;

public class SpiralOrder {


    //模拟
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        //访问辅助
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int[] order = new int[total];
        int row = 0, column = 0;
        //控制辅助
        int[][] directions = {
                //向右
                {0, 1},
                //向下
                {1, 0},
                //向左
                {0, -1},
                //向上
                {-1, 0}
        };
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            order[i] = matrix[row][column];
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
                //循环右下左上
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }

    //按层模拟
    public int[] spiralOrderLayer(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[] order = new int[rows * columns];
        int index = 0;
        //层
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        //按层遍历
        while (left <= right && top <= bottom) {
            //向右
            for (int column = left; column <= right; column++) {
                order[index++] = matrix[top][column];
            }
            //向下
            for (int row = top + 1; row <= bottom; row++) {
                order[index++] = matrix[row][right];
            }

            //是否不是最内层
            if (left < right && top < bottom) {
                //向左
                for (int column = right - 1; column > left; column--) {
                    order[index++] = matrix[bottom][column];
                }
                //向上
                for (int row = bottom; row > top; row--) {
                    order[index++] = matrix[row][left];
                }
            }
            //进入内层
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }
}
