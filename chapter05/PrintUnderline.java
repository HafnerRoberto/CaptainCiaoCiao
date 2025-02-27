public class PrintUnderline {
    static void printUnderline(String string, String search){
        System.out.println(string);
        string = string.toLowerCase();
        search = search.toLowerCase();

        String secondline = "";
        //If not found condition is false - why search.length
         for (int index = 0;( index = string.indexOf(search, index)) >= 0; index += search.length()){

             for (int j = secondline.length(); j < index; j++) {
                 secondline += " ";
             }
             for (int k = 0; k < search.length(); k++) {
                 secondline += "_";
             }

         }
        System.out.println(secondline);
    }

    public static void main(String[] args) {
        String underline = "There is more treasure in books than in all the pirates loot on Treasure Treasure Treasure Island";
        printUnderline(underline, "treasure");
    }
}
