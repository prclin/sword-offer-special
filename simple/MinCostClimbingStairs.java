package simple;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(myMinCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
    public static int myMinCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<n;i++){
            dp[i] = Math.min(dp[i-1], dp[i-2])+cost[i];
        }
        return Math.min(dp[n-1], dp[n-2]);
    }

}
