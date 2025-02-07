public class variable {

    public static void main (String [] args) {
        long x = 1000000;
        //overflow
        long result = x*x;
        System.out.printf("Result: " + result);
    }
}