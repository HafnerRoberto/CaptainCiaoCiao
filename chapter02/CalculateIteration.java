public class CalculateIteration {
    public static void main (String [] args){
        double t = Math.random() * 10;
        while(t > 0){
            if (t < 1.0 ) {
                t = t * 2;
                System.out.print(t);
                System.out.print("\n");
            } else
                t--;

        }
    }
}
