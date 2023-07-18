package simple;

public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(fib(i)+"\t");
        }
    }
    public static int fib(int n) {
        if (n<2) return n;
        int p,q=0,r=1;
        for (int i = 2; i <=n; i++) {
            p=q;
            q=r;
            r=(p+q)%1000000007;
        }
        return r;
    }

}
