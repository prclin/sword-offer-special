package simple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class MinStack {

    private Integer min;
    private Integer[] data;
    private int cursor;

    public MinStack() {
        data=new Integer[20000];
        min=null;
        cursor=0;
    }

    public void push(int x) {
        if (min==null||cursor==0||x<min) min=x;
        data[cursor++]=x;
    }

    public void pop() {
        data[--cursor]=null;
        Arrays.stream(data).filter(Objects::nonNull).reduce((x, y)-> x<y?x:y).ifPresent(t-> min=t);
    }

    public int top() {
        return data[cursor-1];
    }

    public int min() {
        return min;
    }
}
