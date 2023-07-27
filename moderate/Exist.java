package moderate;

public class Exist {



    public boolean exist(char[][] board, String word) {
        //获得矩阵的行列数
        int  h = board.length;
        int w=board[0].length;
        //标识元素是否被访问的矩阵
        boolean[][] flag = new boolean[h][w];
        //从每一个起点查找字符串
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                //查找
                boolean exist = check(board, flag, i, j, word, 0);
                //存在直接返回
                if(exist) return true;
            }
        }
        return false;
    }

    public boolean check(char[][] board,boolean[][] flag,int i,int j,String word,int k){
        //当前位置值与字符串中当前串头对应
        if (board[i][j]!=word.charAt(k) ) return false;
        //最后一个值则不用再查找子串
        else if (k==word.length()-1) return true;
        //将当前位置标为已访问
        flag[i][j]=true;
        //位移指令
        int[][] directions=new int[][]{
                {0,1},//右
                {1,0},//下
                {0,-1},//左
                {-1,0}//上
        };
        //是否查找到
        boolean res=false;

        //查找当前值四周
        for (int[] cd:directions){
            //下一个位置
            int ni=i+cd[0],nj=j+cd[1];
            //下一个位置是否合法
            if (ni>=0 && ni<board.length&&nj>=0&&nj<board[0].length){
                //下一个位置是否被访问
                if (!flag[ni][nj]){
                    //检查下一个位置
                    boolean exist = check(board, flag, ni, nj, word, k + 1);
                    //成功
                    if (exist){
                        res=true;
                        break;
                    }
                }
            }
        }
        //重置当前位置为未访问
        flag[i][j]=false;
        return res;
    }

}
