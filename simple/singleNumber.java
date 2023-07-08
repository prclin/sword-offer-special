package simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class singleNumber {


    public static void main(String[] args) {
        System.out.println(mySingleNumber(new int[]{2,2,3,2}));
    }

    public static int mySingleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],(map.get(nums[i])==null?0:map.get(nums[i]))+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) return entry.getKey();
        }
        return 0;
    }

    //标准答案
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }

    //另一种
//    一个整数是由32个0或1组成的。我们可以将数组中所有数字的同一位置的数位相加。如果将出现3次的数字单独拿出来，那么这些出现了3次的数字的任意第i 个数位之和都能被3整除。
//
//    因此，如果数组中所有数字的第i 个数位相加之和能被3整除，那么只出现一次的数字的第i 个数位一定是0；如果数组中所有数字的第i 个数位相加之和被3除余1，那么只出现一次的数字的第i 个数位一定是1。
    public int singleNumber2(int[] nums) {
        int [] bitsums = new int[32];
        for(int num : nums){
            for(int i = 0; i < 32; i++){
                bitsums[i] += (num >> (31 - i)) & 1;
            }
        }
        int result = 0;
        for(int i = 0; i < 32; i++){
            result = (result << 1) + bitsums[i] % 3;
        }
        return result;
    }

}
