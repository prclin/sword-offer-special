package moderate;

import java.util.LinkedList;
import java.util.Queue;

public class MovingCount {

    public int movingCount(int m, int n, int k) {
        if (k==0) return 1;
        //dfs辅助队列
        Queue<int[]> queue = new LinkedList<int[]>();
        boolean[][] flag = new boolean[m][n];
        queue.offer(new int[]{0,0});
        flag[0][0]=true;

        //方向
        int[][] directions = {
                //右
                {0, 1},
                //下
                {1, 0}
        };

        //结果
        int res=1;
        while (!queue.isEmpty()){
            //当前元素
            int[] cur = queue.poll();
            //当前行 列
            int ci=cur[0],cj=cur[1];
            //向右或向下
            for (int[] d:directions) {
                //新坐标
                int ti=ci+d[0];
                int tj=cj+d[1];
                //新坐标是否合法
                if (ti<0||ti>=m||tj<0||tj>=n|| flag[ti][tj] || bitSum(ti)+bitSum(tj)>k ){
                    continue;
                }

                //合法
                queue.offer(new int[]{ti,tj});
                flag[ti][tj]=true;
                res++;
            }
        }
        return res;
    }

    public int bitSum(int i){
        int res=0;
        while (i!=0){
            res+=i%10;
            i/=10;
        }
        return res;
    }

}
