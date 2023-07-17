package simple;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(myIsPalindrome("aa"));
    }

    public static boolean myIsPalindrome(String s) {
        ArrayList<Character> chars=new ArrayList<Character>();
        s=s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c>='0'&&c<='9')||(c>='A'&&c<='Z')) chars.add(c);
        }
        if (chars.size()==0) return true;
        int i=0;
        int j=chars.size()-1;
        do {
            if (chars.get(i)!=chars.get(j)) return false;
            i++;
            j--;
        }while (i<chars.size()/2);
        return true;
    }

    //标准答案
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (!isP(s.charAt(l))) {
                l++;
                continue;
            }
            if (!isP(s.charAt(r))) {
                r--;
                continue;
            }
            if (s.charAt(l) != s.charAt(r) && (s.charAt(l) ^ 32) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isP(char c){
        int val = c - '0';
        if(val >= 0 && val <= 9) return true;
        val = c - 'A';
        if(val >= 0 && val < 26) return true;
        val = c - 'a';
        if(val >= 0 && val < 26) return true;
        return false;
    }

}
