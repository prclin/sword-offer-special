package simple;

public class NumWays {


    public static void main(String[] args) {
        System.out.println(numWays(44));
    }
    public static int numWays(int n) {
        if (n<2) return 1;
        int p=1,q=1,r=0;
        for (int i = 2; i <=n; i++) {
            r=(p+q)%1000000007;
            p=q;
            q=r;
        }
        return r;
    }

}
