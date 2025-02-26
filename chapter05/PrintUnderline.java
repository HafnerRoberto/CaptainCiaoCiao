public class PrintUnderline {
    static void printUnderline(String string, String search){
        System.out.println(string);
        string = string.toLowerCase();
        search = search.toLowerCase();

        int before, index = 0;
         for (int i = 0; string.indexOf(search, index + 1) <= -1;){
             for (int j = 0; j < ; j++) {
                 System.out.print(' ');
             }
             for (int k = 0; k < search.length(); k++) {
                 System.out.print('_');
             }
             before = index;

         }

    }

    public static void main(String[] args) {
        String underline = "There is more treasure in books than in all the pirates loot on Treasure Treasure Treasure Island";
        printUnderline(underline, "treasure");
    }
}
