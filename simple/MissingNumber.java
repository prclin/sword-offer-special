package simple;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum=nums.length*(nums.length+1)/2;
        int sum1 = Arrays.stream(nums).sum();
        return sum-sum1;
    }

}
