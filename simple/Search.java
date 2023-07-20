package simple;

public class Search {

    public int search(int[] nums, int target) {
        int times=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>target) break;
            if (nums[i]==target) times++;
        }
        return times;
    }

}
