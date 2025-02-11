import java.util.Scanner;

public class Payday {
    public static void main (String [] args){
        double input = new Scanner(System.in).nextDouble();
        //1000 is 100%
        double cost = 1000;
        double rate = (cost / 100) * input;
        if((rate >= 10) && (rate >= 20)){
           System.out.print("Good boy");
        }else {
            System.out.print("Bad boy");
        }

    }
}
