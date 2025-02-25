public class StringFiller {

    static String mix(String text, String filler){
        if (text == null || text.isEmpty())
            return "";

        if(filler == null || filler.isEmpty()){
            return text;
        }

        String mixed = "";
        for (int i = 0; i < text.length() -1; i++){
            char insert = text.charAt(i);
            mixed += insert + filler;
        }
        return mixed += text.charAt(text.length() -1);
    }

    public static void main(String[] args) {
        System.out.println(mix("We are out of rum!","-"));
        System.out.println(mix("W","-"));
        System.out.println(mix("Blimey","\uD83D\uDC7B" ));
        System.out.println(mix("\uD83D\uDC7B","\uD83D\uDC7B"));
        System.out.println(mix("","\uD83D\uDC7B"));
        System.out.println( mix( "HI", "!!" ) );
        System.out.println( mix( "*", "!!" ) );
        System.out.println( mix( "", "!!" ) );
    }
}
