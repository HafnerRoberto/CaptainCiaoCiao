import java.util.Scanner;

public class Liter {
    public static void main (String []args){
        System.out.print("Enter quantity in liter: ");
        double input = new Scanner(System.in).nextDouble();

        //l
        if (input >= 1.0 ){
            System.out.printf("%d l",(long) input);
        }// cl
        else if (input >= 0.1){
            System.out.printf("%d cl",(long) (input * 100));
            //ml
        } else  if ( input >= 0.01){
            System.out.printf(" %d ml",(long) (input * 1000));
        }  // to small
        else{
            System.out.print("value is too small");
        }
    }
}
