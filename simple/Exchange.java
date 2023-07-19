package simple;

public class Exchange {


    public int[] exchange(int[] nums) {
        int[] ints = new int[nums.length];
        int i=0,j=nums.length-1;
        for (int num : nums) {
             if (num%2==0) {
                 ints[j]=num;
                 j--;
             }else {
                 ints[i]=num;
                 i++;
             }
        }
        return  ints;
    }

}
