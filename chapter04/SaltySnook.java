public class SaltySnook {
    static final String STRINGTOCHECK = "MOS";

    public static boolean isProbablyApproaching(String [] signs){
        //check input is correct
        if (signs == null) throw new NullPointerException("input");
        for (int i = 0; i < signs.length; i++){
            if (signs[i] == null) throw new NullPointerException("input");
        }
        //compare
        for (int i = 0; i < signs.length; i++){
            if(signs[i].equals(STRINGTOCHECK)){
                int elements = 1;
                for (int j = i + 1; j < i + 4; j++){
                    if(signs[j].equals(STRINGTOCHECK)){
                        elements++;
                    }
                }
                if(elements == 4){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String [] signs = {"F", "DO", "MOS","MOS","MOS","MOS", "WES"};
        String [] signs1 = {"F", "DO", "MOS", "MOS", "WES","MOS", "MOS"};
        String [] signs2 = null;
        String [] signs3 = {"F", null, "MOS", "MOS", "WES","MOS", "MOS"};
        try {
            System.out.print(isProbablyApproaching(signs));
            System.out.print("\n");
            System.out.print(isProbablyApproaching(signs1));
            System.out.print("\n");
            System.out.print(isProbablyApproaching(signs2));
            System.out.print("\n");
            System.out.print(isProbablyApproaching(signs3));
        } catch (Exception e) {
            System.out.print("Input is null");
        }
    }
}
