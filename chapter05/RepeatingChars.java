public class RepeatingChars {

    static int isEveryCharacterTwice(String input){
        if (input == null) throw new NullPointerException ();
        if(input.length() % 2 != 0){
            return 0;
        }
        for(int i = 0; i < input.length(); i = i + 2){
            if (! (input.charAt(i) == input.charAt(i+1))){
                return -(i + 1);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println( isEveryCharacterTwice( "eehhrrwwüürrddiiggeerr$$ccaappttaaiinn" ) );
        System.out.println( isEveryCharacterTwice( "ccapptttaaiinn" ) );
        System.out.println( isEveryCharacterTwice( "222" ) );
       // System.out.println( isEveryCharacterTwice( null ) );

    }
}
