package simple;

public class HammingWeight {

    public static void main(String[] args) {
        System.out.println(hammingWeight(10));
    }
    public static int hammingWeight(int n) {
        int res=0;
        while (n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }

}
