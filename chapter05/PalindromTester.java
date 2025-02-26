import java.sql.Array;

public class PalindromTester {

    static boolean isPalindrome(String s){
        if(s == null || s.isEmpty()){
            return false;
        }
        //another solution and faster will be only check half of String and compare char by char
        char[] switched = new char[s.length()];
        int neg = s.length() - 1;
        for (int i = 0; i < s.length();i++ ){
            switched[i] = s.charAt(neg);
            neg--;
        }
        return s.equals(new String(switched));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Otto"));
        System.out.println(isPalindrome("121"));
        System.out.println(isPalindrome("otto"));

    }
}
