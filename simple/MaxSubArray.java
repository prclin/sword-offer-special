package simple;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max=nums[0],pre=0;
        for (int num : nums) {
            pre=Math.max(pre+num,num);
            max=Math.max(max,pre);
        }
        return max;
    }
}
