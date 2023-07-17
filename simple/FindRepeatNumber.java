package simple;

public class FindRepeatNumber {


    public int findRepeatNumber(int[] nums) {
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[nums[i]]++;
            if (ints[nums[i]]>1) return nums[i];
        }
        return -1;
    }

}
