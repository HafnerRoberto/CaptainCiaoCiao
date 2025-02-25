public class BuildHtml {

    static String strong (String strong){
        return "<strong>" + strong + "</strong>";
    }

    static String emphaszied(String emph){
        //
        return "<em>" + emph +"</em>";
    }

    static String htmlElement(String tag, String body){
        // if tag is null or leer only body
        if (tag == null && body == null){
            return "";
        } else if (tag == null || tag.isEmpty()) {
            return body;
        } else {
            return strong(emphaszied(body));
        }
        // if body == null -> ""
        
    }

    public static void main(String[] args) {
        String tag = "b";
        String body = "text";
        String result = htmlElement(tag, body);
        System.out.println(result);
    }
}
