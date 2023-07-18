package simple;

public class ReplaceSpace {

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c==' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }

}
