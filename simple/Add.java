package simple;

public class Add {

    public static void main(String[] args) {
        Add add = new Add();

        System.out.println(add.add(1,1));
    }
    public int add(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
