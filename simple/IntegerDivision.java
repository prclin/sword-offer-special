package simple;

public class IntegerDivision {

    public static void main(String[] args) {
        System.out.println(divide(-1,-1));
    }
    public static int divide(int a, int b) {
        int LIMIT = Integer.MIN_VALUE >> 1;
        if(a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE; //溢出，特判
        //大于等于0同号，小于0异号
        boolean neg = (a^b)>=0;
        //全部转为负数
        if(a > 0) a = -a;
        if(b > 0) b = -b;
        int ans = 0;
        //a<=b进入
        while(a <= b) {
            //记录变量
            int d = b, c = 1;
            while(d >= LIMIT && d + d >= a) {
                d += d;
                c += c;
            }
            a -= d;
            ans += c;
        }
        return neg ? ans : -ans;
    }
}
