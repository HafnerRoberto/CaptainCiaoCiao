import java.util.Scanner;

public class Input {

    public static void main ( String [] args){
        System.out.print("Koordintation or cx needed: ");
        int x = new Scanner(System.in).nextInt();
        System.out.print("Koordintation or cy needed: ");

        int y = new Scanner(System.in).nextInt();
        //double r = 10 + Math.random() * 20;
        double random = Math.random() * (20 - 10) + 10;
        printXXX(x, y, random);
    }

    public static void printXXX(int x, int y, double r) {
        System.out.printf("<svg height= '100' width= '1000'> \n" +
                " <circle cx='%d' cy='%d' r='%2f'/> \n" +
                "</svg>", x,y,r);
    }

}
