package simple;

public class TwoSumS {

    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<r) {
            int x=nums[l]+nums[r];
            if (x>target) r--;
            else if (x<target) l++;
            else return new int[]{nums[l],nums[r]};
        }
        return new int[0];
    }

}
