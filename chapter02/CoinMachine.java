import java.util.Scanner;

public class CoinMachine {

    public static void main (String []args){
        System.out.println("Please enter the amount of money:");
        double amount = new Scanner(System.in).nextDouble();
        //without that double will lead to error 
        double cent = amount * 100;
        int cents = (int) cent;
        System.out.printf("%d x 2 € \n", cents/200);
        cents = cents % 200;

        System.out.printf("%d x 1 € \n", cents/100);
        cents = cents % 100;

        System.out.printf("%d x 50 Cent \n",cents/50);
        cents = cents % 50;
        System.out.printf("%d x 20 Cent  \n",cents/20);
        cents = cents % 20;
        System.out.printf("%d x 10 Cent \n",cents/10);
        cents = cents % 10;
        System.out.printf("%d x  5 Cent \n",cents/5);
        cents = cents % 5;
        System.out.printf("%d x  2 Cent \n",cents/2);
        cents = cents % 2;
        System.out.printf("%d x  1 Cent \n",cents/1);
    }
}
