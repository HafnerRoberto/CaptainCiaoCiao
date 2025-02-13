import java.util.Scanner;

public class SimpleChessboard {
    public static void main (String [] main) {
        System.out.print("Checkerboard width: ");
        int width =  new Scanner(System.in).nextInt();
        System.out.print("Checkerboard width: ");
        int height =  new Scanner(System.in).nextInt();
        int lim = height * width;
        //on - off
        for (int i = 1; i <= lim; i++){
            if (i % 2 != 0){
                System.out.print("_");
            } else{
                System.out.print("#");
            }
            if (i % width == 0){
                System.out.print("\n");
            }
        }
    }
}
