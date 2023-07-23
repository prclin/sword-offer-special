package simple;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {

    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int l=1,r=2;
        while (l<r){
            int sum=(l+r)*(r-l+1)/2;
            if (sum>target) l++;
            else if(sum<target) r++;
            else {
                int[] seq = new int[r-l+1];
                for (int i = 0; i < r-l+1; i++) seq[i]=l+i;
                res.add(seq);
                l++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}
