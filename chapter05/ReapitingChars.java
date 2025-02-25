public class ReapitingChars {

    static int isEveryCharacterTwice(String input){
        if (input == null) throw new NullPointerException ();


        return 1;
    }

    public static void main(String[] args) {
        System.out.println( isEveryCharacterTwice( "eehhrrwwüürrddiiggeerr$$ccaappttaaiinn" ) );
        System.out.println( isEveryCharacterTwice( "ccapptttaaiinn" ) );
        System.out.println( isEveryCharacterTwice( "222" ) );
    }
}
