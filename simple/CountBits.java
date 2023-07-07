package simple;

import java.util.Arrays;

public class CountBits {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(myCountBits(5)));
    }
    public static int[] myCountBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count =(int) Arrays.stream(Integer.toBinaryString(i).split("")).filter(el -> el.equals("1")).count();
            res[i]=count;
        }
        return res;
    }

    //标准答案
    int[] res;
    int n;
    public int[] countBits(int n) {
        res = new int[n+1];
        this.n = n;
        dfs(1,1);
        return res;
    }
    void dfs(int index, int value){
        if(index>n){
            return;
        }
        res[index] = value;
        dfs(index<<1, value); // res[2*i] = res[i];
        dfs((index<<1)+1, value+1); // res[2*i+1] = res[i]+1;
    }

}
