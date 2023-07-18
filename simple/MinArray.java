package simple;

public class MinArray {

    public static void main(String[] args) {
        System.out.println(minArray(new int[]{1,3,5}));
    }
    public static int minArray(int[] numbers) {
        int min=numbers[0];
        for (int i = numbers.length-1; i>0 ; i--) {
            if (numbers[i-1]>numbers[i])min=numbers[i];
        }
        return min;
    }
}
