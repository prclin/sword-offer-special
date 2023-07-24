package simple;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LastRemaining {

    public int lastRemaining(int n, int m) {
        Queue<Integer> queue=new ArrayBlockingQueue(n);
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        while (queue.size()!=1){
            for (int i = 0; i < m; i++) {
                if (i==m-1) queue.poll();
                else queue.add(queue.poll());
            }
        }
        return queue.poll();
    }

}
