public class YXswapper {

    static void printSwapped (String string){
        if (string == null) throw new NullPointerException();
        //errors tried with replace -> new string - only printing needed -> chararray better and new String
        // use lambda
        for (int i = 0; i < string.length();i++){
            switch (string.charAt(i)){
                case 'z'-> System.out.print('y');
                case 'y'-> System.out.print('z');
                case 'Z'-> System.out.print('Y');
                case 'Y'-> System.out.print('Z');
                default -> System.out.print(string.charAt(i));
            }
        }

    }
    public static void main(String[] args) {
        printSwapped("yootaxz");
        printSwapped("Yanthoxzl");
    }
}
