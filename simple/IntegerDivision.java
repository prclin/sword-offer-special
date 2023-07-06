package simple;

public class IntegerDivision {

    public static void main(String[] args) {
        System.out.println(divide(-1,-1));
    }
    public static int divide(int a, int b) {
        int LIMIT = Integer.MIN_VALUE >> 1;
        if(a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE; //溢出，特判
        boolean neg = (a^b)>=0;
        if(a > 0) a = -a;
        if(b > 0) b = -b;
        int ans = 0;
        while(a <= b) {
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
