package simple;

import java.util.Arrays;

public class PivotIndex {

    public static void main(String[] args) {
        System.out.println(myPivotIndex(new int[]{-1,-1,-1,-1,-1,0}));
    }

    public static int myPivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int ls=0;

        for (int i = 0; i < nums.length; i++) {
            if (ls==sum-ls-nums[i]) return i;
            ls+=nums[i];
        }
        return -1;
    }

}
