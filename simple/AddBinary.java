package simple;

import java.util.Arrays;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(myAddBinary("1","10"));
    }
    public static String myAddBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int[] aa = Arrays.stream(a.split("")).mapToInt(Integer::parseInt).toArray();
        int[] ba=  Arrays.stream(b.split("")).mapToInt(Integer::parseInt).toArray();
        int al=aa.length-1;
        int bl=ba.length-1;
        int sum=0;
        int step=0;
        while (al>=0&&bl>=0){
            sum= aa[al]+ba[bl]+step;
           if (sum<2) {
               sb.append(sum);
               step=0;
           }
           else {
               sum-=2;
               step=1;
               sb.append(sum);
           }
           al--;
           bl--;
        }
        while (al>=0){
            sum=aa[al]+step;
            if (sum<2) {
                sb.append(sum);
                step=0;
            }else {
                sum-=2;
                step=1;
                sb.append(sum);
            }
            al--;
        }
        while (bl>=0){
            sum=ba[bl]+step;
            if (sum<2) {
                sb.append(sum);
                step=0;
            }else {
                sum-=2;
                step=1;
                sb.append(sum);
            }
            bl--;
        }
        if (step!=0)  sb.append(step);
        return sb.reverse().toString();
    }

    //标准答案
    public String addBinary(String a, String b) {

        int lenA = a.length();
        int lenB = b.length();

        if(lenA < lenB){
            return addBinary(b, a);
        }

        char c[] = new char[lenA + 1];
        int count = 1;
        int over = 0;

        while(count <= lenA && count <= lenB){
            char cA = a.charAt(lenA - count);
            char cB = b.charAt(lenB - count);
            int cur = cA - '0' + cB - '0' + over;
            c[lenA + 1 - count] = (char)(cur % 2 + '0');
            over = cur / 2;
            count++;
        }

        while(count <= lenA){
            char cA = a.charAt(lenA- count);
            int cur = cA - '0' + over;
            c[lenA + 1 - count] = (char)(cur % 2 + '0');
            over = cur / 2;
            count++;
        }

        if(over != 0){
            c[0] = '1';
            return new String(c);
        }
        else{
            return new String(c, 1, lenA);
        }
    }
}
