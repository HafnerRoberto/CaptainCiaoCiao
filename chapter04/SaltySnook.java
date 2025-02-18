public class SaltySnook {
    static final String STRINGTOCHECK = "MOS";

    public static boolean isProbablyApproaching(String [] signs){
        //check input is correct
        if (signs == null || signs.length < 4){
            return false;
        }
        //compare
        int count = 1;
        for (int i = 0; i < signs.length - 1; i++){
            if (signs[i] == null){ return false; }
            if(signs[i].equals(STRINGTOCHECK) && signs[i +1].equals(STRINGTOCHECK) ){
                count++;
            } else{
               // count--;
            }
            if(count == 4){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String [] signs = {"F", "DO", "MOS","MOS","MOS","MOS", "WES"};
        String [] signs1 = {"F", "DO", "MOS", "MOS", "WES","MOS", "MOS"};
        String [] signs2 = null;
        String [] signs3 = {"F", null, "MOS", "MOS", "WES","MOS", "MOS"};

        System.out.print(isProbablyApproaching(signs));
        System.out.print("\n");
        System.out.print(isProbablyApproaching(signs1));
        System.out.print("\n");
        System.out.print(isProbablyApproaching(signs2));
        System.out.print("\n");
        System.out.print(isProbablyApproaching(signs3));

    }
}
