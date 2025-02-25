public class BuildHtml {

    static String strong (String body){
        return htmlElement("strong", body );
    }

    static String emphasized(String body){
        //
        return htmlElement("em", body);
    }

    static String htmlElement(String tag, String body){
        // if tag is null or leer only body
        if (tag == null){
            tag = "";
        }
        if (body == null){
            body ="";
        }
        if (tag.isEmpty()){
            return body;
        } else{
            return "<" + tag + ">" + body + "</" + tag + ">";
        }
        // if body == null -> ""

    }

    public static void main(String[] args) {
        System.out.println( htmlElement( "strong", "strong is bold" ) );
        System.out.println( strong( emphasized( "strong + emphasized" ) ) ); //only for strong and emphasized
        System.out.println( htmlElement( "span", null ) );
        System.out.println( htmlElement( "", "no" ) );
        System.out.println( htmlElement( null, "not bold" ) );
        System.out.println( htmlElement( null, null ) );
    }
}
