package simple;

import java.util.LinkedList;
import java.util.List;

public class CQueue {

    List<Integer> in;
    List<Integer> out;

    public CQueue() {
        in=new LinkedList<>();
        out=new LinkedList<>();
    }

    public void appendTail(int value) {
        in.add(value);
    }

    public int deleteHead() {
        if (out.isEmpty()){
            if (in.isEmpty()){
                return -1;
            }
            while (!in.isEmpty()){
                out.add(in.remove(in.size()-1));
            }
        }
        return out.remove(out.size()-1);
    }

}
