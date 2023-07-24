package simple;

public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            sb.append(sb.charAt(0)).deleteCharAt(0);
        }
        return sb.toString();
    }
}
