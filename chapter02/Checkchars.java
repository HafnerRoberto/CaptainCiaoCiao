import java.util.Objects;
import java.util.Scanner;

public class Checkchars {
    public static void main (String [] args) {
        String input = new Scanner(System.in).nextLine();

        switch (input) {
            case "Ay":
            case "Ay, ay":
            case "Ei,Ei":
            case "yes":
            case "ja":
                System.out.print("Bla");
                break;
            default:
                System.out.print("else");
        }


    }
}
