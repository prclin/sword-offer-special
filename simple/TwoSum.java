package simple;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(myTwoSum(new int[]{-1,0}, -1)));
    }

    public static int[] myTwoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {

            int excepted = target - numbers[i];
            res[0]=i;
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[j]==excepted){
                    res[1]=j;
                    return res;
                }else if (numbers[j]>excepted) break;
            }
        }
        return null;
    }

    //标准答案
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        do {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        } while (true);
        return new int[]{left, right};
    }
}
