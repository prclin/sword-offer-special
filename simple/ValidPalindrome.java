package simple;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.myValidPalindrome("abc"));
    }
    public boolean myValidPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        do {
            if (s.charAt(i)!=s.charAt(j)) return myValidPalindrome(s,i+1,j)||myValidPalindrome(s,i,j-1);
            i++;
            j--;
        }while (i<s.length()/2);
        return true;
    }

    public boolean myValidPalindrome(String s,int start,int end) {
        do{
            if (s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }while (start<end);
        return true;
    }

}
