package moderate;

import java.util.ArrayList;
import java.util.List;

public class MaximumEvenSplit {
    public static List<Long> maximumEvenSplit(long finalSum) {
        ArrayList<Long> list = new ArrayList<>();
        if (finalSum% 2 != 0) return list;
        long i=0;
        while (true){
            i+=2;
            if (finalSum-i<0) {
                int size = list.size();
                list.set(size-1,list.get(size-1)+finalSum);
                break;
            }
            list.add(i);
            finalSum-=i;
        }
        return list;
    }

}
