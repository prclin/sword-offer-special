package simple;

import java.util.HashSet;

public class IsStraight {

    public boolean isStraight(int[] nums) {
        int min=14,max=0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num == 0) continue;
            if (set.contains(num)) return false;
            else {
                max = Math.max(num, max);
                min = Math.min(num, min);
                set.add(num);
            }
        }

        return max-min<5;
    }

}
